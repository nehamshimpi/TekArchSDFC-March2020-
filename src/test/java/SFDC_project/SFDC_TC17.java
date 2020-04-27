package SFDC_project;

import org.openqa.selenium.By;

public class SFDC_TC17 extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		launch_Browser("ch");

		LoginToBrowser();

		// + TAB

		waitForPageElementToBeVisible(driver.findElement(By.xpath("//li[@id='AllTab_Tab']//a")));
		driver.findElement(By.xpath("//li[@id='AllTab_Tab']//a")).click();

		Thread.sleep(2000);

		// CLICKED OPPORTUNITES LINK
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject opportunityBlock title')]")));
		driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject opportunityBlock title')]")).click();

		// POP UP
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")));
		driver.findElement(By.xpath("//*[@id=\"tryLexDialogX\"]")).click();
		
		//OPPORTUNITY PIPELINE
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//a[contains(text(),'Opportunity Pipeline')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Opportunity Pipeline')]")).click();
		
		System.out.println("Report generated");
		System.out.println();

		Thread.sleep(2000);

		System.out.println("TestCase 17 Executed");
		quit_browser();
	}

}
