package ui.play;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeOptionsModule {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".//driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		((JavascriptExecutor)driver).executeScript("document.body.style.transform='scale(0.8)';");
	}

}
