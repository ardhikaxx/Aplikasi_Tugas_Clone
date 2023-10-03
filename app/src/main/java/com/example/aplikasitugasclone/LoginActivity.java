package com.example.aplikasitugasclone;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;
import android.text.InputType;

public class LoginActivity extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText passwordEditText;
    private View ImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        ImageButton = findViewById(R.id.showPasswordButton);

        Button loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                if (isValidCredentials(username, password)) {
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                } else {
                    displayErrorMessage();
                }
            }
        });

        final EditText passwordEditText = findViewById(R.id.passwordEditText);
        ImageButton showPasswordImageButton = findViewById(R.id.showPasswordButton);

        showPasswordImageButton.setOnClickListener(new View.OnClickListener() {
            private boolean passwordVisible;

            @Override
            public void onClick(View v) {
                if (passwordVisible) {
                    passwordEditText.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                    showPasswordImageButton.setImageResource(R.drawable.ic_hideon);
                } else {
                    passwordEditText.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                    showPasswordImageButton.setImageResource(R.drawable.ic_hideoff);
                }
                
                passwordVisible = !passwordVisible;
                
                passwordEditText.setSelection(passwordEditText.getText().length());
            }
        });


        TextView registerTextView = findViewById(R.id.registerTextView);
        registerTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }

    private boolean isValidCredentials(String username, String password) {
        String validUsername = "admin";
        String validPassword = "admin";
        return username.equals(validUsername) && password.equals(validPassword);
    }

    private void displayErrorMessage() {
        Toast.makeText(this, "Username atau password salah", Toast.LENGTH_SHORT).show();
    }
}