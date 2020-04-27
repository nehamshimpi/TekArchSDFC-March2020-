package SFDC_project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//import Selenium_Proj.LaunchBrowser;

public class SFDC_TC1 extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		
		launch_Browser("ch");
		String sFile = "/Users/neha/eclipse-workspace/TekarchSFDCProject/Excel1.xls";
		
		try {
			
			FileInputStream fi = new FileInputStream(sFile);

			HSSFWorkbook myExcelBook = new HSSFWorkbook(fi);
			HSSFSheet myExcleSheet = myExcelBook.getSheet("UserNamePwd");
			HSSFRow row2 = myExcleSheet.getRow(2);
			HSSFCell login = row2.getCell(0);
			
			WebDriverWait wait = new WebDriverWait(driver, 30);

			waitForPageElementToBeVisible(driver.findElement(By.xpath("//input[@id='username']")));
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys(row2.getCell(0).getStringCellValue());
			System.out.println();
			System.out.println("Username read from excel file");
			System.out.println();

			waitForPageElementToBeVisible(driver.findElement(By.xpath("//input[@id='Login']")));
			driver.findElement(By.xpath("//input[@id='Login']")).click();
			
			WebElement ele = driver.findElement(By.xpath("//div[@id='error']"));
			String error=ele.getText();
			System.out.println(error);
			
		} catch (Exception E) {
			System.out.println(E);
		}

		Thread.sleep(2000);

		quit_browser();
	}

}
