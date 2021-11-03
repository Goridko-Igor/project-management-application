package ru.goridko_igor.dto;

public class UserRequestDto {
    private Long id;
    private String name;

    public UserRequestDto() {

    }

    public UserRequestDto(Long id, String name) {
        this.id = id;
        this.name = name;
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
}
