package com.example.jobconnectui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.jobconnectui.Freelance.Profile_Hirer_Menu;
import com.example.jobconnectui.Freelance.Subscribe_Freelance_JobSeeker;

public class Job_Seeker_Dashboard extends AppCompatActivity {

    private int selectedTab = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_seeker_dashboard);

        final LinearLayout homeLayout = findViewById(R.id.home_navigation);
        final LinearLayout networkLayout = findViewById(R.id.network_navigation);
        final LinearLayout notificationLayout = findViewById(R.id.notification_navigation);
        final LinearLayout jobRequestLayout = findViewById(R.id.jobs_navigation);
        final LinearLayout switchLayout = findViewById(R.id.switch_navigation);

        final ImageView homeImage = findViewById(R.id.home_Imageview);
        final ImageView networkImage = findViewById(R.id.network_imageView);
        final ImageView notificationImage = findViewById(R.id.notification_Imageview);
        final ImageView jobRequestImage = findViewById(R.id.jobs_imageview);
        final ImageView switchImage = findViewById(R.id.switch_imageview);

        final ImageView logoImageview = findViewById(R.id.logoImageview);
        final TextView notification = findViewById(R.id.notification);
        final ImageView logoJobs = findViewById(R.id.logoJobs);
        final ImageView userAccountButton = findViewById(R.id.userAccountButton);

        final TextView homeText = findViewById(R.id.home_txt);
        final TextView networkText = findViewById(R.id.network_txt);
        final TextView notificationText = findViewById(R.id.notification_text);
        final TextView jobRequestText = findViewById(R.id.jobs_text);
        final TextView switchText = findViewById(R.id.switch_text);


        notification.setVisibility(View.INVISIBLE);
        logoJobs.setVisibility(View.INVISIBLE);


        //nag set ug fragments para sa mga button
        getSupportFragmentManager().beginTransaction()
                .setReorderingAllowed(true)
                .replace(R.id.fragmentContainer, Home_Job_Seeker_Fragment.class, null)
                .commit();

        homeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //e check niya kung ang button is already selected or not.
                if (selectedTab != 1) {

                    //nag set ug fragments para sa mga button
                    getSupportFragmentManager().beginTransaction()
                            .setReorderingAllowed(true)
                            .replace(R.id.fragmentContainer, Home_Job_Seeker_Fragment.class, null)
                            .commit();

                    // e disabled niya ang ubang button except ni home button
                    networkText.setVisibility(View.GONE);
                    jobRequestText.setVisibility(View.GONE);
                    notificationText.setVisibility(View.GONE);
                    switchText.setVisibility(View.GONE);

                    networkImage.setImageResource(R.drawable.baseline_networks_24);
                    jobRequestImage.setImageResource(R.drawable.baseline_job_request_icon);
                    notificationImage.setImageResource(R.drawable.baseline_notifications_nav);
                    switchImage.setImageResource(R.drawable.baseline_switch_mode_24);


                    logoImageview.setVisibility(View.VISIBLE);
                    userAccountButton.setVisibility(View.VISIBLE);
                    notification.setVisibility(View.GONE);
                    logoJobs.setVisibility(View.GONE);

                    networkLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    jobRequestLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    notificationLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    switchLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));

                    //e select niya ang specific nga button
                    homeText.setVisibility(View.VISIBLE);
                    homeImage.setImageResource(R.drawable.baseline_home_nav);
                    homeLayout.setBackgroundResource(R.drawable.round_back_home_100);

                    //create animation sa button
                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 1f, 1f, Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF, 0.0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    homeLayout.startAnimation(scaleAnimation);

                    //e set ang button nga selected siya
                    selectedTab = 1;
                }
            }
        });

        networkLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //e check niya kung ang button is already selected or not.
                if (selectedTab != 2) {

                    //nag set ug fragments para sa mga button
                    getSupportFragmentManager().beginTransaction()
                            .setReorderingAllowed(true)
                            .replace(R.id.fragmentContainer, Network_Hirer_Fragment.class, null)
                            .commit();

                    // e disabled niya ang ubang button except ni home button
                    homeText.setVisibility(View.GONE);
                    jobRequestText.setVisibility(View.GONE);
                    notificationText.setVisibility(View.GONE);
                    switchText.setVisibility(View.GONE);

                    homeImage.setImageResource(R.drawable.baseline_home_nav);
                    jobRequestImage.setImageResource(R.drawable.baseline_job_request_icon);
                    notificationImage.setImageResource(R.drawable.baseline_notifications_nav);
                    switchImage.setImageResource(R.drawable.baseline_switch_mode_24);


                    logoImageview.setVisibility(View.VISIBLE);
                    userAccountButton.setVisibility(View.VISIBLE);
                    notification.setVisibility(View.GONE);
                    logoJobs.setVisibility(View.GONE);

                    homeLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    jobRequestLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    notificationLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    switchLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));

                    //e select niya ang specific nga button
                    networkText.setVisibility(View.VISIBLE);
                    networkImage.setImageResource(R.drawable.baseline_networks_24);
                    networkLayout.setBackgroundResource(R.drawable.round_back_home_100);

                    //create animation sa button
                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 1f, 1f, Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF, 0.0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    networkLayout.startAnimation(scaleAnimation);

                    //e set ang button nga selected siya
                    selectedTab = 2;
                }
            }
        });

        notificationLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //e check niya kung ang button is already selected or not.
                if (selectedTab != 3) {

                    //nag set ug fragments para sa mga button
                    getSupportFragmentManager().beginTransaction()
                            .setReorderingAllowed(true)
                            .replace(R.id.fragmentContainer, NotificationFragment.class, null)
                            .commit();

                    // e disabled niya ang ubang button except ni home button
                    homeText.setVisibility(View.GONE);
                    jobRequestText.setVisibility(View.GONE);
                    networkText.setVisibility(View.GONE);
                    switchText.setVisibility(View.GONE);

                    homeImage.setImageResource(R.drawable.baseline_home_nav);
                    jobRequestImage.setImageResource(R.drawable.baseline_job_request_icon);
                    networkImage.setImageResource(R.drawable.baseline_networks_24);
                    switchImage.setImageResource(R.drawable.baseline_switch_mode_24);


                    logoImageview.setVisibility(View.INVISIBLE);
                    userAccountButton.setVisibility(View.INVISIBLE);
                    notification.setVisibility(View.VISIBLE);
                    logoJobs.setVisibility(View.GONE);

                    homeLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    jobRequestLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    networkLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    switchLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));

                    //e select niya ang specific nga button
                    notificationText.setVisibility(View.VISIBLE);
                    notificationImage.setImageResource(R.drawable.baseline_notifications_nav);
                    notificationLayout.setBackgroundResource(R.drawable.round_back_notification_100);

                    //create animation sa button
                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 1f, 1f, Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF, 0.0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    notificationLayout.startAnimation(scaleAnimation);

                    //e set ang button nga selected siya
                    selectedTab = 3;
                }
            }
        });

        jobRequestLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //e check niya kung ang button is already selected or not.
                if (selectedTab != 4) {

                    //nag set ug fragments para sa mga button
                    getSupportFragmentManager().beginTransaction()
                            .setReorderingAllowed(true)
                            .replace(R.id.fragmentContainer, Save_Jobs_Fragment_jobSeeker.class, null)
                            .commit();

                    // e disabled niya ang ubang button except ni home button
                    homeText.setVisibility(View.GONE);
                    notificationText.setVisibility(View.GONE);
                    networkText.setVisibility(View.GONE);
                    switchText.setVisibility(View.GONE);

                    homeImage.setImageResource(R.drawable.baseline_home_nav);
                    notificationImage.setImageResource(R.drawable.baseline_notifications_nav);
                    networkImage.setImageResource(R.drawable.baseline_networks_24);
                    switchImage.setImageResource(R.drawable.baseline_switch_mode_24);

                    logoImageview.setVisibility(View.INVISIBLE);
                    userAccountButton.setVisibility(View.INVISIBLE);
                    notification.setVisibility(View.GONE);
                    logoJobs.setVisibility(View.VISIBLE);

                    homeLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    notificationLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    networkLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    switchLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));

                    //e select niya ang specific nga button
                    jobRequestText.setVisibility(View.VISIBLE);
                    jobRequestImage.setImageResource(R.drawable.baseline_job_request_icon);
                    jobRequestLayout.setBackgroundResource(R.drawable.round_back_jobrequest_100);

                    //create animation sa button
                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 1f, 1f, Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF, 0.0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    jobRequestLayout.startAnimation(scaleAnimation);

                    //e set ang button nga selected siya
                    selectedTab = 4;
                }
            }
        });


        switchLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //e check niya kung ang button is already selected or not.
                if (selectedTab != 5) {

                    //nag set ug fragments para sa mga button
                    getSupportFragmentManager().beginTransaction()
                            .setReorderingAllowed(true)
                            .replace(R.id.fragmentContainer, Subscribe_Freelance_JobSeeker.class, null)
                            .commit();

                    // e disabled niya ang ubang button except ni home button
                    homeText.setVisibility(View.GONE);
                    notificationText.setVisibility(View.GONE);
                    networkText.setVisibility(View.GONE);
                    jobRequestText.setVisibility(View.GONE);

                    homeImage.setImageResource(R.drawable.baseline_home_nav);
                    notificationImage.setImageResource(R.drawable.baseline_notifications_nav);
                    networkImage.setImageResource(R.drawable.baseline_networks_24);
                    jobRequestImage.setImageResource(R.drawable.baseline_job_request_icon);

                    logoImageview.setVisibility(View.GONE);
                    userAccountButton.setVisibility(View.GONE);
                    notification.setVisibility(View.GONE);
                    logoJobs.setVisibility(View.GONE);

                    homeLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    notificationLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    networkLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    jobRequestLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));

                    //e select niya ang specific nga button
                    switchText.setVisibility(View.VISIBLE);
                    switchImage.setImageResource(R.drawable.baseline_switch_mode_24);
                    switchLayout.setBackgroundResource(R.drawable.round_back_jobrequest_100);

                    //create animation sa button
                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 1f, 1f, Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF, 0.0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    switchLayout.startAnimation(scaleAnimation);

                    //e set ang button nga selected siya
                    selectedTab = 5;
                }
            }
        });

        userAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Job_Seeker_Dashboard.this, JobSeeker_Menu.class));
            }
        });

    }
}