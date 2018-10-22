package com.example.android.watercalculator.activities;

import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;

import com.example.android.watercalculator.Calculator;
import com.example.android.watercalculator.R;
import com.example.android.watercalculator.fragments.CalculationFragment;

import java.text.DecimalFormat;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @Override
    protected void onViewCreated(Bundle savedInstanceState) {

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, CalculationFragment.newInstance())
                .commit();
    }

    @Override
    protected int getLayoutRes() {
        return R.layout.activity_main;
    }
}
