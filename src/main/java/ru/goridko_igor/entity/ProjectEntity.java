package ru.goridko_igor.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "project")
public class ProjectEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Lob
    @Column(name = "description", nullable = false, columnDefinition = "TEXT")
    private String description;

    @Column(name = "creation_time", nullable = false)
    private LocalDateTime creationTime;

    @Column(name = "is_paid", nullable = false)
    private Boolean isPaid;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "status_id", nullable = false)
    private StatusEntity status;

    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<ProjectParticipantEntity> projectParticipants;

    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<TaskEntity> tasks;

    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ReleaseVersionEntity> releaseVersions;

    public ProjectEntity() {

    }

    public ProjectEntity(
            String name,
            String description,
            LocalDateTime creationTime,
            Boolean isPaid,
            StatusEntity status,
            Set<ProjectParticipantEntity> projectParticipants,
            List<TaskEntity> tasks,
            List<ReleaseVersionEntity> releaseVersions) {
        this.name = name;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    @Override
    public String toString() {
        return "ProjectEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", creationTime=" + creationTime +
                ", isPaid=" + isPaid +
                ", status=" + status +
                ", projectParticipants=" + projectParticipants +
                ", tasks=" + tasks +
                ", releaseVersions=" + releaseVersions +
                '}';
    }
}
