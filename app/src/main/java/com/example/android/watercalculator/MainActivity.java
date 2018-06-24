package com.example.android.watercalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.edt_activity) EditText edtActivity;
    @BindView(R.id.edt_weight) EditText edtWeight;
    @BindView(R.id.edt_temperature) EditText edtTemperature;
    @BindView(R.id.txt_litres) TextView txtLitres;
    Calculator calculator = new Calculator();
    DecimalFormat df = new DecimalFormat("#.00");
    double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_calculate)
    public void calculateWaterIntake(){

        int minutesActvity = Integer.parseInt(edtActivity.getText().toString());
        int weight = Integer.parseInt(edtWeight.getText().toString());
        int temperature = Integer.parseInt(edtTemperature.getText().toString());

        result = calculator.calculateResult(weight, minutesActvity, temperature);

        txtLitres.setText("You have to drink " + df.format(result) + " litres today");

    }


}
