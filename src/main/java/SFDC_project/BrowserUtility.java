package SFDC_project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtility {
	
	public static WebDriver driver = null;

	static void launch_Browser(String str) throws Exception {
		// TODO Auto-generated method stub

		if (str.startsWith("ch")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		} else if (str.startsWith("ff")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else {
			System.out.println("You have not given correct type of browser. ");
		
		}

		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
	}

	static void quit_browser() {
		
		driver.quit();
	
	}

	public static void LoginToBrowser() throws IOException  {
			
		WebDriverWait wait = new WebDriverWait(driver, 30);
		String sFile = "/Users/neha/eclipse-workspace/TekarchSFDCProject/Excel1.xls";
		
		FileInputStream fi = new FileInputStream(sFile);

		HSSFWorkbook myExcelBook = new HSSFWorkbook(fi);
		HSSFSheet myExcleSheet = myExcelBook.getSheet("UserNamePwd");
		HSSFRow row2 = myExcleSheet.getRow(2);
		HSSFCell login = row2.getCell(0);
		
		//WebDriverWait wait = new WebDriverWait(driver, 30);

		waitForPageElementToBeVisible(driver.findElement(By.xpath("//input[@id='username']")));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(row2.getCell(0).getStringCellValue());
		System.out.println("Username read from excel file");

		waitForPageElementToBeVisible(driver.findElement(By.xpath("//input[@id='password']")));
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(row2.getCell(1).getStringCellValue());
		System.out.println("Password read from excel file");

		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='Login']"))));
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		
		
	}

	public static void waitForPageElementToBeVisible(WebElement element) {
		WebDriverWait wait = new WebDriverWait(BrowserUtility.driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

}
