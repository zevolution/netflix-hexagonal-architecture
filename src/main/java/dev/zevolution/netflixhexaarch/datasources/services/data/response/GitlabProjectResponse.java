package dev.zevolution.netflixhexaarch.datasources.services.data.response;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.time.LocalDateTime;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class GitlabProjectResponse {

    private Integer id;
    private String description;
    private String name;
    private String nameWithNamespace;
    private String path;
    private String pathWithNamespace;
    private LocalDateTime createdAt;
    private String defaultBranch;
    private String sshUrlToRepo;
    private String httpUrlToRepo;
    private String webUrl;
    private String readmeUrl;
    private String avatarUrl;
    private Integer forksCount;
    private Integer starCount;
    private LocalDateTime lastActivityAt;
    private GitlabNameSpaceResponse namespace;

    public Integer getId() {
        return id;
    }

    public GitlabProjectResponse setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public GitlabProjectResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getName() {
        return name;
    }

    public GitlabProjectResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getNameWithNamespace() {
        return nameWithNamespace;
    }

    public GitlabProjectResponse setNameWithNamespace(String nameWithNamespace) {
        this.nameWithNamespace = nameWithNamespace;
        return this;
    }

    public String getPath() {
        return path;
    }

    public GitlabProjectResponse setPath(String path) {
        this.path = path;
        return this;
    }

    public String getPathWithNamespace() {
        return pathWithNamespace;
    }

    public GitlabProjectResponse setPathWithNamespace(String pathWithNamespace) {
        this.pathWithNamespace = pathWithNamespace;
        return this;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public GitlabProjectResponse setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getDefaultBranch() {
        return defaultBranch;
    }

    public GitlabProjectResponse setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
        return this;
    }

    public String getSshUrlToRepo() {
        return sshUrlToRepo;
    }

    public GitlabProjectResponse setSshUrlToRepo(String sshUrlToRepo) {
        this.sshUrlToRepo = sshUrlToRepo;
        return this;
    }

    public String getHttpUrlToRepo() {
        return httpUrlToRepo;
    }

    public GitlabProjectResponse setHttpUrlToRepo(String httpUrlToRepo) {
        this.httpUrlToRepo = httpUrlToRepo;
        return this;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public GitlabProjectResponse setWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    public String getReadmeUrl() {
        return readmeUrl;
    }

    public GitlabProjectResponse setReadmeUrl(String readmeUrl) {
        this.readmeUrl = readmeUrl;
        return this;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public GitlabProjectResponse setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }

    public Integer getForksCount() {
        return forksCount;
    }

    public GitlabProjectResponse setForksCount(Integer forksCount) {
        this.forksCount = forksCount;
        return this;
    }

    public Integer getStarCount() {
        return starCount;
    }

    public GitlabProjectResponse setStarCount(Integer starCount) {
        this.starCount = starCount;
        return this;
    }

    public LocalDateTime getLastActivityAt() {
        return lastActivityAt;
    }

    public GitlabProjectResponse setLastActivityAt(LocalDateTime lastActivityAt) {
        this.lastActivityAt = lastActivityAt;
        return this;
    }

    public GitlabNameSpaceResponse getNamespace() {
        return namespace;
    }

    public GitlabProjectResponse setNamespace(GitlabNameSpaceResponse namespace) {
        this.namespace = namespace;
        return this;
    }
}
