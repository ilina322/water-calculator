package com.example.android.watercalculator.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toolbar;

import com.example.android.watercalculator.R;

import butterknife.ButterKnife;

public abstract class BaseActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(getLayoutRes());
        ButterKnife.bind(this);
        onViewCreated(savedInstanceState);
    }

    protected abstract void onViewCreated(Bundle savedInstanceState);

    protected abstract int getLayoutRes();
}
