package script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
//import page.GooglePage;

public class DemoTest extends BaseTest {
	
	@Test
	public void demoTest1() throws InterruptedException {																				
		String data =Excel.getData(XL_PATH, "sheet1", 1, 0);
		
		Reporter.log("test data:" +data, true);
		Reporter.log(driver.getTitle(), true);
		
//		GooglePage g = new GooglePage(driver);
//		g.setSearch(data);
//		Thread.sleep(3000);		
	}

}
