package com.example.jobconnectui.Freelance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jobconnectui.Edit_Profile_Hirer;
import com.example.jobconnectui.Edit_Profile_Job_Seeker;
import com.example.jobconnectui.JobSeeker_Menu;
import com.example.jobconnectui.Job_Seeker_Dashboard;
import com.example.jobconnectui.Profile_Hirer;
import com.example.jobconnectui.R;
import com.example.jobconnectui.RateUsDialog;
import com.example.jobconnectui.SignIn;
import com.example.jobconnectui.View_Profile_Hirer_Menu;

public class Profile_Hirer_Menu extends AppCompatActivity {

    TextView logout;

    TextView view_profile;
    TextView rate_App;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_hirer_menu);

        logout = findViewById(R.id.logout);
        view_profile = findViewById(R.id.view_profile);
        rate_App = findViewById(R.id.rate_App);

        rate_App.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //show rating dialog
                RateUsDialog rateUsDialog = new RateUsDialog(Profile_Hirer_Menu.this);
                rateUsDialog.getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(android.R.color.transparent)));
                rateUsDialog.setCancelable(false);
                rateUsDialog.show();
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Profile_Hirer_Menu.this, SignIn.class));
                Toast.makeText(Profile_Hirer_Menu.this, "Successfully Logout", Toast.LENGTH_SHORT).show();
            }
        });

        view_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Profile_Hirer_Menu.this, View_Profile_Hirer_Menu.class));
            }
        });
    }
}