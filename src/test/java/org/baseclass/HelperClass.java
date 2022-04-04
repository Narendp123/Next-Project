package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HelperClass {
	
public static  WebDriver driver;

public static void launchEdgeDriver() {
WebDriverManager.edgedriver().setup();
driver = new EdgeDriver();
}
public static void getTitle() {
driver.getTitle();
}
public static void maxi() {
driver.manage().window().maximize();
}
public static void getUrl(String url) {
driver.get(url);
}
public static void btnClick(WebElement element) {
element.click();
}
public static void fillText(WebElement element,String value ) {
element.sendKeys(value);
}
public static void CloseBrowser() {
driver.quit();
}
public static void dates() {
Date d = new Date();
System.out.println(d);
}
public static void implictWait() {
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
public static void screenshot(String name) throws IOException {
TakesScreenshot t = (TakesScreenshot) driver;
File src = t.getScreenshotAs(OutputType.FILE);
File des = new File("C:\\Users\\nandish\\eclipse-workspace\\MavenClass\\Screenshot"+name+".png");
FileUtils.copyFile(src,des);
}
public static String getData(String sheetname, int rownumber, int cellnumber) throws IOException {
	File f = new File("C:\\Users\\nandish\\eclipse-workspace\\MavenClass\\External file\\Book1.xlsx");
	FileInputStream fin = new FileInputStream(f);
	Workbook w = new XSSFWorkbook(fin);
	Sheet s = w.getSheet(sheetname);
	Row r = s.getRow(rownumber);
	Cell c = r.getCell(cellnumber);
	
	int cellType = c.getCellType();
	String name="";
	if (cellType==1) {
		name = c.getStringCellValue();
	}else if(cellType==0) {
		if(DateUtil.isCellDateFormatted(c)) {
			Date d = c.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("dd,MMMM,YYYY");
			name = sim.format(d);
		}
	} else {
		
		double dn = c.getNumericCellValue();
		long ln = (long)dn;
		name = String.valueOf(1);
	}
	return name;
	
}
}
