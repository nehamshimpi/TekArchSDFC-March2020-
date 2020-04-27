package SFDC_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SDFC_TC19 extends BrowserUtility{

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
		
		//QUERTERLY SUMMARY
		WebElement inter1 = driver.findElement(By.xpath("//select[@id='quarter_q']"));
		Select dropdown1 = new Select(inter1);
		dropdown1.selectByIndex(2);;
		System.out.println("Interval dropdown  selected");
		System.out.println();
		
		WebElement inter2 = driver.findElement(By.xpath("//select[@id='open']"));
		Select dropdown2 = new Select(inter2);
		dropdown2.selectByIndex(2);;
		System.out.println("Include dropdown  selected");
		System.out.println();
		
		System.out.println("Opportunity Report page displayed");
		System.out.println();

		Thread.sleep(2000);

		System.out.println("TestCase 19 Executed");
		
		quit_browser();
	}

}
