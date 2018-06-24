package com.example.android.watercalculator;

public class Calculator {

    private static final String TAG = "Calculator";

    public double calculateResult(int kgWeight, int minutesActivity, int temperature) {

        double lblWeight = kgToLbl(kgWeight);
        double result;

        result = lblWeight * 0.5;
        result += (minutesActivity / 30 * 12);
        if (temperature >= 25) {
            result += 30;
        }
        result = ozToLitre(result);
        return result;
    }

    private double kgToLbl(int kg){
        return kg * 2.2;
    }

    private double ozToLitre(double waterOz) {
        return waterOz * 0.03;
    }

}
