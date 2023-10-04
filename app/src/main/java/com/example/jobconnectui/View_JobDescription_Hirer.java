package com.example.jobconnectui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class View_JobDescription_Hirer extends AppCompatActivity {

    private ImageView reportButton;

    private   ImageView returned;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_job_description_hirer2);

        reportButton = findViewById(R.id.reportButton);
        returned = findViewById(R.id.returnImageButton);

        reportButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(View_JobDescription_Hirer.this, Report_User_Hirer_main.class));
            }
        });

        returned.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(View_JobDescription_Hirer.this, Hirer_Dashboard.class));
            }
        });
    }
}