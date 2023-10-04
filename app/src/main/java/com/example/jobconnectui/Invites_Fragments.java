package com.example.jobconnectui;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class Invites_Fragments extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_invites__fragments, container, false);

        ImageView userAccountButton = view.findViewById(R.id.inviteButton);
        ImageView userAccountButton1 = view.findViewById(R.id.inviteButton1);
        ImageView mabahin_detail = view.findViewById(R.id.mabahin_detail);
        userAccountButton1.setVisibility(View.GONE);

        userAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                userAccountButton1.setVisibility(View.VISIBLE);
                userAccountButton.setVisibility(View.GONE);
                Toast.makeText(getContext(), "Invited", Toast.LENGTH_SHORT).show();

            }
        });

        userAccountButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                userAccountButton1.setVisibility(View.GONE);
                userAccountButton.setVisibility(View.VISIBLE);
                Toast.makeText(getContext(), "Cancel Invite", Toast.LENGTH_SHORT).show();

            }
        });

        mabahin_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), Invites_hirer_see_details.class);
                startActivity(intent);
            }
        });

        return view;
    }

}