package com.example.springboot_web_app_with_login.web.dto;

public class UserRegistrationDto {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String dzemat;

    public UserRegistrationDto(){

    }

    public UserRegistrationDto(String firstName, String lastName, String email, String password, String dzemat) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.dzemat = dzemat;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getDzemat() {
        return dzemat;
    }
    public void setDzemat(String dzemat) {
        this.dzemat = dzemat;
    }
}
