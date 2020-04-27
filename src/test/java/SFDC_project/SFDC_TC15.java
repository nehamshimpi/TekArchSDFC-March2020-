package SFDC_project;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SFDC_TC15 extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		launch_Browser("ch");

		LoginToBrowser();

		// + TAB

		waitForPageElementToBeVisible(driver.findElement(By.xpath("//li[@id='AllTab_Tab']//a")));
		driver.findElement(By.xpath("//li[@id='AllTab_Tab']//a")).click();

		Thread.sleep(2000);
		
		//CLICKED OPPORTUNITES LINK
		waitForPageElementToBeVisible(driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject opportunityBlock title')]")));
		driver.findElement(By.xpath("//a[contains(@class,'listRelatedObject opportunityBlock title')]")).click();
		
		//DROPDOWN
		
		
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
        
		Thread.sleep(2000);
		
		System.out.println("TestCase 15 Executed");
		quit_browser();

	}
	
	
}
