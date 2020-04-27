package SFDC_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SFDC_TC12 extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		launch_Browser("ch");
		
		LoginToBrowser();
		
		// + TAB
		
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
		
		WebElement view = driver.findElement(By.xpath("//select[@id='fcf']"));
		Select dropdown1 = new Select(view);
		dropdown1.selectByIndex(3);
		System.out.println("view dropdown  selected");
		System.out.println();
		
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//span[contains(@class,'fFooter')]//a[contains(text(),'Edit')]")));
		driver.findElement(By.xpath("//span[contains(@class,'fFooter')]//a[contains(text(),'Edit')]")).click();
		
		WebElement field = driver.findElement(By.xpath("//select[@id='fcol1']"));
		Select dropdown2 = new Select(field);
		dropdown2.selectByVisibleText("Account Name");
		System.out.println("Field dropdown  selected");
		System.out.println();
		
		WebElement operator = driver.findElement(By.xpath("//select[@id='fop1']"));
		Select dropdown3 = new Select(operator);
		dropdown3.selectByVisibleText("contains");
		System.out.println("Operator dropdown  selected");
		System.out.println();
		
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//input[@id='fval1']")));
		driver.findElement(By.xpath("//input[@id='fval1']")).sendKeys("<a>");
		
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//td//input[@value=' Save ' and @data-uidsfdc=5]")));
		driver.findElement(By.xpath("//td//input[@value=' Save ' and @data-uidsfdc=5]")).click();
		System.out.println(" Save button clicked ");
		System.out.println();
		
		Thread.sleep(2000);
		
		quit_browser();
		
		System.out.println("TestCase 12 completed");
	}

}
