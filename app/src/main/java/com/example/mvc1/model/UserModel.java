package com.example.mvc1.model;

public class UserModel implements IUser {
    private String email;
    private String password;

    public UserModel(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public boolean isValid() {
        return email.equals("linoop@gmail.com") && password.equals("123");
    }
}
