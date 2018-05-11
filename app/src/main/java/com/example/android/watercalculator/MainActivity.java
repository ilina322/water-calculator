package com.example.android.watercalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.edt_activity) EditText edtActivity;
    @BindView(R.id.edt_weight) EditText edtWeight;
    @BindView(R.id.edt_temperature) EditText edtTemperature;
    @BindView(R.id.txt_litres) TextView txtLitres;
    double result = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_calculate)
    public void calculateLitres(){

        int minutesActvity = Integer.parseInt(edtActivity.getText().toString());
        int weight = Integer.parseInt(edtWeight.getText().toString());
        int temperature = Integer.parseInt(edtTemperature.getText().toString());

        result = weight * 0.5;
        result += (minutesActvity/30*12);

        txtLitres.setText(Double.toString(result));

    }

    @OnClick(R.id.btn_switch)
    public void goToProgressActivity(){
        Intent intent = new Intent(MainActivity.this, ProgressActivity.class);
        startActivity(intent);
    }



}
