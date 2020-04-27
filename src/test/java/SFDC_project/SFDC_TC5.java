package SFDC_project;

//import java.io.FileInputStream;
//
//import org.apache.poi.hssf.usermodel.HSSFCell;
//import org.apache.poi.hssf.usermodel.HSSFRow;
//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SFDC_TC5 extends BrowserUtility{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		launch_Browser("ch");
		//String sFile = "/Users/neha/eclipse-workspace/TekarchSFDCProject/Excel1.xls";
		
		try {
			
			LoginToBrowser();
			waitForPageElementToBeVisible(driver.findElement(By.xpath("//div[@id='userNav']")));
			driver.findElement(By.xpath("//div[@id='userNav']")).click();
			
			Thread.sleep(1000);
			
		} catch (Exception E) {
			System.out.println(E);
		}

		Thread.sleep(2000);

		quit_browser();

	}

}
