package com.example.mvc1.controller;

import com.example.mvc1.model.UserModel;
import com.example.mvc1.view.ILoginView;

public class LoginController implements ILoginController{
    ILoginView loginView;

    public LoginController(ILoginView iLoginView) {
        this.loginView = iLoginView;
    }

    @Override
    public void onLogin(String email, String password) {
        UserModel userModel = new UserModel(email,password);
        loginView.loginSuccess(userModel.isValid() ? "Authentication success" : "Authentication failure");
    }
}
