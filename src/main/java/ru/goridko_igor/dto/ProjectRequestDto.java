package ru.goridko_igor.dto;

import java.time.LocalDateTime;

public class ProjectRequestDto {
    private Long id;
    private String name;
    private String text;
    private LocalDateTime creationTime;
    private Boolean isPaid;
    private Long statusId;

    public ProjectRequestDto() {

    }

    public ProjectRequestDto(
            Long id,
            String name,
            String text,
            LocalDateTime creationTime,
            Boolean isPaid,
            Long statusId) {
        this.id = id;
        this.name = name;
        this.text = text;
        this.creationTime = creationTime;
        this.isPaid = isPaid;
        this.statusId = statusId;
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

    public Long getStatusId() {
        return statusId;
    }

    public void setStatusId(Long statusId) {
        this.statusId = statusId;
    }
}
