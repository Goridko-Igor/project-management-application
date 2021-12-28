package ru.goridko_igor.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "task")
public class TaskEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "project_id", nullable = false)
    private ProjectEntity project;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "author_user_id", nullable = false)
    private UserEntity authorUser;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "executor_user_id", nullable = false)
    private UserEntity executorUser;

    @Column(name = "name", nullable = false)
    private String name;

    @Lob
    @Column(name = "description", nullable = false, columnDefinition = "TEXT")
    private String description;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "status_id", nullable = false)
    private StatusEntity status;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "task_type_id", nullable = false)
    private TaskTypeEntity taskType;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "release_version_id", nullable = false)
    private ReleaseVersionEntity releaseVersion;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "priority_id", nullable = false)
    private PriorityEntity priority;

    @Column(name = "start_time")
    private LocalDateTime startTime;

    @Column(name = "completion_time")
    private LocalDateTime completionTime;

    public TaskEntity() {

    }

    public TaskEntity(
            ProjectEntity project,
            UserEntity authorUser,
            UserEntity executorUser,
            String name, String description,
            StatusEntity status,
            TaskTypeEntity taskType,
            ReleaseVersionEntity releaseVersion,
            PriorityEntity priority,
            LocalDateTime startTime,
            LocalDateTime completionTime) {
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

    public ProjectEntity getProject() {
        return project;
    }

    public void setProject(ProjectEntity project) {
        this.project = project;
    }

    public UserEntity getAuthorUser() {
        return authorUser;
    }

    public void setAuthorUser(UserEntity authorUser) {
        this.authorUser = authorUser;
    }

    public UserEntity getExecutorUser() {
        return executorUser;
    }

    public void setExecutorUser(UserEntity executorUser) {
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

    public StatusEntity getStatus() {
        return status;
    }

    public void setStatus(StatusEntity status) {
        this.status = status;
    }

    public TaskTypeEntity getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskTypeEntity taskType) {
        this.taskType = taskType;
    }

    public ReleaseVersionEntity getReleaseVersion() {
        return releaseVersion;
    }

    public void setReleaseVersion(ReleaseVersionEntity releaseVersion) {
        this.releaseVersion = releaseVersion;
    }

    public PriorityEntity getPriority() {
        return priority;
    }

    public void setPriority(PriorityEntity priority) {
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

    @Override
    public String toString() {
        return "TaskEntity{" +
                "id=" + id +
                ", project=" + project +
                ", authorUser=" + authorUser +
                ", executorUser=" + executorUser +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", taskType=" + taskType +
                ", releaseVersion=" + releaseVersion +
                ", priority=" + priority +
                ", startTime=" + startTime +
                ", completionTime=" + completionTime +
                '}';
    }
}
