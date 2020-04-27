package SFDC_project;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;

public class SFDC_TC30 extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		launch_Browser("ch");

		LoginToBrowser();

		// + TAB
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//li[@id='AllTab_Tab']//a")));
		driver.findElement(By.xpath("//li[@id='AllTab_Tab']//a")).click();

		Thread.sleep(1000);

		waitForPageElementToBeVisible(
				driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject contactBlock title')]")));
		driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject contactBlock title')]")).click();

		Thread.sleep(1000);
		// POP UP
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")));
		driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")).click();

		// Create New View Link
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Create New View')]")).click();
		
		Thread.sleep(2000);

		String sFile = "/Users/neha/eclipse-workspace/TekarchSFDCProject/Excel1.xls";
		FileInputStream fi = new FileInputStream(sFile);

		HSSFWorkbook myExcelBook = new HSSFWorkbook(fi);
		HSSFSheet myExcleSheet = myExcelBook.getSheet("New View");
		HSSFRow row2 = myExcleSheet.getRow(2);

		// VIEW UNIQUE NAME

		waitForPageElementToBeVisible(driver.findElement(By.xpath("//input[@id='devname']")));
		driver.findElement(By.xpath("//input[@id='devname']")).sendKeys(row2.getCell(1).getStringCellValue());
		
		Thread.sleep(2000);
		//CLICK SAVE BUTTON
		
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='save']")));
		driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='save']")).click();
		
		Thread.sleep(2000);
		
		System.out.println("TestCase 30 Executed");

		quit_browser();
	}

}
