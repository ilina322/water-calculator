package com.example.android.watercalculator.fragments;

import android.util.Log;
import android.widget.TextView;

import com.example.android.watercalculator.R;

import butterknife.BindView;
import butterknife.OnClick;

public class ProgressFragment extends BaseFragment {

    private static final String TAG = "ProgressActivity";
    @BindView(R.id.view_water)
    TextView viewWater;

    @Override
    protected int getLayoutRes() {
        return R.layout.fragment_progress;
    }

    @Override
    protected void onViewCreated() {

    }


    @OnClick(R.id.btn_increment)
    public void incrementProgress(){
        //TODO: update
        viewWater.setBackgroundColor(100);
        Log.e(TAG, "incrementProgress");
    }
}
