package SFDC_project;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SFDC_TC7 extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launch_Browser("ch");
		
		
			
			LoginToBrowser();
			waitForPageElementToBeVisible(driver.findElement(By.xpath("//div[@id='userNav']")));
			driver.findElement(By.xpath("//div[@id='userNav']")).click();
			
			waitForPageElementToBeVisible(driver.findElement(By.xpath("//a[contains(text(),'My Settings')]")));
			driver.findElement(By.xpath("//a[contains(text(),'My Settings')]")).click();
			
			Thread.sleep(2000);
			
			waitForPageElementToBeVisible(driver.findElement(By.xpath("//div[@id='PersonalInfo']//a[contains(@class,'header setupFolder')][1]")));
			driver.findElement(By.xpath("//div[@id='PersonalInfo']//a[contains(@class,'header setupFolder')][1]")).click();
			
			waitForPageElementToBeVisible(driver.findElement(By.xpath("//span[@id='LoginHistory_font']")));
			driver.findElement(By.xpath("//span[@id='LoginHistory_font']")).click();
			
			
			
			waitForPageElementToBeVisible(driver.findElement(By.xpath("//a[contains(text(),'Download login history for last six months, includ')]")));
			driver.findElement(By.xpath("//a[contains(text(),'Download login history for last six months, includ')]")).click();
			
			Thread.sleep(2000);
			
			waitForPageElementToBeVisible(driver.findElement(By.xpath("//span[@id='DisplayAndLayout_font']")));;
			driver.findElement(By.xpath("//span[@id='DisplayAndLayout_font']")).click();
			
			
			
			waitForPageElementToBeVisible(driver.findElement(By.xpath("//a[@id='CustomizeTabs_font']")));
			driver.findElement(By.xpath("//a[@id='CustomizeTabs_font']")).click();
			
			WebElement city = driver.findElement(By.xpath("//select[@id='p4']"));
			Select dropdown1 = new Select(city);
			dropdown1.selectByIndex(9);
			
			waitForPageElementToBeVisible(driver.findElement(By.xpath("//select[@id='p4']")));
			driver.findElement(By.xpath("//select[@id='p4']")).click();
			
			waitForPageElementToBeVisible(driver.findElement(By.xpath("//img[@class='rightArrowIcon']")));
			driver.findElement(By.xpath("//img[@class='rightArrowIcon']")).click();
			
			waitForPageElementToBeVisible(driver.findElement(By.xpath("//div[@id='EmailSetup']//a[@class='header setupFolder']")));
			driver.findElement(By.xpath("//div[@id='EmailSetup']//a[@class='header setupFolder']")).click();
			
			
			waitForPageElementToBeVisible(driver.findElement(By.xpath("//span[@id='EmailSettings_font']")));
			driver.findElement(By.xpath("//span[@id='EmailSettings_font']")).click();
			
			
			String sFile = "/Users/neha/eclipse-workspace/TekarchSFDCProject/Excel1.xls";
			FileInputStream fi = new FileInputStream(sFile);

			HSSFWorkbook myExcelBook = new HSSFWorkbook(fi);
			HSSFSheet myExcleSheet = myExcelBook.getSheet("EmailData");
			HSSFRow row1 = myExcleSheet.getRow(1);
			HSSFCell login = row1.getCell(0);
			
			WebDriverWait wait = new WebDriverWait(driver, 30);

			waitForPageElementToBeVisible(driver.findElement(By.xpath("//input[@id='sender_name']")));
			WebElement ele1= driver.findElement(By.xpath("//input[@id='sender_name']"));
			ele1.clear();
			ele1.sendKeys(row1.getCell(0).getStringCellValue());
			System.out.println("Sendername read from excel file");

			waitForPageElementToBeVisible(driver.findElement(By.xpath("//input[@id='sender_email']")));
			WebElement ele2= driver.findElement(By.xpath("//input[@id='sender_email']"));
			ele2.clear();
			ele2.sendKeys(row1.getCell(1).getStringCellValue());
			System.out.println("Sender email read from excel file");
			
			waitForPageElementToBeVisible(driver.findElement(By.id("auto_bcc1")));
			driver.findElement(By.id("auto_bcc1")).click();
			
			
			Thread.sleep(2000);
			waitForPageElementToBeVisible(driver.findElement(By.xpath("//input[@name='save']")));
			driver.findElement(By.xpath("//input[@name='save']")).click();
			
			
			waitForPageElementToBeVisible(driver.findElement(By.xpath("//span[@id='CalendarAndReminders_font']")));
			WebElement calnrem = driver.findElement(By.xpath("//span[@id='CalendarAndReminders_font']"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView()", calnrem);
			
			calnrem.click();
			
			
			
			waitForPageElementToBeVisible(driver.findElement(By.xpath("//span[@id='CalendarAndReminders_font']")));
			driver.findElement(By.xpath("//span[@id='CalendarAndReminders_font']"));

			Thread.sleep(1000);
			waitForPageElementToBeVisible(driver.findElement(By.xpath("//a[@id='Reminders_font']")));
			driver.findElement(By.xpath("//a[@id='Reminders_font']")).click();
			
			Thread.sleep(1000);
			waitForPageElementToBeVisible(driver.findElement(By.xpath("//input[@id='testbtn']")));
			driver.findElement(By.xpath("//input[@id='testbtn']")).click();
			
			System.out.println("Test case 7 Complteted");
			
			
			Thread.sleep(1000);
			
		

		

		quit_browser();


	}


}
