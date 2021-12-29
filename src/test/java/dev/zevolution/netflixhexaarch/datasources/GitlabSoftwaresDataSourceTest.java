package dev.zevolution.netflixhexaarch.datasources;

import dev.zevolution.netflixhexaarch.datasources.services.GitlabUsersClient;
import dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse;
import dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabUserResponse;
import dev.zevolution.netflixhexaarch.repositories.exceptions.NotFoundException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.IOException;
import java.util.ArrayList;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class GitlabSoftwaresDataSourceTest {

    private final GitlabUsersClient gitlabUsersClient;
    private final GitlabSoftwaresDataSource gitlabSoftwaresDataSource;

    public GitlabSoftwaresDataSourceTest() {
        this.gitlabUsersClient = mock(GitlabUsersClient.class);
        this.gitlabSoftwaresDataSource = new GitlabSoftwaresDataSource(this.gitlabUsersClient);
    }

    @Test
    void shouldReturnSuccessWhenGetSoftwareByAuthorAndSoftwareName() throws IllegalAccessException, IOException {
        var repoName = "Repo 1";
        var starCount = 2;
        var mockObject = new GitlabProjectResponse().setName(repoName).setStarCount(starCount);
        var mockList = asList(mockObject);
        when(this.gitlabUsersClient.getProjectsByNameAndUserId(any(), any())).thenReturn(mockList);

        var fullUserName = "Full name of user";
        var userMockObject = new GitlabUserResponse().setName(fullUserName);
        var userMockList = asList(userMockObject);
        when(this.gitlabUsersClient.getUsersByUsername(any())).thenReturn(userMockList);

        var dataSourceResponse = this.gitlabSoftwaresDataSource.getSoftwareByAuthorAndSoftwareName("author", "softwareName");

        assertNotNull(dataSourceResponse);
        assertThat(repoName, equalTo(dataSourceResponse.getName()));
        assertThat(starCount, equalTo(dataSourceResponse.getScore()));
        assertThat(fullUserName, equalTo(dataSourceResponse.getAuthor()));
    }

    @Test
    void shouldReturnNotFoundExceptionWhenUserNotFoundInGetSoftwareByAuthorAndSoftwareName() throws IllegalAccessException, IOException {
        when(this.gitlabUsersClient.getUsersByUsername(any())).thenReturn(new ArrayList<>());

        assertThrows(NotFoundException.class, () -> {
            this.gitlabSoftwaresDataSource.getSoftwareByAuthorAndSoftwareName("author", "softwareName");
        });
    }

    @Test
    void shouldReturnNotFoundExceptionWhenProjectNotFoundInGetSoftwareByAuthorAndSoftwareName() throws IllegalAccessException, IOException {
        when(this.gitlabUsersClient.getProjectsByNameAndUserId(any(), any())).thenReturn(new ArrayList<>());

        assertThrows(NotFoundException.class, () -> {
            this.gitlabSoftwaresDataSource.getSoftwareByAuthorAndSoftwareName("author", "softwareName");
        });
    }


}