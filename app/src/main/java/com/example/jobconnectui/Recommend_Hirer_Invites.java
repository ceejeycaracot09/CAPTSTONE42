package com.example.jobconnectui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Recommend_Hirer_Invites extends AppCompatActivity {

    ImageView report;
    Button ContinueButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommend_hirer_invites);

        ContinueButton = findViewById(R.id.ContinueButton01);

        report = findViewById(R.id.report);

        ContinueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Recommend_Hirer_Invites.this, View_job_Applications_Hirer.class));
                Toast.makeText(Recommend_Hirer_Invites.this, "Success Invite", Toast.LENGTH_SHORT).show();
            }
        });

        report.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Recommend_Hirer_Invites.this, network_Report_Hirer.class));

            }
        });



    }
}