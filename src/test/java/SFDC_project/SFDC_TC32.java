package SFDC_project;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;

public class SFDC_TC32 extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		launch_Browser("ch");

		LoginToBrowser();

		// + TAB
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//li[@id='AllTab_Tab']//a")));
		driver.findElement(By.xpath("//li[@id='AllTab_Tab']//a")).click();

		Thread.sleep(1000);

		//CONTACTS
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject contactBlock title')]")));
		driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject contactBlock title')]")).click();

		Thread.sleep(1000);
		// POP UP
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")));
		driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")).click();
		
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//input[@name='new']")));
		driver.findElement(By.xpath("//input[@name='new']")).click();
		
		String sFile = "/Users/neha/eclipse-workspace/TekarchSFDCProject/Excel1.xls";
		FileInputStream fi = new FileInputStream(sFile);

		HSSFWorkbook myExcelBook = new HSSFWorkbook(fi);
		HSSFSheet myExcleSheet = myExcelBook.getSheet("Contact");
		HSSFRow row2 = myExcleSheet.getRow(2);
		
		//LAST NAME
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//input[@id='name_firstcon2']")));
		driver.findElement(By.xpath("//input[@id='name_firstcon2']")).sendKeys(row2.getCell(0).getStringCellValue());
		
		
		//ACCOUNT NAME

		waitForPageElementToBeVisible(driver.findElement(By.xpath("//input[@id='con4']")));
		driver.findElement(By.xpath("//input[@id='con4']")).sendKeys(row2.getCell(1).getStringCellValue());
		
		//SAVE AND NEW BUTTON
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//td[@id='topButtonRow']//input[contains(@name,'save_new')]")));
		driver.findElement(By.xpath("//td[@id='topButtonRow']//input[contains(@name,'save_new')]")).click();
		
		Thread.sleep(5000);
		
		System.out.println("TestCase 30 Executed");

		quit_browser();

	}

}
