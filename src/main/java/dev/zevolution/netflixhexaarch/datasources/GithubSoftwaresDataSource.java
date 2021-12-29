package dev.zevolution.netflixhexaarch.datasources;

import dev.zevolution.netflixhexaarch.datasources.services.GithubReposClient;
import dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse;
import dev.zevolution.netflixhexaarch.datasources.services.mapper.SoftwareMapper;
import dev.zevolution.netflixhexaarch.entities.Software;
import dev.zevolution.netflixhexaarch.repositories.SoftwareRepository;
import dev.zevolution.netflixhexaarch.repositories.exceptions.InternalServerErrorException;
import dev.zevolution.netflixhexaarch.repositories.exceptions.NotFoundException;
import feign.FeignException;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@Component
@Primary
public class GithubSoftwaresDataSource implements SoftwareRepository {

    private final GithubReposClient githubReposClient;

    public GithubSoftwaresDataSource(GithubReposClient githubReposClient) {
        this.githubReposClient = githubReposClient;
    }

    @Override
    public Software getSoftwareByAuthorAndSoftwareName(String author, String softwareName) {
        var githubRepo = new GithubRepoResponse();

        try {
            githubRepo = this.githubReposClient.getRepoByOwner(author, softwareName);
        } catch (FeignException e) {
            e.printStackTrace();

            if (NOT_FOUND.value() == e.status()) {
                throw new NotFoundException("The author or software could not be found.");
            }

            throw new InternalServerErrorException();
        }

        return SoftwareMapper.INSTANCE.map(githubRepo);
    }

}
