package com.example.android.watercalculator.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.ButterKnife;

public abstract class BaseFragment extends Fragment {

    private View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(getLayoutRes(), container, false);
        ButterKnife.bind(this, rootView);
        onViewCreated();
        return rootView;
    }

    protected abstract int getLayoutRes();

    protected abstract void onViewCreated();
}
