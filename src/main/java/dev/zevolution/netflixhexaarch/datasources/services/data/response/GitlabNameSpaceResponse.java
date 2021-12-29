package dev.zevolution.netflixhexaarch.datasources.services.data.response;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class GitlabNameSpaceResponse {

    private Integer id;
    private String name;
    private String path;
    private String kind;
    private String fullPath;
    private Integer parentId;
    private String avatarUrl;
    private String webUrl;

    public Integer getId() {
        return id;
    }

    public GitlabNameSpaceResponse setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public GitlabNameSpaceResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getPath() {
        return path;
    }

    public GitlabNameSpaceResponse setPath(String path) {
        this.path = path;
        return this;
    }

    public String getKind() {
        return kind;
    }

    public GitlabNameSpaceResponse setKind(String kind) {
        this.kind = kind;
        return this;
    }

    public String getFullPath() {
        return fullPath;
    }

    public GitlabNameSpaceResponse setFullPath(String fullPath) {
        this.fullPath = fullPath;
        return this;
    }

    public Integer getParentId() {
        return parentId;
    }

    public GitlabNameSpaceResponse setParentId(Integer parentId) {
        this.parentId = parentId;
        return this;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public GitlabNameSpaceResponse setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public GitlabNameSpaceResponse setWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

}
