package SFDC_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SFDC_TC28 extends BrowserUtility {

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

		Thread.sleep(2000);
		
		WebElement field = driver.findElement(By.xpath("//select[@id='fcf']"));
		Select dropdown2 = new Select(field);
		dropdown2.selectByIndex(2);
		System.out.println("My contacts  selected");
		System.out.println();
		
		Thread.sleep(1000);


		System.out.println("TestCase 28 Executed");

		quit_browser();
	}

}
