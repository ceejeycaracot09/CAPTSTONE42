package com.example.jobconnectui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class View_Job_Description extends AppCompatActivity {

    private ImageView reportButton;

    private   ImageView returned;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_job_description);

        reportButton = findViewById(R.id.reportButton);
        returned = findViewById(R.id.returned);

        reportButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(View_Job_Description.this, Report_User.class));
            }
        });

        returned.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(View_Job_Description.this, Job_Seeker_Dashboard.class));
            }
        });
    }
}