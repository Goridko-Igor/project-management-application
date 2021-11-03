package ru.goridko_igor.dto;

import java.time.LocalDateTime;

public class TaskResponseDto {
    private Long id;
    private Long projectId;
    private Long authorUserId;
    private Long executorUserId;
    private String name;
    private String description;
    private Long statusId;
    private Long taskTypeId;
    private Long releaseVersionId;
    private Long priorityId;
    private LocalDateTime startTime;
    private LocalDateTime completionTime;

    public TaskResponseDto() {

    }

    public TaskResponseDto(
            Long id,
            Long projectId,
            Long authorUserId,
            Long executorUserId,
            String name,
            String description,
            Long statusId,
            Long taskTypeId,
            Long releaseVersionId,
            Long priorityId,
            LocalDateTime startTime,
            LocalDateTime completionTime) {
        this.id = id;
        this.projectId = projectId;
        this.authorUserId = authorUserId;
        this.executorUserId = executorUserId;
        this.name = name;
        this.description = description;
        this.statusId = statusId;
        this.taskTypeId = taskTypeId;
        this.releaseVersionId = releaseVersionId;
        this.priorityId = priorityId;
        this.startTime = startTime;
        this.completionTime = completionTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public Long getAuthorUserId() {
        return authorUserId;
    }

    public void setAuthorUserId(Long authorUserId) {
        this.authorUserId = authorUserId;
    }

    public Long getExecutorUserId() {
        return executorUserId;
    }

    public void setExecutorUserId(Long executorUserId) {
        this.executorUserId = executorUserId;
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

    public Long getStatusId() {
        return statusId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }

    public Long getTaskTypeId() {
        return taskTypeId;
    }

    public void setTaskTypeId(Long taskTypeId) {
        this.taskTypeId = taskTypeId;
    }

    public Long getReleaseVersionId() {
        return releaseVersionId;
    }

    public void setReleaseVersionId(Long releaseVersionId) {
        this.releaseVersionId = releaseVersionId;
    }

    public Long getPriorityId() {
        return priorityId;
    }

    public void setPriorityId(Long priorityId) {
        this.priorityId = priorityId;
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
