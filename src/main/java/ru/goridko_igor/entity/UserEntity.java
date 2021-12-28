package ru.goridko_igor.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "\"user\"")
public class UserEntity {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Column(name = "hash_code", nullable = false)
    private String hashCode;

    @Column(name = "salt", nullable = false, unique = true)
    private String salt;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @PrimaryKeyJoinColumn
    private UserInformationEntity userInformation;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<ProjectParticipantEntity> projectParticipants;

    @OneToMany(mappedBy = "authorUser", fetch = FetchType.LAZY)
    private List<TaskEntity> tasksOfAuthorUser;

    @OneToMany(mappedBy = "executorUser", fetch = FetchType.LAZY)
    private List<TaskEntity> tasksOfExecutorUser;

    @Transient
    private String password;

    public UserEntity() {

    }

    public UserEntity(
            Long id,
            String name,
            String hashCode,
            String salt,
            UserInformationEntity userInformation,
            Set<ProjectParticipantEntity> projectParticipants,
            List<TaskEntity> tasksOfAuthorUser,
            List<TaskEntity> tasksOfExecutorUser,
            String password) {
        this.id = id;
        this.name = name;
        this.hashCode = hashCode;
        this.salt = salt;
        this.userInformation = userInformation;
        this.projectParticipants = projectParticipants;
        this.tasksOfAuthorUser = tasksOfAuthorUser;
        this.tasksOfExecutorUser = tasksOfExecutorUser;
        this.password = password;
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

    public String getHashCode() {
        return hashCode;
    }

    public void setHashCode(String hashCode) {
        this.hashCode = hashCode;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public UserInformationEntity getUserInformation() {
        return userInformation;
    }

    public void setUserInformation(UserInformationEntity userInformation) {
        this.userInformation = userInformation;
    }

    public Set<ProjectParticipantEntity> getProjectParticipants() {
        return projectParticipants;
    }

    public void setProjectParticipants(Set<ProjectParticipantEntity> projectParticipants) {
        this.projectParticipants = projectParticipants;
    }

    public List<TaskEntity> getTasksOfAuthorUser() {
        return tasksOfAuthorUser;
    }

    public void setTasksOfAuthorUser(List<TaskEntity> tasksOfAuthorUser) {
        this.tasksOfAuthorUser = tasksOfAuthorUser;
    }

    public List<TaskEntity> getTasksOfExecutorUser() {
        return tasksOfExecutorUser;
    }

    public void setTasksOfExecutorUser(List<TaskEntity> tasksOfExecutorUser) {
        this.tasksOfExecutorUser = tasksOfExecutorUser;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hashCode='" + hashCode + '\'' +
                ", salt='" + salt + '\'' +
                ", userInformation=" + userInformation +
                ", projectParticipants=" + projectParticipants +
                ", tasksOfAuthorUser=" + tasksOfAuthorUser +
                ", tasksOfExecutorUser=" + tasksOfExecutorUser +
                ", password='" + password + '\'' +
                '}';
    }
}
