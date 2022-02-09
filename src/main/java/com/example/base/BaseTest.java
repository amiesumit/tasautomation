package com.example.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;

public abstract class BaseTest
{
    private static final Logger LOGGER = LogManager.getLogger(BaseTest.class);
    Map<String, String> controllerRowMap;

    public abstract DesiredCapabilities addCapabilities();

    @DataProvider(name = "testDataProvider")
    public static Object[] testDataProvider(Method method) throws IOException
    {

    }
}
