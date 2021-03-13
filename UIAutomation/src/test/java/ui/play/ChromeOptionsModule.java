package ui.play;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.Color;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeOptionsModule {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver",".//driver/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		
		driver.get("http://www.practiceselenium.com/");
		String text = driver.findElement(By.xpath(("//span[text()='Herbal Tea']"))).getCssValue("color");
		System.out.println(text);
		driver.get("http://www.practiceselenium.com/");
		
	}

}
