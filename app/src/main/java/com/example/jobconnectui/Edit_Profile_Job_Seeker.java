package com.example.jobconnectui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Edit_Profile_Job_Seeker extends AppCompatActivity {

    private Button addSectionButton;
    private  Button ContinueButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile_job_seeker);

        addSectionButton = findViewById(R.id.addSectionButton);
        ContinueButton = findViewById(R.id.ContinueButton);

        addSectionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Edit_Profile_Job_Seeker.this, Edit_Profile_Section.class));
            }
        });

        ContinueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Edit_Profile_Job_Seeker.this, Job_Seeker_Dashboard.class));
            }
        });
    }
}