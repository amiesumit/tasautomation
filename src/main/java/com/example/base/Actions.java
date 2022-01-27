package com.example.base;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.example.report.ExtentTestManager;
import com.example.utils.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.sql.DriverManager;
import java.util.Objects;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Actions
{
    public static final By EFFECTIVE_DATEOFSCHEDULE = By.xpath("//*[@class=\"rdt\"]");
    public static final By EFFECTIVE_DATEOFSCHEDULE_SELECTOR = By.xpath("//*[@class='rdt rdtOpen']");
    public static final By EFFECTIVE_DATEOFSCHEDULE_SELECTORDATE = By.xpath("//*[@class='rdt rdtOpen']//input");

    private static final Logger LOGGER = LogManager.getLogger(Actions.class);

    public static void takeScreenshot()
    {
        String base64Screenshot = ((TakesScreenshot) Objects.requireNonNull(DriverManager.getDriver())).getScreenshotAs(OutputType.BASE64);
        ExtentTestManager.getTest()
                .info("Screenshot", MediaEntityBuilder.createScreenCaptureFromBase64String(base64Screenshot).build());
    }

    public static void sleep(int sleepInSeconds)
    {
        try
        {
            LOGGER.info("Waiting for {} seconds", sleepInSeconds);
            Thread.sleep(sleepInSeconds*1000L);
        }
        catch(Exception e)
        {
//
        }
    }
    public static void openUrl(String url){openUrl(url, "Opened url: "+url);}

    public static void openUrl(String url, String message)
    {
        DriverManager.getDriver().get();
        Helper.log(message);
    }

}
