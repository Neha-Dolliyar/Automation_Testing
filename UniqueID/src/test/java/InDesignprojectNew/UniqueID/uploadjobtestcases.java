package InDesignprojectNew.UniqueID;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class uploadjobtestcases {

	public WebDriver driver;

	public void  Uploadjob() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Naehas\\eclipse-workspace\\InDesignproject\\src\\driver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.navigate().to("https://perf.naehas.com/inddeditor/v118/#/editor");
	    Thread.sleep(5000);
	}
	
}
