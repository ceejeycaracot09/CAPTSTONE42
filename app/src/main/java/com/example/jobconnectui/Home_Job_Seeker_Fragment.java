package com.example.jobconnectui;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;
import android.net.Uri;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.jobconnectui.Freelance.View_Job_Details;

public class Home_Job_Seeker_Fragment extends Fragment {

    public Home_Job_Seeker_Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home__job__seeker_, container, false);

        // Find the ImageView by its ID
        Spinner spinner = view.findViewById(R.id.spinner);
        Spinner spinner1 = view.findViewById(R.id.filterSpinner);
        CardView jobDetailsCardView = view.findViewById(R.id.jobDetailsCardView);
        CardView otherJobListing = view.findViewById(R.id.otherJobListing);
        ImageView searchButton = view.findViewById(R.id.searchButton);
        Button savedButton = view.findViewById(R.id.savedButton);
        ImageView webview = view.findViewById(R.id.webview);



        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), View_Job_Details.class);
                startActivity(intent);
            }
        });

        // Set an OnClickListener to navigate to another dashboard
       /* userAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the navigation logic here
                // For example, you can start a new activity:
                Intent intent = new Intent(getActivity(), Edit_Profile_Job_Seeker.class);
                startActivity(intent);
            }
        });*/


        jobDetailsCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), View_Job_Details.class);
                startActivity(intent);
            }
        });

        savedButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(requireContext(), "Saved", Toast.LENGTH_SHORT).show();
            }

        });

        webview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url = "https://www.jobstreet.com.ph/en/job/isp-engineer-13165714?jobId=jobstreet-ph-job-13165714&sectionRank=1&token=0~e57bf68a-ae06-4657-bc06-9fb87ed12398&searchPath=%2FINFINIVAN-jobs&fr=SRP%20View%20In%20New%20Tab";
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(browserIntent);

            }
        });


            // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(
                getContext(),
                R.array.filter,   // Replace 'spinner_items' with the name of your array resource
                android.R.layout.simple_spinner_item
        );

        // Specify the layout to use when the list of choices appears
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        spinner1.setAdapter(adapter1);


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
