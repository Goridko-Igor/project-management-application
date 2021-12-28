package ru.goridko_igor.dto;

public class UserRequestDto {
    private String name;
    private String hashCode;
    private String password;

    public UserRequestDto() {

    }

    public UserRequestDto(String name, String hashCode, String password) {
        this.name = name;
        this.hashCode = hashCode;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
