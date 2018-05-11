package com.example.android.watercalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class ProgressActivity extends AppCompatActivity {

    private static final String TAG = "ProgressActivity";
    @BindView(R.id.txt_water) TextView txtWater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_increment)
    public void incrementProgress(){
        txtWater.setBackgroundColor(100);
        Log.e(TAG, "incrementProgress");
    }


}
