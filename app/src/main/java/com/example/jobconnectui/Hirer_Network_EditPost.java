package com.example.jobconnectui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Hirer_Network_EditPost extends AppCompatActivity {
    private Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hirer_network_edit_post);

        saveButton = findViewById(R.id.savedButton);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Hirer_Network_EditPost.this, View_job_Applications_Hirer.class));
                Toast.makeText(Hirer_Network_EditPost.this, "Save Success", Toast.LENGTH_SHORT).show();
            }
        });
    }
}