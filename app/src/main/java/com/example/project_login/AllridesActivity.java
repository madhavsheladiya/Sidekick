package com.example.project_login;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class AllridesActivity extends AppCompatActivity {

    private Toolbar toolbar;

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allrides);

        toolbar=findViewById(R.id.all_rides);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("See All Rides");

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        recyclerView=findViewById(R.id.recycler_all_rides);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        layoutManager.setReverseLayout(true);
        layoutManager.setStackFromEnd(true);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
    }

    public static class SeeALlViewHolder extends RecyclerView.ViewHolder{
        View myview;
        public SeeALlViewHolder(@NonNull View itemView) {
            super(itemView);
            myview=itemView;
        }
        public void setRideName(String name){

            TextView mTitle=myview.findViewById(R.id.AR_person_name);
            mTitle.setText(name);
        }
        public void setRideDate(String date){
            TextView mDate=myview.findViewById(R.id.AR_date);
            mDate.setText(date);
        }

        public void setRideFrom(String from){

            TextView mDescription=myview.findViewById(R.id.AR_from);
            mDescription.setText(from);
        }

        public void setRideTo(String to){

            TextView mSkills=myview.findViewById(R.id.AR_to);
            mSkills.setText(to);
        }

        public void setRideDateOn(String date_on){

            TextView mSalary=myview.findViewById(R.id.AR_date_on);
            mSalary.setText(date_on);
        }
        public void setRideSeats(String seats){
            TextView mDate=myview.findViewById(R.id.AR_seats);
            mDate.setText(seats);
        }

        public void setRideLuggageInfo(String luggage_info){

            TextView mDescription=myview.findViewById(R.id.AR_luggage_info);
            mDescription.setText(luggage_info);
        }

        public void setRideContact(String contact){

            TextView mSkills=myview.findViewById(R.id.AR_contact);
            mSkills.setText(contact);
        }

        public void setRideBudget(String budget){

            TextView mSalary=myview.findViewById(R.id.AR_Budget);
            mSalary.setText(budget);
        }

    }
}