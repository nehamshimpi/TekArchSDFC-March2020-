package SFDC_project;

import org.openqa.selenium.By;

public class SFDC_TC20 extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		launch_Browser("ch");
		// String sFile = "/Users/neha/eclipse-workspace/TekarchSFDCProject/Excel1.xls";

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

		waitForPageElementToBeVisible(driver.findElement(By.xpath("//div[@id='userNav']")));
		driver.findElement(By.xpath("//div[@id='userNav']")).click();

		waitForPageElementToBeVisible(driver.findElement(By.xpath("//a[contains(text(),'Logout')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		Thread.sleep(2000);

		System.out.println("TestCase 20 Executed");
		quit_browser();
	}

}
