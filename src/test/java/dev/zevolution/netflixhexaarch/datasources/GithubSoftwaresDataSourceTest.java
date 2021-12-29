package dev.zevolution.netflixhexaarch.datasources;

import dev.zevolution.netflixhexaarch.datasources.services.GithubReposClient;
import dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse;
import dev.zevolution.netflixhexaarch.repositories.exceptions.InternalServerErrorException;
import dev.zevolution.netflixhexaarch.repositories.exceptions.NotFoundException;
import feign.FeignException;
import feign.Request;
import feign.RequestTemplate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.IOException;
import java.util.HashMap;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class GithubSoftwaresDataSourceTest {

    private final GithubReposClient githubReposClient;
    private final GithubSoftwaresDataSource githubSoftwaresDataSource;

    public GithubSoftwaresDataSourceTest() {
        this.githubReposClient = mock(GithubReposClient.class);
        this.githubSoftwaresDataSource = new GithubSoftwaresDataSource(this.githubReposClient);
    }

    @Test
    void shouldReturnSuccessWhenGetSoftwareByAuthorAndSoftwareName() throws IllegalAccessException, IOException {
        var repoName = "Repo 1";
        var starCount = 2;

        var mockObject = new GithubRepoResponse().setName(repoName).setStargazersCount(starCount);

        when(this.githubReposClient.getRepoByOwner(any(), any())).thenReturn(mockObject);

        var dataSourceResponse = this.githubSoftwaresDataSource.getSoftwareByAuthorAndSoftwareName("author", "softwareName");

        assertNotNull(dataSourceResponse);
        assertThat(repoName, equalTo(dataSourceResponse.getName()));
        assertThat(starCount, equalTo(dataSourceResponse.getScore()));
    }

    @Test
    void shouldReturnNotFoundExceptionWhenGetSoftwareByAuthorAndSoftwareName() throws IllegalAccessException, IOException {
        when(this.githubReposClient.getRepoByOwner(any(), any())).thenThrow(this.getErroInternoFeignNotFound());

        assertThrows(NotFoundException.class, () -> {
            this.githubSoftwaresDataSource.getSoftwareByAuthorAndSoftwareName("author", "softwareName");
        });
    }

    @Test
    void shouldReturnInternalServerErrorExceptionWhenGetSoftwareByAuthorAndSoftwareName() throws IllegalAccessException, IOException {
        when(this.githubReposClient.getRepoByOwner(any(), any())).thenThrow(this.getErroInternoFeignInternalServerError());

        assertThrows(InternalServerErrorException.class, () -> {
            this.githubSoftwaresDataSource.getSoftwareByAuthorAndSoftwareName("author", "softwareName");
        });
    }

    private FeignException.InternalServerError getErroInternoFeignInternalServerError() {
        return new FeignException.InternalServerError("Erro interno na aplicação.", this.getFeignRequest(), null);
    }

    private FeignException.NotFound getErroInternoFeignNotFound() {
        return new FeignException.NotFound("Erro Feign NotFound.", this.getFeignRequest(), null);
    }

    private Request getFeignRequest() {
        return Request.create(Request.HttpMethod.GET, "dummy", new HashMap<>(), null , new RequestTemplate());
    }

}