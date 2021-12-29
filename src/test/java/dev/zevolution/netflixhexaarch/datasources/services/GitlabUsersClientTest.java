package dev.zevolution.netflixhexaarch.datasources.services;

import com.github.tomakehurst.wiremock.WireMockServer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.wiremock.AutoConfigureWireMock;
import org.springframework.core.io.Resource;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.util.StreamUtils;

import java.io.IOException;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static dev.zevolution.netflixhexaarch.util.CheckNullable.checkIfHasNullAttributeFields;
import static java.nio.charset.StandardCharsets.UTF_8;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.http.HttpHeaders.CONTENT_TYPE;
import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@AutoConfigureWireMock(port = 0)
@TestPropertySource(properties = {"webservices.port=${wiremock.server.port}"})
class GitlabUsersClientTest {

    @Autowired
    private GitlabUsersClient gitlabUsersClient;

    @Autowired
    private WireMockServer mockServer;

    @Value("classpath:restapi/gitlab/payload/response/get-projects-by-name-and-userid.json")
    private Resource projectsByNameAndUserId;

    @Value("classpath:restapi/gitlab/payload/response/get-users-by-username.json")
    private Resource usersByUsername;

    @Test
    void shouldReturnSuccessWhenGetProjectsByNameAndUserId() throws IllegalAccessException, IOException {
        this.setupMockProjectsByNameAndUserId();

        var clientResponse = this.gitlabUsersClient.getProjectsByNameAndUserId("userId", "projectName");

        assertNotNull(clientResponse);
        assertThat(1, equalTo(clientResponse.size()));
        assertFalse(checkIfHasNullAttributeFields(clientResponse.get(0)));
    }

    @Test
    void shouldReturnSuccessWhenGetUsersByUsername() throws IllegalAccessException, IOException {
        this.setupMockUsersByUsername();

        var clientResponse = this.gitlabUsersClient.getUsersByUsername("username");

        assertNotNull(clientResponse);
        assertThat(1, equalTo(clientResponse.size()));
        assertFalse(checkIfHasNullAttributeFields(clientResponse.get(0)));
    }

    private void setupMockProjectsByNameAndUserId() throws IOException {
        String json = StreamUtils.copyToString(this.projectsByNameAndUserId.getInputStream(), UTF_8);

        this.mockServer.stubFor(
                get(urlMatching(".*/users/(.*\\S.*)/projects?(.*)"))
                        .withQueryParam("search", matching("(.*\\S.*)"))
                        .willReturn(
                                aResponse()
                                        .withStatus(OK.value())
                                        .withHeader(CONTENT_TYPE, APPLICATION_JSON_VALUE)
                                        .withBody(json)
                        )
        );
    }

    private void setupMockUsersByUsername() throws IOException {
        String json = StreamUtils.copyToString(this.usersByUsername.getInputStream(), UTF_8);

        this.mockServer.stubFor(
                get(urlMatching(".*/users?(.*)"))
                        .withQueryParam("username", matching("(.*\\S.*)"))
                        .willReturn(
                                aResponse()
                                        .withStatus(OK.value())
                                        .withHeader(CONTENT_TYPE, APPLICATION_JSON_VALUE)
                                        .withBody(json)
                        )
        );
    }

}