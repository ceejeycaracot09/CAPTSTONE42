package com.example.jobconnectui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

public class SignUp extends AppCompatActivity {

    SwitchCompat switchButton;
    EditText companyNameText;
    EditText workerFirstNameText;
    EditText workerLastNameText;
    EditText workerEmailText;
    EditText workerPasswordText;

    CardView workercardview;

    CardView employeecardview;

    Button signUpButton;

    TextView Redirect_SignIn;

    CheckBox Redirect_terms_and_conditions;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        switchButton = findViewById(R.id.switchCompatButton);
        companyNameText = findViewById(R.id.employeeCompanyName);
        workerFirstNameText = findViewById(R.id.workerFirstNameText);
        workerLastNameText = findViewById(R.id.workerEmailText);
        workerEmailText = findViewById(R.id.workerPasswordText);
        workerPasswordText = findViewById(R.id.workerPasswordText);
        workercardview = findViewById(R.id.workercardview);
        employeecardview = findViewById(R.id.employeecardview);

        signUpButton = findViewById(R.id.signUpButton);
        Redirect_SignIn = findViewById(R.id.already_Have_account);
        Redirect_terms_and_conditions = findViewById(R.id.terms_and_conditions);

        workercardview.setVisibility(View.VISIBLE);
        employeecardview.setVisibility(View.INVISIBLE);

        switchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (buttonView.isChecked()){
                    employeecardview.setVisibility(View.VISIBLE);
                    workercardview.setVisibility(View.INVISIBLE);
                }else{
                    workercardview.setVisibility(View.VISIBLE);
                    employeecardview.setVisibility(View.INVISIBLE);
                }

            }
        });

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (switchButton.isChecked()) {
                    // Redirect to the employee dashboard
                    startActivity(new Intent(SignUp.this, Edit_Profile_Hirer.class));
                } else {
                    // Redirect to the worker dashboard
                    startActivity(new Intent(SignUp.this, Edit_Profile_Job_Seeker.class));
                }
            }
        });

        Redirect_SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignUp.this, SignIn.class));
            }
        });

        Redirect_terms_and_conditions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignUp.this, Terms_and_Conditions.class));
            }
        });


    }
}