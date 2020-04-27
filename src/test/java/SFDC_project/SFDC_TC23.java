package SFDC_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SFDC_TC23 extends BrowserUtility{

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
		dropdown1.selectByIndex(3);
		Thread.sleep(2000);
		System.out.println("View dropdown  selected");
		System.out.println();
		
		
		Thread.sleep(1000);
		
		//waitForPageElementToBeVisible(driver.findElement(By.xpath("//span[contains(@class,'fBody')]//input[contains(@name,'go')]")));
		//driver.findElement(By.xpath("//span[contains(@class,'fBody')]//input[contains(@name,'go')]")).click();
		
		//Thread.sleep(1000);

		System.out.println("TestCase 23 Executed");
		
		quit_browser();



	}

}
