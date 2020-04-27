package SFDC_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SFDC_TC22 extends BrowserUtility {

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

		WebElement inter1 = driver.findElement(By.xpath("//select[@id='fcf']"));
		Select dropdown1 = new Select(inter1);
		dropdown1.selectByIndex(1);
		Thread.sleep(2000);
		System.out.println("Interval dropdown  selected");
		System.out.println();
		System.out.println("TestCase 22 Executed");
		
		Thread.sleep(2000);

		waitForPageElementToBeVisible(driver.findElement(By.xpath("//div[@id='userNav']")));
		driver.findElement(By.xpath("//div[@id='userNav']")).click();

		waitForPageElementToBeVisible(driver.findElement(By.xpath("//a[contains(text(),'Logout')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		
		
		Thread.sleep(1000);
		
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
		//waitForPageElementToBeVisible(driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")));
		//driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")).click();

		//GO BUTTON
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//span[@class='fBody']//input[@name='go']")));
		driver.findElement(By.xpath("//span[@class='fBody']//input[@name='go']")).click();
		
		Thread.sleep(2000);

		System.out.println("TestCase 22 Executed");
		
		quit_browser();

	}

}
