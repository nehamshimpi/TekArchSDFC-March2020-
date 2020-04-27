package SFDC_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class SFDC_TC6 extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
			
		
			
		launch_Browser("ch");
		try {
			
			LoginToBrowser();
			waitForPageElementToBeVisible(driver.findElement(By.xpath("//div[@id='userNav']")));
			driver.findElement(By.xpath("//div[@id='userNav']")).click();
			
			Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait(driver, 40);
			waitForPageElementToBeVisible(driver.findElement(By.xpath("//a[contains(text(),'My Profile')]")));
			driver.findElement(By.xpath("//a[contains(text(),'My Profile')]")).click();
			
			waitForPageElementToBeVisible(driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img")));
			driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img")).click();
			
			//Thread.sleep(3000);
			
			driver.switchTo().frame("contactInfoContentId");
			
			waitForPageElementToBeVisible(driver.findElement(By.xpath("//a[contains(text(),'About')]")));
			driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();
			
			waitForPageElementToBeVisible(driver.findElement(By.xpath("//input[@id='lastName']")));
			WebElement lname = driver.findElement(By.xpath("//input[@id='lastName']"));
			lname.clear();
			lname.sendKeys("Shimpi");
			
			waitForPageElementToBeVisible(driver.findElement(By.xpath("//input[contains(@class,'zen-btn zen-primaryBtn zen-pas')]")));
			driver.findElement(By.xpath("//input[contains(@class,'zen-btn zen-primaryBtn zen-pas')]")).click();
			
			driver.switchTo().defaultContent();
			
			System.out.println("Clicked on saveAll  and back to default window");
			
			//POST
			
			waitForPageElementToBeVisible(driver.findElement(By.xpath("//a[@id='publisherAttachTextPost']/span[1]")));
			driver.findElement(By.xpath("//a[@id='publisherAttachTextPost']/span[1]")).click();
			
			waitForPageElementToBeVisible(driver.findElement(By.tagName("iframe")));
			WebElement frame=driver.findElement(By.tagName("iframe"));
			driver.switchTo().frame(frame);
			System.out.println("Switched to frame"+ frame);
		
			
			WebElement messagebox=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body")));
			messagebox.click();
			System.out.println("Msg box clicked");
			Thread.sleep(2000);
			
			
			WebElement messagebox1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body")));
			System.out.println("Sending msg to post");
			messagebox1.sendKeys("Hello");
			Thread.sleep(2000);
			driver.switchTo().defaultContent();
			System.out.println("back to default frame");
			
			waitForPageElementToBeVisible(driver.findElement(By.xpath("//input[@id='publishersharebutton']")));
			driver.findElement(By.xpath("//input[@id='publishersharebutton']")).click();
			System.out.println("Share clicked");
			
			Thread.sleep(2000);
			
			
			//FOR FILE UPLOAD
			
			waitForPageElementToBeVisible(driver.findElement(By.xpath("//a[@id='publisherAttachContentPost']//span[1]")));
			driver.findElement(By.xpath("//a[@id='publisherAttachContentPost']//span[1]")).click();
			
			waitForPageElementToBeVisible(driver.findElement(By.xpath("//a[@id='chatterUploadFileAction']")));
			driver.findElement(By.xpath("//a[@id='chatterUploadFileAction']")).click();
			
			
			WebElement browse = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='chatterFile']")));
			browse.sendKeys("/Users/neha/Desktop/SFDC_text.rtf");
			
			waitForPageElementToBeVisible(driver.findElement(By.xpath("//input[@id='publishersharebutton']")));
			driver.findElement(By.xpath("//input[@id='publishersharebutton']")).click();
			
			System.out.println("File Uploaded!!!!");
			
			Thread.sleep(2000);
			
			
			//ADD PHOTO
			waitForPageElementToBeVisible(driver.findElement(By.xpath("//span[@id='displayBadge']")));
			Actions mousehoover=new Actions(driver);
			mousehoover.moveToElement(driver.findElement(By.xpath("//span[@id='displayBadge']"))).build().perform();
			
	        System.out.println("Mousehover done");
			
	        waitForPageElementToBeVisible(driver.findElement(By.xpath("//a[@id='uploadLink']")));
	        driver.findElement(By.xpath("//a[@id='uploadLink']")).click();
	        
	        Thread.sleep(2000);
	        
	        WebElement photoFrame= driver.findElement(By.id("uploadPhotoContentId"));
	        driver.switchTo().frame(photoFrame);
	        //Thread.sleep(2000);
	        
	        WebElement browsephoto = wait.until(ExpectedConditions.elementToBeClickable(By.id("j_id0:uploadFileForm:uploadInputFile")));
			browsephoto.sendKeys("/Users/neha/Desktop/MarioImage.png");
			
			//Thread.sleep(2000);
			waitForPageElementToBeVisible(driver.findElement(By.xpath(".//*[@id='j_id0:uploadFileForm:uploadBtn']")));
			WebElement savePhoto=driver.findElement(By.xpath(".//*[@id='j_id0:uploadFileForm:uploadBtn']"));
			savePhoto.click();
			
			/*Actions action=new Actions(driver); 
			action.dragAndDropBy(driver.findElement(By.xpath(".//*[@id='j_id0:outer']/div[1]/div/div/div/div[6]")), 100, 20);
			driver.findElement(By.xpath(".//*[@id='j_id0:j_id7:save']")).click(); 
			driver.switchTo().defaultContent();
			System.out.println("Test case 6 Completed");*/

		Thread.sleep(2000);
		} catch (Exception E) {
			System.out.println(E);
		}
		
		Thread.sleep(2000);
		quit_browser();


	}

}
