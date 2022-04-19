package com.example.project_login;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class RideDetailsActivity extends AppCompatActivity {

    private Toolbar toolbar;

    private TextView mName;
    private TextView mFrom;
    private TextView mTo;
    private TextView mOn;
    private TextView mSeats;
    private TextView mLuggage_info;
    private TextView mContact;
    private TextView mBudget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ride_details);

        toolbar=findViewById(R.id.toolbar_ride_details);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Ride Details");

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mName=findViewById(R.id.RD_person_name);
        mFrom=findViewById(R.id.RD_from);
        mTo=findViewById(R.id.RD_to);
        mOn=findViewById(R.id.RD_date_on);
        mSeats=findViewById(R.id.RD_seats);
        mLuggage_info=findViewById(R.id.RD_luggage_info);
        mContact=findViewById(R.id.RD_contact);
        mBudget=findViewById(R.id.RD_Budget);

    }
}
