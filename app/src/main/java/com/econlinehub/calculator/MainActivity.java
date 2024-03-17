package com.econlinehub.calculator;

import static android.app.PendingIntent.getActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText input1, input2;
    Button equal;
    Button sub;
    Button multy;
    Button divi;

    Button  data;
    TextView result;
    TextView Show;
    TextView Shoe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = findViewById(R.id.num1);
        input2 = findViewById(R.id.num2);
        equal = findViewById(R.id.btn);
        sub = findViewById(R.id.btn1);
        multy = findViewById(R.id.btn21);
        divi = findViewById(R.id.btn3);
        data = findViewById(R.id.data);
        Show = findViewById(R.id.dxt);
        Shoe = findViewById(R.id.dxt1);
        result = findViewById(R.id.txt);

       equal.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               int a = Integer.parseInt(input1.getText().toString());
               int b = Integer.parseInt(input2.getText().toString());


               String c = String.valueOf((a*100)/b);

               result.setText(c);


           }
       });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(input1.getText().toString());
                int b = Integer.parseInt(input2.getText().toString());

                String d = String.valueOf(a - b);

                result.setText(d);

            }
        });


    multy.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int a = Integer.parseInt(input1.getText().toString());
            int b = Integer.parseInt(input2.getText().toString());

            String e = String.valueOf(a * b);

            result.setText(e);

        }
    });
        divi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(input1.getText().toString());
                int b = Integer.parseInt(input2.getText().toString());

                String f = String.valueOf(a / b);

                result.setText(f);

            }
        });
        data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sharedPreferences = getSharedPreferences("Myshared_preference", MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("name", input1.getText().toString());
                editor.putString("email", input2.getText().toString());
                editor.putString("result", result.getText().toString());
                editor.apply();
                Intent intent = new Intent(MainActivity.this,DetailView.class);
                startActivity(intent);
            }
        });

}}