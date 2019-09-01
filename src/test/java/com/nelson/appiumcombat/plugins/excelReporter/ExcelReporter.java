package com.nelson.appiumcombat.plugins.excelReporter;
import java.util.List;

import com.nelson.appiumcombat.plugins.excelReporter.utils.CreateExcelForResult;
import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.xml.XmlSuite;

public class ExcelReporter implements IReporter {
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		CreateExcelForResult.createExcelReport(xmlSuites, suites,outputDirectory);
		
	}

	
}
