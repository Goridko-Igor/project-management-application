package ru.goridko_igor.dto;

public class ProjectParticipantRequestDto {
    private Long projectId;
    private Long userId;
    private Long roleId;

    public ProjectParticipantRequestDto() {

    }

    public ProjectParticipantRequestDto(Long projectId, Long userId, Long roleId) {
        this.projectId = projectId;
        this.userId = userId;
        this.roleId = roleId;
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

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}
