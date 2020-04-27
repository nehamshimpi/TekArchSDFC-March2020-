package SFDC_project;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SFDC_TC3 extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
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
			System.out.println("Username read from excel file");

			waitForPageElementToBeVisible(driver.findElement(By.xpath("//input[@id='password']")));
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(row2.getCell(1).getStringCellValue());
			System.out.println("Password read from excel file");
			
			waitForPageElementToBeVisible(driver.findElement(By.xpath("//input[@id='rememberUn']")));
			driver.findElement(By.xpath("//input[@id='rememberUn']")).click();
			

			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='Login']"))));
			driver.findElement(By.xpath("//input[@id='Login']")).click();
			
			waitForPageElementToBeVisible(driver.findElement(By.xpath("//div[@id='userNav']")));
			driver.findElement(By.xpath("//div[@id='userNav']")).click();
			
			waitForPageElementToBeVisible(driver.findElement(By.xpath("//a[contains(text(),'Logout')]")));
			driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
			
			//WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'neha')]"));
			//String output=ele.getText();
			System.out.println("Username dispayed");
			

		} catch (Exception E) {
			System.out.println(E);
		}

		Thread.sleep(2000);

		quit_browser();

	}

	}


