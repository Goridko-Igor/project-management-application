package ru.goridko_igor.dto;

public class ProjectParticipantResponseDto {
    private Long projectId;
    private Long userId;
    private ProjectResponseDto project;
    private UserResponseDto user;
    private RoleResponseDto role;

    public ProjectParticipantResponseDto() {

    }

    public ProjectParticipantResponseDto(
            Long projectId,
            Long userId,
            ProjectResponseDto project,
            UserResponseDto user,
            RoleResponseDto role) {
        this.projectId = projectId;
        this.userId = userId;
        this.project = project;
        this.user = user;
        this.role = role;
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

    public ProjectResponseDto getProject() {
        return project;
    }

    public void setProject(ProjectResponseDto project) {
        this.project = project;
    }

    public UserResponseDto getUser() {
        return user;
    }

    public void setUser(UserResponseDto user) {
        this.user = user;
    }

    public RoleResponseDto getRole() {
        return role;
    }

    public void setRole(RoleResponseDto role) {
        this.role = role;
    }
}
