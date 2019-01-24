package com.example.patrickjmartin.androidunittestcalculator;

import android.support.v4.view.PagerTabStrip;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Stack;

public class Calculator {

//    private String currentTotal;
//    private String finalTotal;

    private Double currentValue;
    private String lastOperand;
    NumberFormat stringFormat = new DecimalFormat("#.####");

    public Calculator() {

    }

    public String addOperation(String input1, String input2) {
        Double in1Double = Double.parseDouble(input1);
        Double in2Double = Double.parseDouble(input2);

        currentValue = in1Double + in2Double;
        lastOperand = "+";

        return stringFormat.format(currentValue);
    }

    public String subtractOperation(String input1, String input2) {
        Double in1Double = Double.parseDouble(input1);
        Double in2Double = Double.parseDouble(input2);

        currentValue = in1Double - in2Double;
        lastOperand = "-";

        return stringFormat.format(currentValue);
    }


    public String multiplyOperation(String input1, String input2) {
        Double in1Double = Double.parseDouble(input1);
        Double in2Double = Double.parseDouble(input2);

        currentValue = in1Double * in2Double;
        lastOperand = "*";

        return stringFormat.format(currentValue);
    }


    public String divideOperation(String input1, String input2) {
        Double in1Double = Double.parseDouble(input1);
        Double in2Double = Double.parseDouble(input2);

        if(in2Double == 0) {
            currentValue = 0.0;
            return "DNE";
        } else {
            lastOperand = "-";
            currentValue = in1Double / in2Double;
            return stringFormat.format(currentValue);
        }
    }

    public String equalsOperation() {

        switch (lastOperand) {
            case "+":
                //Do a thing
                break;
            case "-":
                //Do a thing
                break;
            case "*":
                //Do a thing
                break;
            case "/":
                //Do a thing
                break;
            default:
                //HOW?!
                break;
        }
        return stringFormat.format(currentValue);

    }

    public String getCurrentValue() {
        return stringFormat.format(currentValue);
    }
}
