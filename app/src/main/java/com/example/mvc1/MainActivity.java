package com.example.mvc1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.mvc1.controller.LoginController;
import com.example.mvc1.view.ILoginView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, ILoginView {

    private EditText email, password;
    private Button login;

    private LoginController loginController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        login = findViewById(R.id.loginb);

        loginController = new LoginController(this);

        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.loginb: {
                loginController.onLogin(email.getText().toString(), password.getText().toString());
            }
            break;

        }
    }

    @Override
    public void loginSuccess(String message) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}