package com.example.listener;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

public class AnnotationTransformer implements IAnnotationTransformer
{
    private static final Logger LOGGER = LogManager.getLogger(AnnotationTransformer.class);

    @Override
    public void transform(ITestAnnotation annotation, class testClass, Constructor testConstructor, Method testMethod)
    {
        List<Map<String, String>> excelRow;
        try
        {
            excelRow = ExcelManager
        }

    }
}
