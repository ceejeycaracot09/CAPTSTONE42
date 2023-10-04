

package com.example.jobconnectui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Profile_Details_View extends AppCompatActivity {

    private ImageView returnImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_details_view);

        returnImageButton = findViewById(R.id.returnImageButton);


        returnImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Profile_Details_View.this, Hirer_Dashboard.class));
            }
        });
    }
}








