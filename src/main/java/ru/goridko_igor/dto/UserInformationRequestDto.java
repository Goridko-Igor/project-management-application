package ru.goridko_igor.dto;

public class UserInformationRequestDto {
    private Long userId;
    private String surname;
    private String forename;
    private String patronymic;
    private String email;

    public UserInformationRequestDto() {

    }

    public UserInformationRequestDto(
            Long userId,
            String surname,
            String forename,
            String patronymic,
            String email) {
        this.userId = userId;
        this.surname = surname;
        this.forename = forename;
        this.patronymic = patronymic;
        this.email = email;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
