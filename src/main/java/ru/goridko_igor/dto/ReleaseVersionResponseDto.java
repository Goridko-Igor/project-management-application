package ru.goridko_igor.dto;

import java.time.LocalDateTime;

public class ReleaseVersionResponseDto {
    private Long id;
    private Long projectId;
    private String name;
    private String description;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public ReleaseVersionResponseDto() {

    }

    public ReleaseVersionResponseDto(
            Long id,
            Long projectId,
            String name,
            String description,
            LocalDateTime startTime,
            LocalDateTime endTime) {
        this.id = id;
        this.projectId = projectId;
        this.name = name;
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
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

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
}
