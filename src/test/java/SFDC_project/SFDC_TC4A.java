package SFDC_project;

import org.openqa.selenium.By;

public class SFDC_TC4A extends BrowserUtility {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launch_Browser("ch");
		
		try {
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//a[@id='forgot_password_link']")));
		driver.findElement(By.xpath("//a[@id='forgot_password_link']")).click();
		
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//input[@id='continue']")));
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		} catch (Exception E) {
			System.out.println(E);
		}
		
		Thread.sleep(2000);

		quit_browser();
	}

}
