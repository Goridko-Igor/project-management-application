package ru.goridko_igor.dto;

public class ProjectParticipantResponseDto {
    private Long projectId;
    private Long userId;
    private Long roleId;

    public ProjectParticipantResponseDto() {

    }

    public ProjectParticipantResponseDto(Long projectId, Long userId, Long roleId) {
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
