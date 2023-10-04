package com.example.jobconnectui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class network_Report_Hirer extends AppCompatActivity {

    Button continueButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_network_report_hirer);

        continueButton =findViewById(R.id.ContinueButton02);

        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(network_Report_Hirer.this, View_job_Applications_Hirer.class));
                Toast.makeText(network_Report_Hirer.this, "Report Submitted", Toast.LENGTH_SHORT).show();
            }
        });
    }
}