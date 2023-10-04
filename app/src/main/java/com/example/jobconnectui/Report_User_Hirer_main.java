package com.example.jobconnectui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Report_User_Hirer_main extends AppCompatActivity {

    Button ContinueButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_user_hirer_main);

        ContinueButton = findViewById(R.id.Continue);

        ContinueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Report_User_Hirer_main.this, View_JobDescription_Hirer.class));
                Toast.makeText(Report_User_Hirer_main.this, "Reported", Toast.LENGTH_SHORT).show();

            }
        });
    }
}