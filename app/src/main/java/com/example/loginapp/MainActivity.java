package com.example.loginapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText usernameInput, passwordInput;
    private Button loginButton, cancelButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameInput = findViewById(R.id.usernameInput);
        passwordInput = findViewById(R.id.passwordInput);
        loginButton = findViewById(R.id.loginButton);
        cancelButton = findViewById(R.id.cancelButton);
        loginButton.setOnClickListener(v ->
                Toast.makeText(MainActivity.this, "Login submitted", Toast.LENGTH_SHORT).show());
        cancelButton.setOnClickListener(v -> {
            usernameInput.getText().clear();
            passwordInput.getText().clear();
        });
    }
}
