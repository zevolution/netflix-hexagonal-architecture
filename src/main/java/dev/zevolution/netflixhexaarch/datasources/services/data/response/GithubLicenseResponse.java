package dev.zevolution.netflixhexaarch.datasources.services.data.response;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class GithubLicenseResponse {

    private String key;
    private String name;
    private String spdxId;
    private String url;
    private String nodeId;

    public String getKey() {
        return key;
    }

    public GithubLicenseResponse setKey(String key) {
        this.key = key;
        return this;
    }

    public String getName() {
        return name;
    }

    public GithubLicenseResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getSpdxId() {
        return spdxId;
    }

    public GithubLicenseResponse setSpdxId(String spdxId) {
        this.spdxId = spdxId;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public GithubLicenseResponse setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getNodeId() {
        return nodeId;
    }

    public GithubLicenseResponse setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

}
