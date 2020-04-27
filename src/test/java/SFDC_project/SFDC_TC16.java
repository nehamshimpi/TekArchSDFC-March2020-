package SFDC_project;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SFDC_TC16 extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		launch_Browser("ch");

		LoginToBrowser();

		// + TAB

		waitForPageElementToBeVisible(driver.findElement(By.xpath("//li[@id='AllTab_Tab']//a")));
		driver.findElement(By.xpath("//li[@id='AllTab_Tab']//a")).click();

		Thread.sleep(2000);
		
		//CLICKED OPPORTUNITES LINK
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject opportunityBlock title')]")));
		driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject opportunityBlock title')]")).click();
		
		//POP UP
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")));
		driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")).click();
		
		//NEW TAB
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//input[contains(@name,'new')]")));
		driver.findElement(By.xpath("//input[contains(@name,'new')]")).click();
		
		String sFile = "/Users/neha/eclipse-workspace/TekarchSFDCProject/Excel1.xls";
		FileInputStream fi = new FileInputStream(sFile);
		
		HSSFWorkbook myExcelBook = new HSSFWorkbook(fi);
		HSSFSheet myExcleSheet = myExcelBook.getSheet("NewLead");
		HSSFRow row1 = myExcleSheet.getRow(1);
		HSSFCell login = row1.getCell(0);
		
		//OPPORTUNITY NAME
		
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//input[@id='opp3']")));
		driver.findElement(By.xpath("//input[@id='opp3']")).sendKeys(row1.getCell(0).getStringCellValue());
		
		
		//ACCOUNT NAME
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//input[@id='opp4']")));
		driver.findElement(By.xpath("//input[@id='opp4']")).sendKeys(row1.getCell(1).getStringCellValue());;
		
		//DATEPICKER
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//input[@id='opp9']")));
		driver.findElement(By.xpath("//input[@id='opp9']")).click();
		
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//a[contains(@class,'calToday')]")));
		driver.findElement(By.xpath("//a[contains(@class,'calToday')]")).click();
		
		//STAGE DROPDOWN
		WebElement field = driver.findElement(By.xpath("//select[@id='opp11']"));
		Select dropdown2 = new Select(field);
		dropdown2.selectByIndex(2);
		System.out.println("Field dropdown  selected");
		System.out.println();
		
		
		//PROBABILITY
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//input[@id='opp12']")));
		driver.findElement(By.xpath("//input[@id='opp12']")).sendKeys("2");
		//input[@id='opp12']
		
		//PRIMARY CAMPAIGN SOURCE
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//input[@id='opp17']")));
		driver.findElement(By.xpath("//input[@id='opp17']")).sendKeys(row1.getCell(3).getStringCellValue());
		//input[@id='opp17']
		
		//SAVE BUTTON
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[1]")));
		driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[1]")).click();
		//div[contains(@class,'pbBottomButtons')]//input[1]
		Thread.sleep(2000);
		
		System.out.println("TestCase 16 Executed");
		quit_browser();
	}

}
