package dev.zevolution.netflixhexaarch.datasources.services.data.response;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class GitlabUserResponse {

    private Integer id;
    private String username;
    private String name;
    private String state;
    private String avatarUrl;
    private String webUrl;

    public Integer getId() {
        return id;
    }

    public GitlabUserResponse setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public GitlabUserResponse setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getName() {
        return name;
    }

    public GitlabUserResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getState() {
        return state;
    }

    public GitlabUserResponse setState(String state) {
        this.state = state;
        return this;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public GitlabUserResponse setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public GitlabUserResponse setWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

}
