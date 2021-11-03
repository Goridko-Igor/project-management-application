package ru.goridko_igor.dto;

import java.time.LocalDateTime;

public class ReleaseVersionRequestDto {
    private Long id;
    private String name;
    private String description;
    private LocalDateTime startTime;
    private LocalDateTime completionTime;

    public ReleaseVersionRequestDto() {

    }

    public ReleaseVersionRequestDto(
            Long id,
            String name,
            String description,
            LocalDateTime startTime,
            LocalDateTime completionTime) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.startTime = startTime;
        this.completionTime = completionTime;
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

    public LocalDateTime getCompletionTime() {
        return completionTime;
    }

    public void setCompletionTime(LocalDateTime completionTime) {
        this.completionTime = completionTime;
    }
}
