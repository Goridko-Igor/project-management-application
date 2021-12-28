package ru.goridko_igor.dto;

public class UserResponseDto {
    private Long id;
    private String name;
    private UserInformationResponseDto userInformation;

    public UserResponseDto() {

    }

    public UserResponseDto(
            Long id,
            String name,
            UserInformationResponseDto userInformation) {
        this.id = id;
        this.name = name;
        this.userInformation = userInformation;
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

    public UserInformationResponseDto getUserInformation() {
        return userInformation;
    }

    public void setUserInformation(UserInformationResponseDto userInformation) {
        this.userInformation = userInformation;
    }
}
