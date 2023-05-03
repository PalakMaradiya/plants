package com.example.e_plant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity {

    TextView txtLogin,txtforgotpassword;

    AppCompatButton btnSignin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        initview();
    }

    private void initview() {

        txtLogin = findViewById(R.id.txtLogin);
        btnSignin = findViewById(R.id.btnSignin);
        txtforgotpassword = findViewById(R.id.txtforgotpassword);

        txtLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  i = new Intent(SignUpActivity.this,loginScreenActivity.class);
                startActivity(i);
            }
        });


        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(SignUpActivity.this,WelcomeActivity.class);
                startActivity(i);
            }
        });


        txtforgotpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(SignUpActivity.this, VerifictionActivity.class);
                startActivity(i);
            }
        });
    }
}