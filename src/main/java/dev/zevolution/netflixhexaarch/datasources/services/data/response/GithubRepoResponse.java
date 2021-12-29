package dev.zevolution.netflixhexaarch.datasources.services.data.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class GithubRepoResponse {

    private Integer id;
    private String nodeId;
    private String name;
    private String fullName;

    @JsonProperty("private")
    private Boolean _private;

    private GithubOwnerResponse owner;
    private String htmlUrl;
    private String description;
    private Boolean fork;
    private String url;
    private String forksUrl;
    private String keysUrl;
    private String collaboratorsUrl;
    private String teamsUrl;
    private String hooksUrl;
    private String issueEventsUrl;
    private String eventsUrl;
    private String assigneesUrl;
    private String branchesUrl;
    private String tagsUrl;
    private String blobsUrl;
    private String gitTagsUrl;
    private String gitRefsUrl;
    private String treesUrl;
    private String statusesUrl;
    private String languagesUrl;
    private String stargazersUrl;
    private String contributorsUrl;
    private String subscribersUrl;
    private String subscriptionUrl;
    private String commitsUrl;
    private String gitCommitsUrl;
    private String commentsUrl;
    private String issueCommentUrl;
    private String contentsUrl;
    private String compareUrl;
    private String mergesUrl;
    private String archiveUrl;
    private String downloadsUrl;
    private String issuesUrl;
    private String pullsUrl;
    private String milestonesUrl;
    private String notificationsUrl;
    private String labelsUrl;
    private String releasesUrl;
    private String deploymentsUrl;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime pushedAt;
    private String gitUrl;
    private String sshUrl;
    private String cloneUrl;
    private String svnUrl;
    private String homepage;
    private Integer size;
    private Integer stargazersCount;
    private Integer watchersCount;
    private String language;
    private Boolean hasIssues;
    private Boolean hasProjects;
    private Boolean hasDownloads;
    private Boolean hasWiki;
    private Boolean hasPages;
    private Integer forksCount;
    private Boolean archived;
    private Boolean disabled;
    private Integer openIssuesCount;
    private GithubLicenseResponse license;
    private Boolean allowForking;

    @JsonProperty("is_template")
    private Boolean isTemplate;

    private List<String> topics = new ArrayList<>();
    private String visibility;
    private Integer forks;
    private Integer openIssues;
    private Integer watchers;
    private String defaultBranch;
    private Integer networkCount;
    private Integer subscribersCount;

    public Integer getId() {
        return id;
    }

    public GithubRepoResponse setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getNodeId() {
        return nodeId;
    }

    public GithubRepoResponse setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    public String getName() {
        return name;
    }

    public GithubRepoResponse setName(String name) {
        this.name = name;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public GithubRepoResponse setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public Boolean get_private() {
        return _private;
    }

    public GithubRepoResponse set_private(Boolean _private) {
        this._private = _private;
        return this;
    }

    public GithubOwnerResponse getOwner() {
        return owner;
    }

    public GithubRepoResponse setOwner(GithubOwnerResponse owner) {
        this.owner = owner;
        return this;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public GithubRepoResponse setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public GithubRepoResponse setDescription(String description) {
        this.description = description;
        return this;
    }

    public Boolean getFork() {
        return fork;
    }

    public GithubRepoResponse setFork(Boolean fork) {
        this.fork = fork;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public GithubRepoResponse setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getForksUrl() {
        return forksUrl;
    }

    public GithubRepoResponse setForksUrl(String forksUrl) {
        this.forksUrl = forksUrl;
        return this;
    }

    public String getKeysUrl() {
        return keysUrl;
    }

    public GithubRepoResponse setKeysUrl(String keysUrl) {
        this.keysUrl = keysUrl;
        return this;
    }

    public String getCollaboratorsUrl() {
        return collaboratorsUrl;
    }

    public GithubRepoResponse setCollaboratorsUrl(String collaboratorsUrl) {
        this.collaboratorsUrl = collaboratorsUrl;
        return this;
    }

    public String getTeamsUrl() {
        return teamsUrl;
    }

    public GithubRepoResponse setTeamsUrl(String teamsUrl) {
        this.teamsUrl = teamsUrl;
        return this;
    }

    public String getHooksUrl() {
        return hooksUrl;
    }

    public GithubRepoResponse setHooksUrl(String hooksUrl) {
        this.hooksUrl = hooksUrl;
        return this;
    }

    public String getIssueEventsUrl() {
        return issueEventsUrl;
    }

    public GithubRepoResponse setIssueEventsUrl(String issueEventsUrl) {
        this.issueEventsUrl = issueEventsUrl;
        return this;
    }

    public String getEventsUrl() {
        return eventsUrl;
    }

    public GithubRepoResponse setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
        return this;
    }

    public String getAssigneesUrl() {
        return assigneesUrl;
    }

    public GithubRepoResponse setAssigneesUrl(String assigneesUrl) {
        this.assigneesUrl = assigneesUrl;
        return this;
    }

    public String getBranchesUrl() {
        return branchesUrl;
    }

    public GithubRepoResponse setBranchesUrl(String branchesUrl) {
        this.branchesUrl = branchesUrl;
        return this;
    }

    public String getTagsUrl() {
        return tagsUrl;
    }

    public GithubRepoResponse setTagsUrl(String tagsUrl) {
        this.tagsUrl = tagsUrl;
        return this;
    }

    public String getBlobsUrl() {
        return blobsUrl;
    }

    public GithubRepoResponse setBlobsUrl(String blobsUrl) {
        this.blobsUrl = blobsUrl;
        return this;
    }

    public String getGitTagsUrl() {
        return gitTagsUrl;
    }

    public GithubRepoResponse setGitTagsUrl(String gitTagsUrl) {
        this.gitTagsUrl = gitTagsUrl;
        return this;
    }

    public String getGitRefsUrl() {
        return gitRefsUrl;
    }

    public GithubRepoResponse setGitRefsUrl(String gitRefsUrl) {
        this.gitRefsUrl = gitRefsUrl;
        return this;
    }

    public String getTreesUrl() {
        return treesUrl;
    }

    public GithubRepoResponse setTreesUrl(String treesUrl) {
        this.treesUrl = treesUrl;
        return this;
    }

    public String getStatusesUrl() {
        return statusesUrl;
    }

    public GithubRepoResponse setStatusesUrl(String statusesUrl) {
        this.statusesUrl = statusesUrl;
        return this;
    }

    public String getLanguagesUrl() {
        return languagesUrl;
    }

    public GithubRepoResponse setLanguagesUrl(String languagesUrl) {
        this.languagesUrl = languagesUrl;
        return this;
    }

    public String getStargazersUrl() {
        return stargazersUrl;
    }

    public GithubRepoResponse setStargazersUrl(String stargazersUrl) {
        this.stargazersUrl = stargazersUrl;
        return this;
    }

    public String getContributorsUrl() {
        return contributorsUrl;
    }

    public GithubRepoResponse setContributorsUrl(String contributorsUrl) {
        this.contributorsUrl = contributorsUrl;
        return this;
    }

    public String getSubscribersUrl() {
        return subscribersUrl;
    }

    public GithubRepoResponse setSubscribersUrl(String subscribersUrl) {
        this.subscribersUrl = subscribersUrl;
        return this;
    }

    public String getSubscriptionUrl() {
        return subscriptionUrl;
    }

    public GithubRepoResponse setSubscriptionUrl(String subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
        return this;
    }

    public String getCommitsUrl() {
        return commitsUrl;
    }

    public GithubRepoResponse setCommitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
        return this;
    }

    public String getGitCommitsUrl() {
        return gitCommitsUrl;
    }

    public GithubRepoResponse setGitCommitsUrl(String gitCommitsUrl) {
        this.gitCommitsUrl = gitCommitsUrl;
        return this;
    }

    public String getCommentsUrl() {
        return commentsUrl;
    }

    public GithubRepoResponse setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
        return this;
    }

    public String getIssueCommentUrl() {
        return issueCommentUrl;
    }

    public GithubRepoResponse setIssueCommentUrl(String issueCommentUrl) {
        this.issueCommentUrl = issueCommentUrl;
        return this;
    }

    public String getContentsUrl() {
        return contentsUrl;
    }

    public GithubRepoResponse setContentsUrl(String contentsUrl) {
        this.contentsUrl = contentsUrl;
        return this;
    }

    public String getCompareUrl() {
        return compareUrl;
    }

    public GithubRepoResponse setCompareUrl(String compareUrl) {
        this.compareUrl = compareUrl;
        return this;
    }

    public String getMergesUrl() {
        return mergesUrl;
    }

    public GithubRepoResponse setMergesUrl(String mergesUrl) {
        this.mergesUrl = mergesUrl;
        return this;
    }

    public String getArchiveUrl() {
        return archiveUrl;
    }

    public GithubRepoResponse setArchiveUrl(String archiveUrl) {
        this.archiveUrl = archiveUrl;
        return this;
    }

    public String getDownloadsUrl() {
        return downloadsUrl;
    }

    public GithubRepoResponse setDownloadsUrl(String downloadsUrl) {
        this.downloadsUrl = downloadsUrl;
        return this;
    }

    public String getIssuesUrl() {
        return issuesUrl;
    }

    public GithubRepoResponse setIssuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
        return this;
    }

    public String getPullsUrl() {
        return pullsUrl;
    }

    public GithubRepoResponse setPullsUrl(String pullsUrl) {
        this.pullsUrl = pullsUrl;
        return this;
    }

    public String getMilestonesUrl() {
        return milestonesUrl;
    }

    public GithubRepoResponse setMilestonesUrl(String milestonesUrl) {
        this.milestonesUrl = milestonesUrl;
        return this;
    }

    public String getNotificationsUrl() {
        return notificationsUrl;
    }

    public GithubRepoResponse setNotificationsUrl(String notificationsUrl) {
        this.notificationsUrl = notificationsUrl;
        return this;
    }

    public String getLabelsUrl() {
        return labelsUrl;
    }

    public GithubRepoResponse setLabelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
        return this;
    }

    public String getReleasesUrl() {
        return releasesUrl;
    }

    public GithubRepoResponse setReleasesUrl(String releasesUrl) {
        this.releasesUrl = releasesUrl;
        return this;
    }

    public String getDeploymentsUrl() {
        return deploymentsUrl;
    }

    public GithubRepoResponse setDeploymentsUrl(String deploymentsUrl) {
        this.deploymentsUrl = deploymentsUrl;
        return this;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public GithubRepoResponse setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public GithubRepoResponse setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public LocalDateTime getPushedAt() {
        return pushedAt;
    }

    public GithubRepoResponse setPushedAt(LocalDateTime pushedAt) {
        this.pushedAt = pushedAt;
        return this;
    }

    public String getGitUrl() {
        return gitUrl;
    }

    public GithubRepoResponse setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
        return this;
    }

    public String getSshUrl() {
        return sshUrl;
    }

    public GithubRepoResponse setSshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
        return this;
    }

    public String getCloneUrl() {
        return cloneUrl;
    }

    public GithubRepoResponse setCloneUrl(String cloneUrl) {
        this.cloneUrl = cloneUrl;
        return this;
    }

    public String getSvnUrl() {
        return svnUrl;
    }

    public GithubRepoResponse setSvnUrl(String svnUrl) {
        this.svnUrl = svnUrl;
        return this;
    }

    public String getHomepage() {
        return homepage;
    }

    public GithubRepoResponse setHomepage(String homepage) {
        this.homepage = homepage;
        return this;
    }

    public Integer getSize() {
        return size;
    }

    public GithubRepoResponse setSize(Integer size) {
        this.size = size;
        return this;
    }

    public Integer getStargazersCount() {
        return stargazersCount;
    }

    public GithubRepoResponse setStargazersCount(Integer stargazersCount) {
        this.stargazersCount = stargazersCount;
        return this;
    }

    public Integer getWatchersCount() {
        return watchersCount;
    }

    public GithubRepoResponse setWatchersCount(Integer watchersCount) {
        this.watchersCount = watchersCount;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public GithubRepoResponse setLanguage(String language) {
        this.language = language;
        return this;
    }

    public Boolean getHasIssues() {
        return hasIssues;
    }

    public GithubRepoResponse setHasIssues(Boolean hasIssues) {
        this.hasIssues = hasIssues;
        return this;
    }

    public Boolean getHasProjects() {
        return hasProjects;
    }

    public GithubRepoResponse setHasProjects(Boolean hasProjects) {
        this.hasProjects = hasProjects;
        return this;
    }

    public Boolean getHasDownloads() {
        return hasDownloads;
    }

    public GithubRepoResponse setHasDownloads(Boolean hasDownloads) {
        this.hasDownloads = hasDownloads;
        return this;
    }

    public Boolean getHasWiki() {
        return hasWiki;
    }

    public GithubRepoResponse setHasWiki(Boolean hasWiki) {
        this.hasWiki = hasWiki;
        return this;
    }

    public Boolean getHasPages() {
        return hasPages;
    }

    public GithubRepoResponse setHasPages(Boolean hasPages) {
        this.hasPages = hasPages;
        return this;
    }

    public Integer getForksCount() {
        return forksCount;
    }

    public GithubRepoResponse setForksCount(Integer forksCount) {
        this.forksCount = forksCount;
        return this;
    }

    public Boolean getArchived() {
        return archived;
    }

    public GithubRepoResponse setArchived(Boolean archived) {
        this.archived = archived;
        return this;
    }

    public Boolean getDisabled() {
        return disabled;
    }

    public GithubRepoResponse setDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }

    public Integer getOpenIssuesCount() {
        return openIssuesCount;
    }

    public GithubRepoResponse setOpenIssuesCount(Integer openIssuesCount) {
        this.openIssuesCount = openIssuesCount;
        return this;
    }

    public GithubLicenseResponse getLicense() {
        return license;
    }

    public GithubRepoResponse setLicense(GithubLicenseResponse license) {
        this.license = license;
        return this;
    }

    public Boolean getAllowForking() {
        return allowForking;
    }

    public GithubRepoResponse setAllowForking(Boolean allowForking) {
        this.allowForking = allowForking;
        return this;
    }

    public Boolean getTemplate() {
        return isTemplate;
    }

    public GithubRepoResponse setTemplate(Boolean template) {
        isTemplate = template;
        return this;
    }

    public List<String> getTopics() {
        return topics;
    }

    public GithubRepoResponse setTopics(List<String> topics) {
        this.topics = topics;
        return this;
    }

    public String getVisibility() {
        return visibility;
    }

    public GithubRepoResponse setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }

    public Integer getForks() {
        return forks;
    }

    public GithubRepoResponse setForks(Integer forks) {
        this.forks = forks;
        return this;
    }

    public Integer getOpenIssues() {
        return openIssues;
    }

    public GithubRepoResponse setOpenIssues(Integer openIssues) {
        this.openIssues = openIssues;
        return this;
    }

    public Integer getWatchers() {
        return watchers;
    }

    public GithubRepoResponse setWatchers(Integer watchers) {
        this.watchers = watchers;
        return this;
    }

    public String getDefaultBranch() {
        return defaultBranch;
    }

    public GithubRepoResponse setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
        return this;
    }

    public Integer getNetworkCount() {
        return networkCount;
    }

    public GithubRepoResponse setNetworkCount(Integer networkCount) {
        this.networkCount = networkCount;
        return this;
    }

    public Integer getSubscribersCount() {
        return subscribersCount;
    }

    public GithubRepoResponse setSubscribersCount(Integer subscribersCount) {
        this.subscribersCount = subscribersCount;
        return this;
    }

}
