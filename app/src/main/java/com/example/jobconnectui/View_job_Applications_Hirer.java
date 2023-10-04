package com.example.jobconnectui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import android.view.View;
import android.content.Intent;

import android.os.Bundle;
import android.widget.ImageView;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class View_job_Applications_Hirer extends AppCompatActivity {

    private ImageView returnImageButton;

    private ViewPager2 viewPager;

    private ImageView edit_post_details;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_job_applications_hirer);

        returnImageButton = findViewById(R.id.returnImageButton);
        viewPager = findViewById(R.id.viewpager);
        edit_post_details = findViewById(R.id.edit_post_details);

        VPAdapter vpAdapter = new VPAdapter(getSupportFragmentManager(), getLifecycle());
        vpAdapter.addFragment(new JobApplications_Fragments());
        vpAdapter.addFragment(new Invites_Fragments());
        vpAdapter.addFragment(new Recommended_Fragments());
        viewPager.setAdapter(vpAdapter);

        TabLayout TabLayout = findViewById(R.id.tableLayout);
        new TabLayoutMediator(TabLayout, viewPager,
                (tab, position) -> {
                    switch (position) {
                        case 0:
                            tab.setText("Job Application");
                            break;
                        case 1:
                            tab.setText("Invites");
                            break;
                        case 2:
                            tab.setText("Recommended");
                            break;
                    }
                }).attach();


        returnImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(View_job_Applications_Hirer.this, Hirer_Dashboard.class));
            }
        });

        edit_post_details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(View_job_Applications_Hirer.this, Hirer_Network_EditPost.class));
            }
        });
    }
}