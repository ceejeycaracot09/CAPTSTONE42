package com.example.jobconnectui;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

public class Home_Hirer_Fragments extends Fragment {

    public Home_Hirer_Fragments() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home__hirer__fragments, container, false);

        // Find the ImageView by its ID
       // ImageView userAccountButton = view.findViewById(R.id.userAccountButton);
        Spinner spinner = view.findViewById(R.id.spinner);
        ImageView userDetails = view.findViewById(R.id.userDetails);



        // Set an OnClickListener to navigate to another dashboard
       /* userAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the navigation logic here
                // For example, you can start a new activity:
                Intent intent = new Intent(getActivity(), Edit_Profile_Hirer.class);
                startActivity(intent);
            }
        });*/

        userDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Profile_Details_View.class);
                startActivity(intent);
            }
        });


        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                getContext(),
                R.array.job_array,   // Replace 'spinner_items' with the name of your array resource
                android.R.layout.simple_spinner_item
        );

        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        return view;
    }
}
