package com.techment.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.techment.utility.ExcelOperations;
import com.techment.utility.FunctionsLibrary;

public class Test1 extends FunctionsLibrary {

	ExtentReports e = new ExtentReports(System.getProperty("user.dir") + "\\Report\\report.html");

	@BeforeClass
	public void beforeClass() {
		ExtentTest createTest = e.startTest("test");

	}`

	@Test
	public void tc1() throws Throwable {
		String name=ExcelOperations.getExcelData(2, "name");
		System.out.println(name);

	}

	@AfterClass
	public void afterClass() {
		// TODO Auto-generated method stub

	}

}
