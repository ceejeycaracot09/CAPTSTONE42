package com.example.jobconnectui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class Freelance_Post_Dashboard extends Fragment {

    private ViewPager2 viewPager;
    private TabLayout tabLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_freelance__post__dashboard, container, false);

        viewPager = view.findViewById(R.id.viewpager);
        tabLayout = view.findViewById(R.id.tableLayout);

        VPAdapter vpAdapter = new VPAdapter(getChildFragmentManager(), getLifecycle());
        vpAdapter.addFragment(new Post_Jobs_hirer_Fragments());
        vpAdapter.addFragment(new Job_Progress());
        viewPager.setAdapter(vpAdapter);

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
