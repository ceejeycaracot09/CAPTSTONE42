package com.example.jobconnectui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Update_Profile_Job_Seeker_and_Subscriber extends AppCompatActivity {

   Button ContinueButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_profile_job_seeker_and_subscriber);

        ContinueButton = findViewById(R.id.ContinueButton);

        ContinueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Update_Profile_Job_Seeker_and_Subscriber.this, Freelance_Hirer_Main.class));
            }
        });
    }
}