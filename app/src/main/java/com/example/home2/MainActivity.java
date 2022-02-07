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
        initView();
        initOnclic();

    }

    private void initOnclic() {
        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);
        btnFour.setOnClickListener(this);
        btnFive.setOnClickListener(this);
        btnSix.setOnClickListener(this);
        btnSeven.setOnClickListener(this);
        btnEight.setOnClickListener(this);
        btnNine.setOnClickListener(this);
        btnPlus.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnDivision.setOnClickListener(this);
        btnPoint.setOnClickListener(this);
        btnNul.setOnClickListener(this);
        btnMinus.setOnClickListener(this);
        btnEqually.setOnClickListener(this);
        et.setOnClickListener(this);
    }

    private void initView() {
        btnOne = findViewById(R.id.one);
        btnTwo = findViewById(R.id.two);
        btnThree = findViewById(R.id.three);
        btnFour = findViewById(R.id.four);
        btnFive = findViewById(R.id.five);
        btnSix = findViewById(R.id.six);
        btnSeven = findViewById(R.id.seven);
        btnEight = findViewById(R.id.eight);
        btnNine = findViewById(R.id.nine);
        btnPlus = findViewById(R.id.plus);
        btnMultiply = findViewById(R.id.multiply);
        btnDivision = findViewById(R.id.division);
        btnPoint = findViewById(R.id.point);
        btnNul = findViewById(R.id.nul);
        btnMinus = findViewById(R.id.minus);
        btnEqually = findViewById(R.id.equally);
        et = findViewById(R.id.et);
    }

    @Override
    public void onClick(View view) {
        Button btn = (Button) view;
        et.setText(String.format("%s%s", et.getText().toString(),btn.getText().toString()));

    }
}