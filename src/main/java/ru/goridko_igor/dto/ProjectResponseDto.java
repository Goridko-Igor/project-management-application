package ru.goridko_igor.dto;

import ru.goridko_igor.entity.ProjectParticipantEntity;
import ru.goridko_igor.entity.ReleaseVersionEntity;
import ru.goridko_igor.entity.StatusEntity;
import ru.goridko_igor.entity.TaskEntity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

public class ProjectResponseDto {
    private Long id;
    private String name;
    private String text;
    private LocalDateTime creationTime;
    private Boolean isPaid;
    private StatusEntity status;
    private Set<ProjectParticipantEntity> projectParticipants;
    private List<TaskEntity> tasks;
    private List<ReleaseVersionEntity> releaseVersions;

    public ProjectResponseDto() {

    }

    public ProjectResponseDto(
            Long id,
            String name,
            String text,
            LocalDateTime creationTime,
            Boolean isPaid,
            StatusEntity status,
            Set<ProjectParticipantEntity> projectParticipants,
            List<TaskEntity> tasks,
            List<ReleaseVersionEntity> releaseVersions) {
        this.id = id;
        this.name = name;
        this.text = text;
        this.creationTime = creationTime;
        this.isPaid = isPaid;
        this.status = status;
        this.projectParticipants = projectParticipants;
        this.tasks = tasks;
        this.releaseVersions = releaseVersions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public Boolean getPaid() {
        return isPaid;
    }

    public void setPaid(Boolean paid) {
        isPaid = paid;
    }

    public StatusEntity getStatus() {
        return status;
    }

    public void setStatus(StatusEntity status) {
        this.status = status;
    }

    public Set<ProjectParticipantEntity> getProjectParticipants() {
        return projectParticipants;
    }

    public void setProjectParticipants(Set<ProjectParticipantEntity> projectParticipants) {
        this.projectParticipants = projectParticipants;
    }

    public List<TaskEntity> getTasks() {
        return tasks;
    }

    public void setTasks(List<TaskEntity> tasks) {
        this.tasks = tasks;
    }

    public List<ReleaseVersionEntity> getReleaseVersions() {
        return releaseVersions;
    }

    public void setReleaseVersions(List<ReleaseVersionEntity> releaseVersions) {
        this.releaseVersions = releaseVersions;
    }
}
