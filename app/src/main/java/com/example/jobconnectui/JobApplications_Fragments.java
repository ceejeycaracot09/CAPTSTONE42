package com.example.jobconnectui;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

public class JobApplications_Fragments extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_job_applications__fragments, container, false);

        ImageView profile_details = view.findViewById(R.id.profile_details);

        profile_details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Job_Applicatioon_Network_Details_Hirer.class);
                startActivity(intent);
            }
        });

        return view;
    }
}