package com.umairjibran.mobiledevelopmentlabfinalexam.ui.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.umairjibran.mobiledevelopmentlabfinalexam.R;
import com.umairjibran.mobiledevelopmentlabfinalexam.UserHomeScreen;

public class RegisterActivity extends AppCompatActivity {

    Button register_user;
    EditText email,password;
    private FirebaseAuth mAuth;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        register_user = findViewById(R.id.register_user);
        email = findViewById(R.id.reg_email);
        password = findViewById(R.id.reg_password);

        register_user.setOnClickListener(v -> {
            mAuth.createUserWithEmailAndPassword(email.getText().toString(),password.getText().toString()).addOnCompleteListener((Activity) getApplicationContext(), task -> {
                if(task.isSuccessful()){
                    Intent intent = new Intent();
                    intent.setClass(getApplicationContext(), UserHomeScreen.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(this, "Registration Failed", Toast.LENGTH_SHORT).show();
                }
            });
        });
    }
}