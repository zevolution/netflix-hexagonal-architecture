package dev.zevolution.netflixhexaarch.datasources.services.mapper;

import dev.zevolution.netflixhexaarch.datasources.services.data.response.GithubRepoResponse;
import dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabProjectResponse;
import dev.zevolution.netflixhexaarch.datasources.services.data.response.GitlabUserResponse;
import dev.zevolution.netflixhexaarch.entities.Software;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SoftwareMapper {

    SoftwareMapper INSTANCE = Mappers.getMapper(SoftwareMapper.class);

    @Mapping(source = "gitlabProject.name", target = "name")
    @Mapping(source = "gitlabProject.description", target = "description")
    @Mapping(source = "gitlabProject.starCount", target = "score")
    @Mapping(source = "gitlabUser.name", target = "author")
    Software map(GitlabProjectResponse gitlabProject, GitlabUserResponse gitlabUser);

    @Mapping(source = "stargazersCount", target = "score")
    @Mapping(source = "owner.login", target = "author")
    Software map(GithubRepoResponse githubRepo);

}
