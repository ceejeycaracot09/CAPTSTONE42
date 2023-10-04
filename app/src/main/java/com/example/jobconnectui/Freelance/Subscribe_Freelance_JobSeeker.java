package com.example.jobconnectui.Freelance;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.jobconnectui.Freelance_Job_Seeker_Main;
import com.example.jobconnectui.Hirer_Dashboard;
import com.example.jobconnectui.Job_Seeker_Dashboard;
import com.example.jobconnectui.R;
import com.example.jobconnectui.Update_Profile_Hirer_and_Subscriber;

public class Subscribe_Freelance_JobSeeker extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_subscribe__freelance__job_seeker, container, false);

        Button subscribeButton = view.findViewById(R.id.subscribeButton);
        Button noThanksButton = view.findViewById(R.id.noThanksButton);

        noThanksButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), Job_Seeker_Dashboard.class);
                startActivity(intent);
            }
        });

        subscribeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showConfirmationDialog();
            }
        });

        return view;
    }

    private void showConfirmationDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(requireContext());
        builder.setTitle("Confirmation");
        builder.setMessage("Are you sure you want to proceed Free   lance Mode?");
        builder.setPositiveButton("Proceed", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Perform the action to proceed
                // In this case, navigate to the next activity (Freelance_MainActivity)
                // Use the fully qualified class name for the Intent constructor
                startActivity(new Intent(requireContext(), Update_Profile_Hirer_and_Subscriber.class));
            }
        });
        builder.setNegativeButton("Cancel", null);
        builder.show();

    }
}