package SFDC_project;

import java.io.FileInputStream;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;




public class SFDC_TC10 extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launch_Browser("ch");
		
		LoginToBrowser();
		
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//li[@id='AllTab_Tab']//a")));
		driver.findElement(By.xpath("//li[@id='AllTab_Tab']//a")).click();
		
		Thread.sleep(2000);
		
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//a[@class='listRelatedObject accountBlock title']")));
		driver.findElement(By.xpath("//a[@class='listRelatedObject accountBlock title']")).click();
	
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")));
		driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")).click();
		
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//input[contains(@name,'new')]")));
		driver.findElement(By.xpath("//input[contains(@name,'new')]")).click();
		
		
		
		String sFile = "/Users/neha/eclipse-workspace/TekarchSFDCProject/Excel1.xls";
		FileInputStream fi = new FileInputStream(sFile);

		HSSFWorkbook myExcelBook = new HSSFWorkbook(fi);
		HSSFSheet myExcleSheet = myExcelBook.getSheet("Accounts");
		HSSFRow row1 = myExcleSheet.getRow(1);
		HSSFCell login = row1.getCell(0);
	
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//input[@id='acc2']")));
		WebElement ele1= driver.findElement(By.xpath("//input[@id='acc2']"));
		ele1.clear();
		ele1.sendKeys(row1.getCell(0).getStringCellValue());
		
		WebElement type = driver.findElement(By.xpath("//select[@id='acc6']"));
		Select dropdown1 = new Select(type);
		dropdown1.selectByValue("Technology Partner");
		System.out.println("Type dropdown  selected");
		System.out.println();
		
		WebElement priority = driver.findElement(By.xpath("//select[@id='00N5w00000HZVoW']"));
		Select dropdown2 = new Select(priority);
		dropdown2.selectByValue("High");
		System.out.println("Priority dropdown  selected");
		System.out.println();
		
		Thread.sleep(2000);
		
		quit_browser();
		
		System.out.println("Testcase 10 executed");
		
		
		//li[@id='AllTab_Tab']//a
	}

}
