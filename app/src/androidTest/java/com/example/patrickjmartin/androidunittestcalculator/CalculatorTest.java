package com.example.patrickjmartin.androidunittestcalculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void addSymbolreturnsSameString() {
        assertEquals("+", Calculator.addSymbol("+"));
    }

    @Test
    public void addSymbolshouldReturnMultipleStringsWhenMoreSymbolsAdded() {
        String multipleStringsCombined = "5.92";

        Calculator.addSymbol("5");
        Calculator.addSymbol(".");
        Calculator.addSymbol("9");

        assertEquals(multipleStringsCombined, Calculator.addSymbol("2"));
    }


}