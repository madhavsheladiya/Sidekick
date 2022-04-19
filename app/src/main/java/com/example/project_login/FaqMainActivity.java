package com.example.project_login;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FaqMainActivity extends AppCompatActivity {

    private Toolbar toolbar;

    RecyclerView recyclerView;
    List<Description> descriptionList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq_main);

        toolbar=findViewById(R.id.Faq_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("FAQ");

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        recyclerView = findViewById(R.id.recyclerView);

        initData();
        setRecyclerView();

    }

    private void setRecyclerView() {
        DescriptionAdapter descriptionAdapter = new DescriptionAdapter(descriptionList);
        recyclerView.setAdapter(descriptionAdapter);
        recyclerView.setHasFixedSize(true);
    }

    private void initData() {
        descriptionList = new ArrayList<>();
        descriptionList.add(new Description("What is the student essential documents in Canada and how to apply?",
                "Every immigrant is expected to have a Social Insurance Number (SIN).\n\n" +
                        "In Windsor, you can avail the services like SIN in Service Canada in Windsor city hall."));
        descriptionList.add(new Description("How to avail transit pass in Windsor, Canada?",
                "You can avail the transit pass for bus near Transit, Windsor"));
        descriptionList.add(new Description("What are Do’s and Don’ts as a student?",
                "Do’s\n" +
                        "•\tMaintain a well-balanced lifestyle (academics, work, health and wellness, social life).\n" +
                        "•\tSet goals to accomplish tasks.\n" +
                        "•\tWhen new in the city, take care of health. Climatic conditions change every day and until you adapt it’s better to take care.\n" +
                        "•\tKeep good relationships with people at university and work.\n\n" +
                        "Dont’s\n" +
                        "•\tProcrastinate. \n" +
                        "•\tDon’t roam without masks at public places.\n" +
                        "•\tNever break the rules.\n"));
        descriptionList.add(new Description("What are the services available at service Canada?",
                "You can obtain the following services at service Canada\n\n" +
                        "•\tSocial insurance number\n" +
                        "•\tImmediate request for Passport service\n" +
                        "•\tEmployment insurance\n" +
                        "•\tGuaranteed income supplement benefits\n" +
                        "•\tVeterans Affairs Canada services\n"));
    }
}