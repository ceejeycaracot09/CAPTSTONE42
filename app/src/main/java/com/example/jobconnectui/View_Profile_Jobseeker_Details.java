package com.example.jobconnectui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.jobconnectui.Freelance.View_Job_Details;

public class View_Profile_Jobseeker_Details extends AppCompatActivity {

    Button InviteButton;
    ImageView searchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_profile_jobseeker_details);

        InviteButton = findViewById(R.id.InviteButton);
        searchButton = findViewById(R.id.searchButton);

        InviteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(View_Profile_Jobseeker_Details.this, Job_Seeker_Dashboard.class));
                Toast.makeText(View_Profile_Jobseeker_Details.this, "Invited", Toast.LENGTH_SHORT).show();
            }
        });

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(View_Profile_Jobseeker_Details.this, View_Job_Description.class));

            }
        });
    }
}