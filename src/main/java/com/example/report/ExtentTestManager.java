package com.example.report;

import com.aventstack.extentreports.ExtentReports;

import java.util.HashMap;

public class ExtentTestManager
{
    private static final Map<Integer, ExtentTestest> extentTestMap = new HashMap<>();
    private static final ExtentReports extent = ExtentManager.getExtentReports();
}
