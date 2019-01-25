package com.example.patrickjmartin.androidunittestcalculator;

import org.junit.Before;
import org.junit.Rule;

import androidx.test.rule.ActivityTestRule;

import static org.junit.Assert.*;

public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>
            (MainActivity.class);
}