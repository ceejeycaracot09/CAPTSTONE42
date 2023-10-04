package com.example.jobconnectui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class Freelance_Post_Jobs extends AppCompatActivity {

    private ViewPager2 viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_freelance_post_jobs);

        viewPager = findViewById(R.id.viewpager);


        VPAdapter vpAdapter = new VPAdapter(getSupportFragmentManager(), getLifecycle());
        vpAdapter.addFragment(new JobApplications_Fragments());
        vpAdapter.addFragment(new Job_Progress());
        viewPager.setAdapter(vpAdapter);

        TabLayout tabLayout = findViewById(R.id.tableLayout);
        new TabLayoutMediator(tabLayout, viewPager,
                (tab, position) -> {
                    switch (position) {
                        case 0:
                            tab.setText("Post a Job");
                            break;
                        case 1:
                            tab.setText("Job Progress");
                            break;
                    }
                }).attach();
    }
}