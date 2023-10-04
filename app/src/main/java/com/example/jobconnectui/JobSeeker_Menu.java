package com.example.jobconnectui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jobconnectui.Freelance.Profile_Hirer_Menu;

public class JobSeeker_Menu extends AppCompatActivity {

    TextView logout;
    TextView Rate_App;

    TextView view_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hirer_menu);

        logout = findViewById(R.id.logout);
        view_profile = findViewById(R.id.view_profile);
        Rate_App = findViewById(R.id.rate_App);

        Rate_App.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //show rating dialog
                RateUsDialog rateUsDialog = new RateUsDialog(JobSeeker_Menu.this);
                rateUsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(android.R.color.transparent)));
                rateUsDialog.setCancelable(false);
                rateUsDialog.show();
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(JobSeeker_Menu.this, SignIn.class));
                Toast.makeText(JobSeeker_Menu.this, "Successfully Logout", Toast.LENGTH_SHORT).show();
            }
        });

        view_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(JobSeeker_Menu.this, Profile_Hirer.class));
            }
        });
    }
}