package com.econlinehub.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class DetailView extends AppCompatActivity {

    TextView name,email,phone;

    String myName,myEmail,myPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        SharedPreferences sp=getSharedPreferences("Myshared_preference",MODE_PRIVATE);

        name=findViewById(R.id.dxt);
        email=findViewById(R.id.dxt1);
        phone=findViewById(R.id.txt2);


        myName=sp.getString("name","");
        myEmail=sp.getString("email","");
        myPassword=sp.getString("result","");


        name.setText(myName);
        email.setText(myEmail);
        phone.setText(String.valueOf(myPassword));

    }
}