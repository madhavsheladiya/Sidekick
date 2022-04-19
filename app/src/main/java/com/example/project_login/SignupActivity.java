package com.example.project_login;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.basgeekball.awesomevalidation.utility.RegexTemplate;

public class SignupActivity extends AppCompatActivity {

    EditText inputUsername, inputEmailSignup, inputPassword, inputConfirmPassword;
    Button btnSignUp;


    AwesomeValidation awesomeValidation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);



        TextView btn = findViewById(R.id.alreadyHaveAccount);
        btn.setOnClickListener(view -> startActivity(new Intent(SignupActivity.this, LoginActivity.class)));

        //assign variables
        inputUsername = findViewById(R.id.inputUsername);
        inputPassword = findViewById(R.id.inputPassword);
        inputConfirmPassword = findViewById(R.id.inputConfirmPassword);
        inputEmailSignup = findViewById(R.id.inputEmailSignup);
        btnSignUp = findViewById(R.id.btnSignUp);

        //initialize validation
        awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);

        //add validation for UserName
        awesomeValidation.addValidation(this, R.id.inputUsername,
                RegexTemplate.NOT_EMPTY, R.string.invalid_username); //RegexTemplate.NOT_EMPTY

        //add validation for email
        awesomeValidation.addValidation(this, R.id.inputEmailSignup,
                Patterns.EMAIL_ADDRESS, R.string.invalid_email);

        //add validation for password
        awesomeValidation.addValidation(this, R.id.inputPassword,
                ".{6,}", R.string.invalidPassword);

        //add validation for confirm password
        awesomeValidation.addValidation(this, R.id.inputConfirmPassword,
                R.id.inputPassword, R.string.invalidConfirmPassword);

        //add validation for button signup
        btnSignUp.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //check validation
                if (awesomeValidation.validate()) {
                    //on Success
                    Toast.makeText(getApplicationContext(), "Form Validate Successful...", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "Validation Failed...", Toast.LENGTH_SHORT).show();
                }

                startActivity(new Intent(getApplicationContext(),LoginActivity.class));
            }
        }));

    }
}