package com.example.bb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class fSelectRegistrationActivity extends AppCompatActivity {

    private Button donorButton,recipientButton;
    private TextView backButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.factivity_select_registration);

        donorButton=findViewById(R.id.donorButton);
        recipientButton= findViewById(R.id.recipientButton);
        backButton=findViewById(R.id.backButton);

        donorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(fSelectRegistrationActivity.this,fDonarRegistrationActivity.class);
                startActivity(intent);
            }
        });
        recipientButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(fSelectRegistrationActivity.this,RecipientRegistrationActivity.class);
                startActivity(intent);
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(fSelectRegistrationActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}