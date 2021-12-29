package dev.zevolution.netflixhexaarch.transportlayers.restapi;

import dev.zevolution.netflixhexaarch.entities.Software;
import dev.zevolution.netflixhexaarch.interactors.GetSoftwareByAuthorAndSoftwareNameUseCase;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.client.match.MockRestRequestMatchers;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class AuthorsApiImplTest {

    private final GetSoftwareByAuthorAndSoftwareNameUseCase getSoftwareByAuthorAndSoftwareNameUseCase;
    private final MockMvc mockMvc;

    public AuthorsApiImplTest() {
        this.getSoftwareByAuthorAndSoftwareNameUseCase = mock(GetSoftwareByAuthorAndSoftwareNameUseCase.class);
        var authorApiImpl = new AuthorsApiImpl(this.getSoftwareByAuthorAndSoftwareNameUseCase);
        this.mockMvc = MockMvcBuilders.standaloneSetup(authorApiImpl).build();
    }

    @Test
    void shouldReturnSuccessHttp200WhenGetSoftwaresByAuthor() throws Exception {
        var authorName = "Software Author";

        var mockObject = new Software().setAuthor(authorName);

        when(this.getSoftwareByAuthorAndSoftwareNameUseCase.execute(any(), any())).thenReturn(mockObject);

        this.mockMvc.perform(
                get("/authors/name/{authorName}/softwares", authorName).contentType(APPLICATION_JSON_VALUE))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeCompatibleWith(APPLICATION_JSON_VALUE))
                .andExpect(jsonPath("$..author").value(authorName));
    }

}