package SFDC_project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SFDC_TC13 extends BrowserUtility {

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
		
		// MERGE ACCOUNT 
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Merge Accounts')]")).click();
		System.out.println("Merge Account clicked");
		System.out.println();
		
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//input[@id='srch']")));
		driver.findElement(By.xpath("//input[@id='srch']")).sendKeys("united");
		
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//input[contains(@name,'srchbutton')]")));
		driver.findElement(By.xpath("//input[contains(@name,'srchbutton')]")).click();
		
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//input[@id='cid2']")));
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='cid2']"));
		
		if(checkbox.isSelected())
		{
			System.out.println("Checkbox selected");
		}else
		{
			System.out.println("Checkbox not selected");
		}
		checkbox.click();
		
		System.out.println("checkboxes checked");
		System.out.println();
		
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[contains(@name,'goNext')]")));
		driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[contains(@name,'goNext')]")).click();
		System.out.println("Clicked on next");
		
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[contains(@name,'save')]")));
		driver.findElement(By.xpath("//div[contains(@class,'pbBottomButtons')]//input[contains(@name,'save')]")).click();
		Thread.sleep(2000);
		System.out.println("Clicked on merge");
		System.out.println();
		
		Alert alert = driver.switchTo().alert();   
        String alertMessage= driver.switchTo().alert().getText();			
        System.out.println("This is an alert msg: " + alertMessage);	
        Thread.sleep(5000);		
        alert.accept();	
        
        
        System.out.println("TestCase 13 Executed");
		quit_browser();

	}

}
