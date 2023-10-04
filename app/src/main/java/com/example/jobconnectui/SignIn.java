package com.example.jobconnectui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignIn extends AppCompatActivity {

    private EditText username;
    private EditText password;
    private TextView Redirect_Signup;
    private TextView Redirect_Fpassword;
    private Button loginButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        Redirect_Signup = findViewById(R.id.Signup_login);
        Redirect_Fpassword = findViewById(R.id.forgot_password);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Call login method to validate user credentials and navigate to the respective dashboard
                login();
            }
        });

        Redirect_Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignIn.this, SignUp.class));
            }
        });

        Redirect_Fpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignIn.this, Forgot_Password.class));
            }
        });
    }
        private void login() {
            String userEmail = username.getText().toString().trim();
            String userPassword = password.getText().toString().trim();

            // Check if the user credentials match the hirer account
            if (userEmail.equals("hirer@gmail.com") && userPassword.equals("password")) {
                // Navigate to the hirer dashboard
                Intent intent = new Intent(SignIn.this, Hirer_Dashboard.class);
                startActivity(intent);
                Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show();
                return;
            }

            // Check if the user credentials match the job seeker account
            if (userEmail.equals("jobseeker@gmail.com") && userPassword.equals("password")) {
                // Navigate to the job seeker dashboard
                Intent intent = new Intent(SignIn.this, Job_Seeker_Dashboard.class);
                startActivity(intent);
                Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show();
                return;
            }

            // If the user credentials don't match any of the sample accounts, show an error message
            Toast.makeText(this, "Invalid email or password", Toast.LENGTH_SHORT).show();
    }
}