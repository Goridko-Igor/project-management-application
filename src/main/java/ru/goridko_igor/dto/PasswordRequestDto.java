package ru.goridko_igor.dto;

public class PasswordRequestDto {
    private Long id;
    private Long userId;
    private String hashCode;
    private String salt;

    public PasswordRequestDto() {

    }

    public PasswordRequestDto(Long id, Long userId, String hashCode, String salt) {
        this.id = id;
        this.userId = userId;
        this.hashCode = hashCode;
        this.salt = salt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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
}
