package com.example.patrickjmartin.androidunittestcalculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    


//    Old Test
//    @Test
//    public void addSymbolreturnsSameStringInitially() {
//        //Setup
//        String expected = "+";
//
//        //Execution
//        String actual = calculator.addSymbol("+");
//
//        //Check
//        //Success
//        assertEquals("+", calculator.addSymbol("+"));
//    }

//    Old Test
//    @Test
//    public void addSymbolshouldReturnMultipleStringsWhenMoreSymbolsAdded() {
//        String multipleStringsCombined = "5.92";
//
//        Calculator.addSymbol("5");
//        Calculator.addSymbol(".");
//        Calculator.addSymbol("9");
//
//        //Failure
//        assertEquals(multipleStringsCombined, calculator.addSymbol("2"));
//    }


}