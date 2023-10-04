package com.example.jobconnectui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Forgot_Password extends AppCompatActivity {

    Button btnCancel;

    Button reset_password;

    TextView forgotPassword_LoginText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        btnCancel = findViewById(R.id.btnCancel);
        reset_password = findViewById(R.id.reset_password);
        forgotPassword_LoginText = findViewById(R.id.forgotPassword_LoginText);

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Forgot_Password.this, SignIn.class));
            }
        });

        reset_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Forgot_Password.this, SignIn.class));
                Toast.makeText(Forgot_Password.this, "Reset Complete", Toast.LENGTH_SHORT).show();
            }
        });

        forgotPassword_LoginText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Forgot_Password.this, SignIn.class));

            }
        });

    }
}