package ui.play;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
		public WebDriver driver;
  @Test
  public void testEasy(){	
	  
	  
	  	driver.get("http://www.practiceselenium.com/");
		String text = driver.findElement(By.xpath(("//span[text()='Herbal Tea']"))).getCssValue("color");
		System.out.println(text);
		driver.get("http://www.practiceselenium.com/");
		
	}	
	@BeforeTest
	public void beforeTest() {
		//System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();  
	}		
	@AfterTest
	public void afterTest() {
		driver.quit();		
	}

}
