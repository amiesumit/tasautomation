package com.example.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.sql.DriverManager;

public class Helper
{
    private static final Logger LOGGER = LogManager.getLogger(Helper.class);

    private Helper()
    {

    }

    public static void sleep(int sleepInSeconds)
    {
        try
        {
            LOGGER.info("Waiting for seconds: " +sleepInSeconds);
            Thread.sleep(sleepInSeconds * 1000L);
        }
        catch (Exception e)
        {
            //
        }
    }

    public static byte[] takeScreenshot()
    {
        return ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
    }

    public static String log(String message)
    {
        LOGGER.info(message);
        Reporter.log(message);
        ExtentTestManager.get
    }
}
