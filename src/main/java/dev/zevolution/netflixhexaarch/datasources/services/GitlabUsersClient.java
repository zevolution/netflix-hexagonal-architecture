package dev.zevolution.netflixhexaarch.datasources.services;

import dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse;
import dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabUserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "gitlab-users", url = "${webservices.gitlab.services.users}")
public interface GitlabUsersClient {

    @GetMapping("/{userId}/projects")
    List<GitlabProjectResponse> getProjectsByNameAndUserId(@PathVariable("userId") String userId,
                                                           @RequestParam("search") String projectName);

    @GetMapping
    List<GitlabUserResponse> getUsersByUsername(@RequestParam("username") String username);

}
