package SFDC_project;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;

public class SFDC_TC24 extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launch_Browser("ch");

		LoginToBrowser();

		// + TAB
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//li[@id='AllTab_Tab']//a")));
		driver.findElement(By.xpath("//li[@id='AllTab_Tab']//a")).click();

		Thread.sleep(1000);

		// Leads Link
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//a[@class='listRelatedObject leadBlock title']")));
		driver.findElement(By.xpath("//a[@class='listRelatedObject leadBlock title']")).click();

		Thread.sleep(1000);
		// POP UP
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")));
		driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")).click();
		
		Thread.sleep(1000);
		
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//input[@name='new']")));
		driver.findElement(By.xpath("//input[@name='new']")).click();
		
		Thread.sleep(2000);
		
		//Lead Page
		String sFile = "/Users/neha/eclipse-workspace/TekarchSFDCProject/Excel1.xls";
		FileInputStream fi = new FileInputStream(sFile);
		
		HSSFWorkbook myExcelBook = new HSSFWorkbook(fi);
		HSSFSheet myExcleSheet = myExcelBook.getSheet("LeadTab");
		HSSFRow row1 = myExcleSheet.getRow(1);
		HSSFCell login = row1.getCell(0);
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//input[@id='name_lastlea2']")));
		driver.findElement(By.xpath("//input[@id='name_lastlea2']")).sendKeys(row1.getCell(0).getStringCellValue());
		
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//input[@id='lea3']")));
		driver.findElement(By.xpath("//input[@id='lea3']")).sendKeys(row1.getCell(1).getStringCellValue());
		
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[1]")));
		driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[1]")).click();
		
		Thread.sleep(1000);

		System.out.println("TestCase 24 Executed");
		
		quit_browser();



	}

}
