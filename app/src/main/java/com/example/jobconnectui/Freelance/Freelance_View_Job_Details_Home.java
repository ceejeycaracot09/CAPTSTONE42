package com.example.jobconnectui.Freelance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.jobconnectui.Freelance_Hirer_Main;
import com.example.jobconnectui.Job_Seeker_Dashboard;
import com.example.jobconnectui.R;

public class Freelance_View_Job_Details_Home extends AppCompatActivity {

    private ImageView returnImageButton ;
    private Button applyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_freelance_view_job_details_home);

        returnImageButton = findViewById(R.id.returnImageButton);
        applyButton = findViewById(R.id.applyButton);

        returnImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        applyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Freelance_View_Job_Details_Home.this, Freelance_JobSeeker_Home.class));
                Toast.makeText(Freelance_View_Job_Details_Home.this, "Invite Success", Toast.LENGTH_SHORT).show();
            }
        });
    }
}