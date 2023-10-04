package com.example.jobconnectui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class View_Profile_Hirer_Invite_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_profile_hirer_invite_main);

        Button ContinueButton = findViewById(R.id.Continue1);

        ContinueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(View_Profile_Hirer_Invite_main.this, Hirer_Dashboard.class));
                Toast.makeText(View_Profile_Hirer_Invite_main.this, "Invited", Toast.LENGTH_SHORT).show();
            }
        });
    }
}