package com.learning.day1;

public class Numerator {
    int number;
    float aFloat;

    public Numerator(int num) {
        number = num;
    }

    public Numerator(float num) {
        aFloat = Math.abs(num);
    }

    public String sign() {
        return number > 0 ? "Positive" : "Negative";
    }

    public String floatEvaluate() {
        String resultString;

        if(aFloat == 0)
            resultString = "Zero";
        else if(aFloat > 0) {
            resultString = "Positive";
        } else {
            resultString = "Negative";
        }

        if (Math.abs(aFloat) < 1) {
            resultString += " Small";
        } else if(Math.abs(aFloat) > 1000000) {
            resultString += " Large";
        }

        return resultString;
    }
}
