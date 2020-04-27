package SFDC_project;

import java.io.FileInputStream;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SFDC_TC14 extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		launch_Browser("ch");

		LoginToBrowser();

		// + TAB

		waitForPageElementToBeVisible(driver.findElement(By.xpath("//li[@id='AllTab_Tab']//a")));
		driver.findElement(By.xpath("//li[@id='AllTab_Tab']//a")).click();

		Thread.sleep(2000);

		// ACCOUNTS LINK

		waitForPageElementToBeVisible(driver.findElement(By.xpath("//a[@class='listRelatedObject accountBlock title']")));
		driver.findElement(By.xpath("//a[@class='listRelatedObject accountBlock title']")).click();
		System.out.println("Account link clicked");
		System.out.println();

		// POPUP PAGE
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")));
		driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")).click();
		
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Accounts with last activity > 30 days')]")).click();
		
		
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//img[@id='ext-gen152']")));
		driver.findElement(By.xpath("//img[@id='ext-gen152']")).click();
		
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//table[@id='ext-comp-1111']//td[@class='x-btn-mc']")));
		driver.findElement(By.xpath("//table[@id='ext-comp-1111']//td[@class='x-btn-mc']")).click();
		
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//button[@id='ext-gen49']")));
		driver.findElement(By.xpath("//button[@id='ext-gen49']")).click();
		
		//SAVE WINDOW
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		 
		for(String handle : allWindowHandles)
		{
		//System.out.println("Switching to window - > " + handle);
		driver.switchTo().window(handle); //Switch to the desired window first and then execute commands using driver
		//driver.get("<a href="http://google.com">http://google.com</a>");
		}
		 
		
		/*String sFile = "/Users/neha/eclipse-workspace/TekarchSFDCProject/Excel1.xls";
		FileInputStream fi = new FileInputStream(sFile);

		HSSFWorkbook myExcelBook = new HSSFWorkbook(fi);
		HSSFSheet myExcleSheet = myExcelBook.getSheet("Save Report");
		HSSFRow row1 = myExcleSheet.getRow(1);
		HSSFCell login = row1.getCell(0);
	
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//input[@id='saveReportDlg_reportNameField']")));
		WebElement ele1= driver.findElement(By.xpath("//input[@id='saveReportDlg_reportNameField']"));
		ele1.clear();
		ele1.sendKeys(row1.getCell(0).getStringCellValue());
		
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//input[@id='saveReportDlg_DeveloperName']")));
		WebElement ele2= driver.findElement(By.xpath("//input[@id='saveReportDlg_DeveloperName']"));
		ele2.clear();
		ele2.sendKeys(row1.getCell(1).getStringCellValue());*/
		
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//input[@id='saveReportDlg_reportNameField']")));
		driver.findElement(By.xpath("//input[@id='saveReportDlg_reportNameField']")).sendKeys("DailyReport");
		
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//input[@id='saveReportDlg_DeveloperName']")));
		driver.findElement(By.xpath("//input[@id='saveReportDlg_DeveloperName']")).sendKeys("KattieReport");
		
		waitForPageElementToBeVisible(driver.findElement(By.id("dlgSaveAndRun")));
		driver.findElement(By.id("dlgSaveAndRun")).click();
	
		driver.switchTo().defaultContent();
		
		
		Thread.sleep(2000);
		

		System.out.println("TestCase 14 Executed");
		quit_browser();

	}

}
