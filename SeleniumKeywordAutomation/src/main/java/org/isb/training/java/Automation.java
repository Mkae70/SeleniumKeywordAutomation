package org.isb.training.java;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Sheet;
import jxl.read.biff.BiffException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Automation {
	final static Logger logger = Logger.getLogger(Automation.class);
	public static void main(String[] args) throws BiffException, IOException {
		
//		Driver d = new Driver();
		ExcelSheetDriver excelSheetDriver = new ExcelSheetDriver();
		Sheet testSuitesheet = excelSheetDriver.getWorksheet("./TestCases/TestSuite.xls", "Sheet1");
		
		int c = excelSheetDriver.columnCount();
		int r = excelSheetDriver.rowCount();

		for(int i = 1;i<r;i++)
		{
			String SNo = excelSheetDriver.readCell(testSuitesheet,0, i);

			String Description = excelSheetDriver.readCell(testSuitesheet,1, i);
			String ExecutionFlag = excelSheetDriver.readCell(testSuitesheet,2, i);
//			logger.info("TestSuite:" + SNo);
//			logger.info("TestSuite:" + Description);
//			logger.info("TestSuite:" + ExecutionFlag);
			
			System.out.println("TestSuite:" + SNo);
			System.out.println("TestSuite:" + Description);
			System.out.println("TestSuite:" + ExecutionFlag);

	}
	}
}
