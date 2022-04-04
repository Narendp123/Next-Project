package org.stepdefinition;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {

public static void generationSurvey(String jsonpath) {
	
	//1.Mention the File location
	File f = new File("C:\\Users\\nandish\\eclipse-workspace\\CucumberClass\\AllReports\\JvmReport");

    //2.Additional information
	Configuration c = new Configuration(f, "Facebook");
	
	c.addClassifications("OS", "Windows 10");
    c.addClassifications("JDK Version", "1.8");

    //3.Add Json path
    List<String> l = new LinkedList<String>();
    l.add(jsonpath);

    ReportBuilder r = new ReportBuilder(l, c);
    r.generateReports();
}

}
