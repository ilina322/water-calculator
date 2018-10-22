package com.example.android.watercalculator.fragments;

import android.widget.EditText;
import android.widget.TextView;

import com.example.android.watercalculator.Calculator;
import com.example.android.watercalculator.R;

import java.text.DecimalFormat;

import butterknife.BindView;
import butterknife.OnClick;

public class CalculationFragment extends BaseFragment {

    @BindView(R.id.edt_activity)
    EditText edtActivity;
    @BindView(R.id.edt_weight) EditText edtWeight;
    @BindView(R.id.edt_temperature) EditText edtTemperature;
    @BindView(R.id.txt_litres)
    TextView txtLitres;
    Calculator calculator = new Calculator();
    DecimalFormat df = new DecimalFormat("#.00");
    double result;

    @Override
    protected int getLayoutRes() {
        return R.layout.fragment_calculation;
    }

    @Override
    protected void onViewCreated() {
    }

    @OnClick(R.id.btn_calculate)
    public void calculateWaterIntake(){

        int minutesActvity = Integer.parseInt(edtActivity.getText().toString());
        int weight = Integer.parseInt(edtWeight.getText().toString());
        int temperature = Integer.parseInt(edtTemperature.getText().toString());

        result = calculator.calculateResult(weight, minutesActvity, temperature);

        txtLitres.setText("You have to drink " + df.format(result) + " litres today");

    }

    public static CalculationFragment newInstance() {
        return new CalculationFragment();
    }
}
