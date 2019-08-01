package MainMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

import InDesignprojectNew.UniqueID.uploadjobtestcases;

public class main extends uploadjobtestcases {

	@BeforeTest // TESTNG Annotation
	public void Test() throws Exception {

		Uploadjob();

	}

	// For importing the job

	@org.testng.annotations.Test
	public void ImportjobOne() throws InterruptedException {
		WebElement myelement = driver.findElement(By.id("image_src"));
		Actions actions = new Actions(driver);
		actions.moveToElement(myelement).click().build().perform();
		myelement.sendKeys("C:\\Users\\Naehas\\Documents\\Slug Editor Jobs\\Test Automation.zip");
		Thread.sleep(100000);
		WebElement E2 = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/button/span"));
		WebElement E1 = driver.findElement(By.xpath("//*[@class='modal-title']"));
		if (E1.isDisplayed()) // For clicking on Warning popup if present
		{
			E2.click();

		} else {
			System.out.println("No popup");
		}

	}

//	public void Login() throws InterruptedException
//	{
//		
//		 Thread.sleep(5000);
//		driver.findElement(By.xpath("//*[@class='login']")).click();
//		driver.findElement(By.id("email")).sendKeys("gtl_test@thegatewaycorp.com");
//		driver.findElement(By.id("passwd")).sendKeys("Gtl@123");
//		driver.findElement(By.name("SubmitLogin")).click();
//		System.out.println("Hello");
//		
//	}

}
