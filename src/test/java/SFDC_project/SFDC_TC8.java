package SFDC_project;

import java.util.Set;

import org.openqa.selenium.By;

public class SFDC_TC8 extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launch_Browser("ch");
		
		LoginToBrowser();
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//div[@id='userNav']")));
		driver.findElement(By.xpath("//div[@id='userNav']")).click();
		
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//a[contains(text(),'Developer Console')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Developer Console')]")).click();
		
		Set<String> getAllWindows = driver.getWindowHandles();
		String[] window=getAllWindows.toArray(new String[getAllWindows.size()]);
		driver.switchTo().window(window[1]);
		
		quit_browser();
		
		System.out.println("TestCase 8 completed");
	}

}
