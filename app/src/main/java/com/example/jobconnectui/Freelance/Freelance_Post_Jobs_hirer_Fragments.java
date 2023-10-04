package com.example.jobconnectui.Freelance;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.jobconnectui.Freelance_Hirer_Main;
import com.example.jobconnectui.R;

public class Freelance_Post_Jobs_hirer_Fragments extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_freelance__post__jobs_hirer__fragments, container, false);

        ImageView Post_jobs =view.findViewById(R.id.Post_jobs);

        Post_jobs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Freelance_Hirer_Main.class);
                Toast.makeText(getContext(), "Posted", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        return view;
    }
}