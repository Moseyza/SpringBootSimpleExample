package com.example.injection.models;

import com.google.gson.annotations.SerializedName;
import jdk.jfr.DataAmount;
import lombok.Data;

import java.util.List;
public @Data
class GithubRepository {
    @SerializedName("id")
    private Integer id;
    @SerializedName("node_id")
    private String nodeId;
    @SerializedName("name")
    private String name;
    @SerializedName("full_name")
    private String fullName;
    @SerializedName("private")
    private Boolean _private;
    //@SerializedName("owner")
    //private Owner owner;
    @SerializedName("html_url")
    private String htmlUrl;
    @SerializedName("description")
    private String description;
    @SerializedName("fork")
    private Boolean fork;
    @SerializedName("url")
    private String url;
    @SerializedName("forks_url")
    private String forksUrl;
    @SerializedName("keys_url")
    private String keysUrl;
    @SerializedName("collaborators_url")
    private String collaboratorsUrl;
    @SerializedName("teams_url")
    private String teamsUrl;
    @SerializedName("hooks_url")
    private String hooksUrl;
    @SerializedName("issue_events_url")
    private String issueEventsUrl;
    @SerializedName("events_url")
    private String eventsUrl;
    @SerializedName("assignees_url")
    private String assigneesUrl;
    @SerializedName("branches_url")
    private String branchesUrl;
    @SerializedName("tags_url")
    private String tagsUrl;
    @SerializedName("blobs_url")
    private String blobsUrl;
    @SerializedName("git_tags_url")
    private String gitTagsUrl;
    @SerializedName("git_refs_url")
    private String gitRefsUrl;
    @SerializedName("trees_url")
    private String treesUrl;
    @SerializedName("statuses_url")
    private String statusesUrl;
    @SerializedName("languages_url")
    private String languagesUrl;
    @SerializedName("stargazers_url")
    private String stargazersUrl;
    @SerializedName("contributors_url")
    private String contributorsUrl;
    @SerializedName("subscribers_url")
    private String subscribersUrl;
    @SerializedName("subscription_url")
    private String subscriptionUrl;
    @SerializedName("commits_url")
    private String commitsUrl;
    @SerializedName("git_commits_url")
    private String gitCommitsUrl;
    @SerializedName("comments_url")
    private String commentsUrl;
    @SerializedName("issue_comment_url")
    private String issueCommentUrl;
    @SerializedName("contents_url")
    private String contentsUrl;
    @SerializedName("compare_url")
    private String compareUrl;
    @SerializedName("merges_url")
    private String mergesUrl;
    @SerializedName("archive_url")
    private String archiveUrl;
    @SerializedName("downloads_url")
    private String downloadsUrl;
    @SerializedName("issues_url")
    private String issuesUrl;
    @SerializedName("pulls_url")
    private String pullsUrl;
    @SerializedName("milestones_url")
    private String milestonesUrl;
    @SerializedName("notifications_url")
    private String notificationsUrl;
    @SerializedName("labels_url")
    private String labelsUrl;
    @SerializedName("releases_url")
    private String releasesUrl;
    @SerializedName("deployments_url")
    private String deploymentsUrl;
    @SerializedName("created_at")
    private String createdAt;
    @SerializedName("updated_at")
    private String updatedAt;
    @SerializedName("pushed_at")
    private String pushedAt;
    @SerializedName("git_url")
    private String gitUrl;
    @SerializedName("ssh_url")
    private String sshUrl;
    @SerializedName("clone_url")
    private String cloneUrl;
    @SerializedName("svn_url")
    private String svnUrl;
    @SerializedName("homepage")
    private Object homepage;
    @SerializedName("size")
    private Integer size;
    @SerializedName("stargazers_count")
    private Integer stargazersCount;
    @SerializedName("watchers_count")
    private Integer watchersCount;
    @SerializedName("language")
    private Object language;
    @SerializedName("has_issues")
    private Boolean hasIssues;
    @SerializedName("has_projects")
    private Boolean hasProjects;
    @SerializedName("has_downloads")
    private Boolean hasDownloads;
    @SerializedName("has_wiki")
    private Boolean hasWiki;
    @SerializedName("has_pages")
    private Boolean hasPages;
    @SerializedName("has_discussions")
    private Boolean hasDiscussions;
    @SerializedName("forks_count")
    private Integer forksCount;
    @SerializedName("mirror_url")
    private Object mirrorUrl;
    @SerializedName("archived")
    private Boolean archived;
    @SerializedName("disabled")
    private Boolean disabled;
    @SerializedName("open_issues_count")
    private Integer openIssuesCount;
    @SerializedName("license")
    private Object license;
    @SerializedName("allow_forking")
    private Boolean allowForking;
    @SerializedName("is_template")
    private Boolean isTemplate;
    @SerializedName("web_commit_signoff_required")
    private Boolean webCommitSignoffRequired;
    @SerializedName("topics")
    private List<Object> topics;
    @SerializedName("visibility")
    private String visibility;
    @SerializedName("forks")
    private Integer forks;
    @SerializedName("open_issues")
    private Integer openIssues;
    @SerializedName("watchers")
    private Integer watchers;
    @SerializedName("default_branch")
    private String defaultBranch;
}
