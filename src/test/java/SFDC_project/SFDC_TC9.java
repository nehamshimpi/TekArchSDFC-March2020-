package SFDC_project;

import org.openqa.selenium.By;

public class SFDC_TC9 extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		launch_Browser("ch");
		
		
		
		LoginToBrowser();
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//div[@id='userNav']")));
		driver.findElement(By.xpath("//div[@id='userNav']")).click();
		
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//a[contains(text(),'Logout')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
		
		System.out.println("Succesfully logged Out");
		
		quit_browser();
		
		System.out.println("TestCase 9 completed");

	}

}
