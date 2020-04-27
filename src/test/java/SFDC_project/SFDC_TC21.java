package SFDC_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SFDC_TC21 extends BrowserUtility{

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

		Thread.sleep(2000);

		WebElement element = driver.findElement(By.xpath("//select[@id='fcf']"));
		Select dropDown = new Select(element);
		List<WebElement> elementCount = dropDown.getOptions();
		System.out.println("Number of items: " + elementCount.size());
		System.out.println();
		
        int itemSize = elementCount.size();
        for(int i = 0; i < itemSize ; i++){
            String optionsValue = elementCount.get(i).getText();
            System.out.println(optionsValue);
        }
        System.out.println();
		
		
		System.out.println("Leads Home page displayed");
		System.out.println();
		System.out.println("TestCase 21 Executed");
		
		quit_browser();
	}

}
