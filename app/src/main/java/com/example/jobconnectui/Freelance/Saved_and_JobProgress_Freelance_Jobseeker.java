package com.example.jobconnectui.Freelance;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jobconnectui.Job_Progress;
import com.example.jobconnectui.R;
import com.example.jobconnectui.VPAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;


public class Saved_and_JobProgress_Freelance_Jobseeker extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_saved_and__job_progress__freelance__jobseeker, container, false);

        ViewPager2 viewPager =view.findViewById(R.id.viewpager);

        VPAdapter vpAdapter = new VPAdapter(getChildFragmentManager(), getLifecycle());
        vpAdapter.addFragment(new Freelance_JobSeeker_Jobs());
        vpAdapter.addFragment(new Job_Progress());
        viewPager.setAdapter(vpAdapter);

        TabLayout tabLayout = view.findViewById(R.id.tableLayout); // Note the correct ID
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

        return view;
    }
}