package com.example.home2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnOne;
    Button btnTwo;
    Button btnThree;
    Button btnFour;
    Button btnFive;
    Button btnSix;
    Button btnSeven;
    Button btnEight;
    Button btnNine;
    Button btnPlus;
    Button btnMultiply;
    Button btnDivision;
    Button btnPoint;
    Button btnNul;
    Button btnMinus;
    Button btnEqually;
    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnOne = findViewById(R.id.one);
        btnOne.setOnClickListener(this);
        btnTwo = findViewById(R.id.two);
        btnTwo.setOnClickListener(this);
        btnThree = findViewById(R.id.three);
        btnThree.setOnClickListener(this);
        btnFour = findViewById(R.id.four);
        btnFour.setOnClickListener(this);
        btnFive = findViewById(R.id.five);
        btnFive.setOnClickListener(this);
        btnSix = findViewById(R.id.six);
        btnSix.setOnClickListener(this);
        btnSeven = findViewById(R.id.seven);
        btnSeven.setOnClickListener(this);
        btnEight = findViewById(R.id.eight);
        btnEight.setOnClickListener(this);
        btnNine = findViewById(R.id.nine);
        btnNine.setOnClickListener(this);
        btnPlus = findViewById(R.id.plus);
        btnPlus.setOnClickListener(this);
        btnMultiply = findViewById(R.id.multiply);
        btnMultiply.setOnClickListener(this);
        btnDivision = findViewById(R.id.division);
        btnDivision.setOnClickListener(this);
        btnPoint = findViewById(R.id.point);
        btnPoint.setOnClickListener(this);
        btnNul = findViewById(R.id.nul);
        btnNul.setOnClickListener(this);
        btnMinus = findViewById(R.id.minus);
        btnMinus.setOnClickListener(this);
        btnEqually = findViewById(R.id.equally);
        btnEqually.setOnClickListener(this);
        et = findViewById(R.id.et);
        et.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Button btn = (Button) view;
        et.setText(String.format("%s%s", et.getText().toString(),btn.getText().toString()));

    }
}