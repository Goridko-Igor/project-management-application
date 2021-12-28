package ru.goridko_igor.entity;

import java.io.Serializable;
import java.util.Objects;

public class ProjectParticipantEntityKey implements Serializable {
    private Long projectId;
    private Long userId;

    public ProjectParticipantEntityKey() {

    }

    public ProjectParticipantEntityKey(Long projectId, Long userId) {
        this.projectId = projectId;
        this.userId = userId;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        ProjectParticipantEntityKey that = (ProjectParticipantEntityKey) o;
        return projectId.equals(that.projectId) && userId.equals(that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, userId);
    }
}
