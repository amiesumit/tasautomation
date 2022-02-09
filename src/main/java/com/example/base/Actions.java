package com.example.base;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.example.report.ExtentTestManager;
import com.example.utils.ConfigManager;
import com.example.utils.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.DriverManager;
import java.util.Objects;


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
        DriverManager.getDriver().get(url);
        Helper.log(message);
    }

    public static WebElement find(WebElement webElement)
    {
        WebDriverWait wait = new WebDriverWait(com.example.base.DriverManager.getDriver(),
                Integer.parseInt(ConfigManager.getConfigProperty("explicit.wait.time")));
        return wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }

}
