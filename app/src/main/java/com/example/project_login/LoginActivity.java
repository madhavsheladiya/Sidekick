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

public class LoginActivity extends AppCompatActivity {

    //Initialize variables
    EditText inputPasswordLogin, inputEmail;
    Button btnlogin;
    AwesomeValidation awesomeValidation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        TextView btn = findViewById(R.id.btnNewAccount);
        btn.setOnClickListener(view -> startActivity(new Intent(LoginActivity.this, SignupActivity.class)));
        //assign variables
        inputPasswordLogin = findViewById(R.id.inputPasswordLogin);
        inputEmail = findViewById(R.id.inputEmail);
        btnlogin = findViewById(R.id.btnlogin);
        //initialize validation
        awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);
        //add validation for Password
        awesomeValidation.addValidation(this, R.id.inputPasswordLogin,
                ".{6,}", R.string.invalidPassword); //RegexTemplate.NOT_EMPTY
        //add validation for email
        awesomeValidation.addValidation(this, R.id.inputEmail,
                Patterns.EMAIL_ADDRESS, R.string.invalid_email);
        //add validation for Button Login
        btnlogin.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //check validation


                if (awesomeValidation.validate()) {
                    //on Success
                    if(inputEmail.getText().toString().equals("admin@gmail.com"))
                    {
                        if(inputPasswordLogin.getText().toString().equals("Admin@1234"))
                        {
                            Toast.makeText(getApplicationContext(), "Form Validate Successful...", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(),HomepageActivity.class));
                        }
                        else{
                            Toast.makeText(getApplicationContext(), "Validation Failed, Check Password", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Validation Failed, Check Email", Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(getApplicationContext(), "Validation Failed...", Toast.LENGTH_SHORT).show();
                }

            }
        }));
    }
}