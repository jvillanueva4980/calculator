package com.example.jvillanueva4980.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class calculator extends AppCompatActivity {

    public void plus(View v)
    {
        EditText ent1 = (EditText) findViewById(R.id.num1);
        EditText ent2 = (EditText)  findViewById(R.id.num2);
        TextView enter = (TextView)findViewById(R.id.ent);
        double num1 = Double.parseDouble(ent1.getText().toString());
        double num2 = Double.parseDouble(ent1.getText().toString());
        enter.setText(num1+" + " + num2 + " = " +(num1+num2));

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
    }
}
