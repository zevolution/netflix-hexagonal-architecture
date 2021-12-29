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
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.http.HttpHeaders.CONTENT_TYPE;
import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@SpringBootTest
@ExtendWith(SpringExtension.class)
@AutoConfigureWireMock(port = 0)
@TestPropertySource(properties = {"webservices.port=${wiremock.server.port}"})
class GithubReposClientTest {

    @Autowired
    private GithubReposClient githubReposClient;

    @Autowired
    private WireMockServer mockServer;

    @Value("classpath:restapi/github/payload/response/get-repo-by-owner.json")
    private Resource repoByOwnerResource;

    @Test
    void shouldReturnSuccessWhenGetRepoByOwner() throws IllegalAccessException, IOException {
        this.setupMockRepoByOwner();

        var githubRepo = this.githubReposClient.getRepoByOwner("owner", "repoName");

        assertNotNull(githubRepo);
        assertNotNull(githubRepo.getId());
        assertFalse(checkIfHasNullAttributeFields(githubRepo));

    }

    private void setupMockRepoByOwner() throws IOException {
        String json = StreamUtils.copyToString(this.repoByOwnerResource.getInputStream(), UTF_8);

        this.mockServer.stubFor(
                get(urlMatching(".*/repos/(.*\\S.*)/(.*\\S.*)"))
                        .willReturn(
                                aResponse()
                                        .withStatus(OK.value())
                                        .withHeader(CONTENT_TYPE, APPLICATION_JSON_VALUE)
                                        .withBody(json)
                )
        );
    }

}