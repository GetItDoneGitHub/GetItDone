package com.example.thomas.getitdone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //Create new account handler
        Button yourButton = (Button) findViewById(R.id.createAccount);

        yourButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //startActivity(new Intent(SignUpActivity.this, MapsActivity.class));
            }
        });

        //Terms and condition handler
        TextView legal = (TextView) findViewById(R.id.legal);

        legal.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(SignUpActivity.this, TermsAndConditionActivity.class));
            }
        });

    }

}


