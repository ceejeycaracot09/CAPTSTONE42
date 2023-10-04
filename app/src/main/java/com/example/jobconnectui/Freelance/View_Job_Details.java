package com.example.jobconnectui.Freelance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.jobconnectui.Job_Seeker_Dashboard;
import com.example.jobconnectui.R;

public class View_Job_Details extends AppCompatActivity {

    private ImageView returnImageButton ;
    private Button applyButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_job_details);

        returnImageButton = findViewById(R.id.returnImageButton);
        applyButton = findViewById(R.id.applyButton);

      returnImageButton.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              startActivity(new Intent(View_Job_Details.this, Job_Seeker_Dashboard.class));
          }
      });

      applyButton.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              startActivity(new Intent(View_Job_Details.this, Job_Seeker_Dashboard.class));
              Toast.makeText(View_Job_Details.this, "Job Accepted", Toast.LENGTH_SHORT).show();
          }
      });
    }
}