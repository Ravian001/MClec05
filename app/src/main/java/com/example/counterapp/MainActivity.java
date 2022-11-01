package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnI, btnD, btnR;
    TextView digi;
    int value=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnI = findViewById(R.id.buttonInc);
        btnD = findViewById(R.id.buttonDec);
        btnR = findViewById(R.id.buttonreset);
        digi = findViewById(R.id.textViewer);


        digi.setOnClickListener(new View.OnClickListener() {


        @Override

        public void onClick(View view) {
            String s= Integer.toString(value);
            digi.setText(s);
        }


    });


        btnI.setOnClickListener(new View.OnClickListener() {


            @Override

            public void onClick(View view) {
                value=value+1;
                String s= Integer.toString(value);
                digi.setText(s);
            }


        });



        btnD.setOnClickListener(new View.OnClickListener() {


            @Override

            public void onClick(View view) {
                value=value-1;
                String s= Integer.toString(value);
                digi.setText(s);
            }


        });



        btnR.setOnClickListener(new View.OnClickListener() {


            @Override

            public void onClick(View view) {
                value=0;
                String s= Integer.toString(value);
                digi.setText(s);
            }


        });


}}