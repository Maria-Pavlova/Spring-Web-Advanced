package com.example.springsecurity.models.dtos;

import java.io.Serializable;
import java.util.Objects;

public class UserRegisterDTO implements Serializable {
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String confirmPassword;


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public UserRegisterDTO setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserRegisterDTO setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserRegisterDTO setUsername(String username) {
        this.username = username;
        return this;
    }

    public UserRegisterDTO setPassword(String password) {
        this.password = password;
        return this;
    }



    public UserRegisterDTO setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserRegisterDTO entity = (UserRegisterDTO) o;
        return Objects.equals(this.firstName, entity.firstName) &&
                Objects.equals(this.lastName, entity.lastName) &&
                Objects.equals(this.username, entity.username) &&
                Objects.equals(this.password, entity.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, username, password);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "firstName = " + firstName + ", " +
                "lastName = " + lastName + ", " +
                "username = " + username + ", " +
                "password = " + password + ")";
    }
}
