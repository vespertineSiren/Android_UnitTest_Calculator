package com.example.patrickjmartin.androidunittestcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button0, button1, button2, button3,button4,button5, button6, button7,
            button8, button9,
            buttonEquals, buttonDivide, buttonMultiply, buttonMinus, buttonPlus, buttonDot;

    private TextView result, newNumber;

    private String val1, val2, operand;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonDot = findViewById(R.id.buttonDot);

        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);

        result = findViewById(R.id.result);
        newNumber = findViewById(R.id.newNumber);

        val1 = null;
        val2 = null;
        operand = null;



    }

    @Override
    public void onClick(View v) {
        String number = (((Button) v).getText()).toString();
        newNumber.append(number);

    }
}
