package com.example.jobconnectui;

import android.content.Intent;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class Job_Progress extends Fragment {

    TextView detail_post;

    ImageButton messages;
    LinearLayout message_viewpost;
    LinearLayout cardLayout;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_job__progress, container, false);

        detail_post = view.findViewById(R.id.details_post);
        cardLayout = view.findViewById(R.id.layout);
        messages = view.findViewById(R.id.messages);
        message_viewpost = view.findViewById(R.id.message_viewpost);

        // Set an initial visibility state for detail_post (e.g., GONE or VISIBLE)
        detail_post.setVisibility(View.GONE);
        message_viewpost.setVisibility(View.GONE);

        messages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), message_jobseeker.class);
                startActivity(intent);
            }
        });

        // Add an OnClickListener to the cardLayout to expand/collapse the detail_post
        cardLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleExpansion();
            }
        });

        return view;
    }

    private void toggleExpansion() {
        int v = (detail_post.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;
        TransitionManager.beginDelayedTransition(cardLayout, new AutoTransition());
        detail_post.setVisibility(v);
        message_viewpost.setVisibility(v);
    }
}
