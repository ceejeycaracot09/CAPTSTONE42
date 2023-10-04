package com.example.jobconnectui.Freelance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.jobconnectui.R;
import com.example.jobconnectui.Report_User;

public class View_JobDescription_Hirer extends AppCompatActivity {

    private ImageView reportButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_job_description_hirer);

            reportButton = findViewById(R.id.reportButton);

            reportButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    startActivity(new Intent(View_JobDescription_Hirer.this, Report_User.class));
                }
            });
    }
}