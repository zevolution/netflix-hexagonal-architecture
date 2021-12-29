package dev.zevolution.netflixhexaarch.datasources;

import dev.zevolution.netflixhexaarch.datasources.services.GitlabUsersClient;
import dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabUserResponse;
import dev.zevolution.netflixhexaarch.datasources.services.mapper.SoftwareMapper;
import dev.zevolution.netflixhexaarch.entities.Software;
import dev.zevolution.netflixhexaarch.repositories.SoftwareRepository;
import dev.zevolution.netflixhexaarch.repositories.exceptions.NotFoundException;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class GitlabSoftwaresDataSource implements SoftwareRepository {

    private final GitlabUsersClient gitlabUsersClient;
    private final Map<String, GitlabUserResponse> gitlabUserCache;

    public GitlabSoftwaresDataSource(GitlabUsersClient gitlabUsersClient) {
        this.gitlabUsersClient = gitlabUsersClient;
        this.gitlabUserCache = new HashMap<>();
    }

    @Override
    public Software getSoftwareByAuthorAndSoftwareName(String author, String softwareName) {
        var gitlabUser = this.getGitlabUserByUsername(author);
        var gitlabUserId = String.valueOf(gitlabUser.getId());

        var gitlabProject = this.gitlabUsersClient.getProjectsByNameAndUserId(gitlabUserId, softwareName).stream()
                .findFirst()
                .orElseThrow(NotFoundException::new);

        return SoftwareMapper.INSTANCE.map(gitlabProject, gitlabUser);
    }

    private GitlabUserResponse getGitlabUserByUsername(String username) {
        return this.gitlabUserCache.computeIfAbsent(username, value ->
                this.gitlabUsersClient.getUsersByUsername(value).stream()
                    .findFirst()
                    .orElseThrow(NotFoundException::new)
        );
    }

}
