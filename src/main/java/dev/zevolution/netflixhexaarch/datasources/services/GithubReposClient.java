package dev.zevolution.netflixhexaarch.datasources.services;

import dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "github-repos", url = "${webservices.github.services.repos}")
public interface GithubReposClient {

    @GetMapping("/{owner}/{repoName}")
    GithubRepoResponse getRepoByOwner(@PathVariable("owner") String owner,
                                      @PathVariable("repoName") String repoName);

}
