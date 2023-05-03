package com.example.e_plant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;

public class IntroductionScreen extends AppCompatActivity {

    AppCompatButton btnSignin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction_screen);
        initview();
    }

    private void initview() {

        btnSignin = findViewById( R.id.btnSignin);

        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(IntroductionScreen.this,loginScreenActivity.class);
                startActivity(i);
            }
        });
    }
}