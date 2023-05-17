package com.example.e_plant;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class loginScreenActivity extends AppCompatActivity {

    AppCompatButton btnSignin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
        initview();
    }

    private void initview() {
        btnSignin = findViewById( R.id.btnSignin);

        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(loginScreenActivity.this,WelcomeActivity.class);
                startActivity(i);
            }
        });
    }
}