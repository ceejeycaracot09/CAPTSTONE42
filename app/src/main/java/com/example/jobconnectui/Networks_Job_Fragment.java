package com.example.jobconnectui;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

public class Networks_Job_Fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.networks_jobseekers_fragment, container, false);

        ImageView see_details = view.findViewById(R.id.viewpage);
        ImageView viewProfile = view.findViewById(R.id.viewProfile);
        ImageView edit_details =view.findViewById(R.id.edit_details);



        viewProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), View_Profile_Hirer_Invite_main.class);
                startActivity(intent);
            }
        });

        see_details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), View_JobDescription_Hirer.class);
                startActivity(intent);
            }
        });


        edit_details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), View_job_Applications_Hirer.class);
                startActivity(intent);
            }
        });

        return view; // Add this line to return the inflated view
    }
}
