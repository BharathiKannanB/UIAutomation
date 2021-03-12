package ui.play;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
		public WebDriver driver;
  @Test
  public void testEasy() {	
	  
		driver.get("http://www.practiceselenium.com/");  
		String title = driver.getTitle();	
		System.out.println(title);
		Assert.assertTrue(title.contains("Welcome")); 		
	}	
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
	    driver = new ChromeDriver();  
	}		
	@AfterTest
	public void afterTest() {
		driver.quit();		
	}

}
