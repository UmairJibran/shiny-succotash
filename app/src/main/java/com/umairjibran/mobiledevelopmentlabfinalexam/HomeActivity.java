package com.umairjibran.mobiledevelopmentlabfinalexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.umairjibran.mobiledevelopmentlabfinalexam.ui.login.AdminLogin;
import com.umairjibran.mobiledevelopmentlabfinalexam.ui.login.LoginActivity;
import com.umairjibran.mobiledevelopmentlabfinalexam.ui.login.RegisterActivity;

public class HomeActivity extends AppCompatActivity {

    Button btn_admin_login,btn_user_login,btn_user_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btn_admin_login = findViewById(R.id.btn_login_admin);
        btn_user_login = findViewById(R.id.btn_login_user);
        btn_user_register = findViewById(R.id.btn_register);

        btn_admin_login.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClass(HomeActivity.this, AdminLogin.class);
            startActivity(intent);
        });

        btn_user_login.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClass(HomeActivity.this,LoginActivity.class);
            startActivity(intent);
        });

        btn_user_register.setOnClickListener(v -> {
            Intent intent = new Intent();
            intent.setClass(HomeActivity.this, RegisterActivity.class);
            startActivity(intent);
        });
    }
}