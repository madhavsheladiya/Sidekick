package com.example.project_login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Postride extends AppCompatActivity {
    private FloatingActionButton fabBtn;

    private Toolbar toolbar;

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_postride);

        toolbar=findViewById(R.id.toolbar_post_ride);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Post Rides");

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        fabBtn=findViewById(R.id.PR_fab_add);

        recyclerView=findViewById(R.id.recycler_post_ride_id);
        LinearLayoutManager layoutManager= new LinearLayoutManager(this);
        layoutManager.setStackFromEnd(true);
        layoutManager.setReverseLayout(true);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);

        fabBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),PostRide_Insert.class));
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder{
        View myview;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            myview=itemView;
        }
        public void setRideName(String name){

            TextView mTitle=myview.findViewById(R.id.PR_person_name);
            mTitle.setText(name);
        }
        public void setRideDate(String date){
            TextView mDate=myview.findViewById(R.id.PR_date);
            mDate.setText(date);
        }

        public void setRideFrom(String from){

            TextView mDescription=myview.findViewById(R.id.PR_from);
            mDescription.setText(from);
        }

        public void setRideTo(String to){

            TextView mSkills=myview.findViewById(R.id.PR_to);
            mSkills.setText(to);
        }

        public void setRideDateOn(String date_on){

            TextView mSalary=myview.findViewById(R.id.PR_date_on);
            mSalary.setText(date_on);
        }
        public void setRideSeats(String seats){
            TextView mDate=myview.findViewById(R.id.PR_seats);
            mDate.setText(seats);
        }

        public void setRideLuggageInfo(String luggage_info){

            TextView mDescription=myview.findViewById(R.id.PR_luggage_info);
            mDescription.setText(luggage_info);
        }

        public void setRideContact(String contact){

            TextView mSkills=myview.findViewById(R.id.PR_contact);
            mSkills.setText(contact);
        }

        public void setRideBudget(String budget){

            TextView mSalary=myview.findViewById(R.id.PR_Budget);
            mSalary.setText(budget);
        }

    }

}
