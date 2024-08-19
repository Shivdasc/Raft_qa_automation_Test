package snapdeal_utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Helper {

	public WebDriver driver;
	public WebDriverWait wt;
	public Properties prop;

	@BeforeTest
	public void beforeTest() throws FileNotFoundException, IOException {
		prop = new Properties();
		prop.load(new FileInputStream("src/test/resources/config.properties"));
		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		op.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();                           //setup chrome browser 
		driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Will wait whenever required
		wt = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	@AfterTest
	public void afterTest() throws InterruptedException {
		Thread.sleep(20000);
		driver.quit();
	}

}