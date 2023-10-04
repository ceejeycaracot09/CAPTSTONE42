package com.example.jobconnectui.Freelance;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.jobconnectui.R;
import com.example.jobconnectui.View_Job_Description;

public class Freelance_JobSeeker_Networks extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_freelance__job_seeker__networks, container, false);
        ImageView searchButton = view.findViewById(R.id.searchButton);

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), View_Job_Description.class);
                startActivity(intent);
            }
        });

        return view;
    }
}