package SFDC_project;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SFDC_TC11 extends BrowserUtility  {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launch_Browser("ch");
		
		LoginToBrowser();
		
		//+TAB
		
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//li[@id='AllTab_Tab']//a")));
		driver.findElement(By.xpath("//li[@id='AllTab_Tab']//a")).click();
		
		Thread.sleep(2000);
		
		//ACCOUNTS  LINK
		
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//a[@class='listRelatedObject accountBlock title']")));
		driver.findElement(By.xpath("//a[@class='listRelatedObject accountBlock title']")).click();
		System.out.println("Account link clicked");
		System.out.println();
		
		//POPUP PAGE
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")));
		driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")).click();
		
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//span[contains(@class,'fFooter')]")));
		driver.findElement(By.xpath("//span[contains(@class,'fFooter')]")).click();
		
		String sFile = "/Users/neha/eclipse-workspace/TekarchSFDCProject/Excel1.xls";
		FileInputStream fi = new FileInputStream(sFile);

		HSSFWorkbook myExcelBook = new HSSFWorkbook(fi);
		HSSFSheet myExcleSheet = myExcelBook.getSheet("New View");
		HSSFRow row1 = myExcleSheet.getRow(1);
		HSSFCell login = row1.getCell(0);
	
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//input[@id='fname']")));
		WebElement ele1= driver.findElement(By.xpath("//input[@id='fname']"));
		ele1.clear();
		ele1.sendKeys(row1.getCell(0).getStringCellValue());
		
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//input[@id='devname']")));
		WebElement ele2= driver.findElement(By.xpath("//input[@id='devname']"));
		ele2.clear();
		ele2.sendKeys(row1.getCell(1).getStringCellValue());
		
		System.out.println("ViewName and UniqueName Entered");
		System.out.println();
		
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='save']")));
		driver.findElement(By.xpath("//div[@class='pbBottomButtons']//input[@name='save']")).click();
		Thread.sleep(2000);
		
		System.out.println("Clicked Save button");
		System.out.println();
		
		quit_browser();
		
		System.out.println("TestCase 11 completed");
	}

}
