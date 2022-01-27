package com.example.report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ViewName;
import com.example.base.Constants;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentManager
{
    private static final ExtentReports EXTENT_REPORTS = new ExtentReports();
    private static String reportPath = null;

    static
    {
        String timeStamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
        String reportFileName = "IPS_Automation_Report.html";
        ExtentSparkReporter reporter = new ExtentSparkReporter("extent-reports/" + reportFileName);
        reportPath = Constants.CURRENT_DIR+"/extent-reports/" + reportFileName;
        reporter.viewConfigurer().viewOrder().as(new ViewName[]{ViewName.DASHBOARD, ViewName.CATEGORY, ViewName.TEST, ViewName.EXCEPTION}).apply();

        reporter.config().setReportName("Automation Test Report");
        EXTENT_REPORTS.attachReporter(reporter);
        EXTENT_REPORTS.setSystemInfo("Author", "Automation Team");
        EXTENT_REPORTS.setSystemInfo("Env", "Pre-Production");
    }

    private ExtentManager()
    {
//
    }
    public static ExtentReports getExtentReports(){return EXTENT_REPORTS;}
    public static String getReportPath(){return reportPath;}
}
