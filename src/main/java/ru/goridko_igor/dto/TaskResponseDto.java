package ru.goridko_igor.dto;

import java.time.LocalDateTime;

public class TaskResponseDto {
    private Long id;
    private ProjectResponseDto project;
    private UserResponseDto authorUser;
    private UserResponseDto executorUser;
    private String name;
    private String description;
    private StatusResponseDto status;
    private TaskTypeResponseDto taskType;
    private ReleaseVersionResponseDto releaseVersion;
    private PriorityResponseDto priority;
    private LocalDateTime startTime;
    private LocalDateTime completionTime;

    public TaskResponseDto() {

    }

    public TaskResponseDto(
            Long id,
            ProjectResponseDto project,
            UserResponseDto authorUser,
            UserResponseDto executorUser,
            String name,
            String description,
            StatusResponseDto status,
            TaskTypeResponseDto taskType,
            ReleaseVersionResponseDto releaseVersion,
            PriorityResponseDto priority,
            LocalDateTime startTime,
            LocalDateTime completionTime) {
        this.id = id;
        this.project = project;
        this.authorUser = authorUser;
        this.executorUser = executorUser;
        this.name = name;
        this.description = description;
        this.status = status;
        this.taskType = taskType;
        this.releaseVersion = releaseVersion;
        this.priority = priority;
        this.startTime = startTime;
        this.completionTime = completionTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ProjectResponseDto getProject() {
        return project;
    }

    public void setProject(ProjectResponseDto project) {
        this.project = project;
    }

    public UserResponseDto getAuthorUser() {
        return authorUser;
    }

    public void setAuthorUser(UserResponseDto authorUser) {
        this.authorUser = authorUser;
    }

    public UserResponseDto getExecutorUser() {
        return executorUser;
    }

    public void setExecutorUser(UserResponseDto executorUser) {
        this.executorUser = executorUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public StatusResponseDto getStatus() {
        return status;
    }

    public void setStatus(StatusResponseDto status) {
        this.status = status;
    }

    public TaskTypeResponseDto getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskTypeResponseDto taskType) {
        this.taskType = taskType;
    }

    public ReleaseVersionResponseDto getReleaseVersion() {
        return releaseVersion;
    }

    public void setReleaseVersion(ReleaseVersionResponseDto releaseVersion) {
        this.releaseVersion = releaseVersion;
    }

    public PriorityResponseDto getPriority() {
        return priority;
    }

    public void setPriority(PriorityResponseDto priority) {
        this.priority = priority;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getCompletionTime() {
        return completionTime;
    }

    public void setCompletionTime(LocalDateTime completionTime) {
        this.completionTime = completionTime;
    }
}
