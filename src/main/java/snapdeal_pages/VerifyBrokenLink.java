package snapdeal_pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import snapdeal_utils.uioperation;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class VerifyBrokenLink {
	WebDriver driver;
	uioperation ui;
	WebDriverWait wt;

	public VerifyBrokenLink(WebDriver driver) {
		this.driver = driver;
		ui = new uioperation(driver);
		wt = new WebDriverWait(driver, Duration.ofSeconds(15));

	}

	public void verifylinks() {

// Finding all the available links on webpage
		List<WebElement> links = driver.findElements(By.tagName("a"));

		for (int i = 0; i <= 50; i++) {
			WebElement E1 = links.get(i);
			String url = E1.getAttribute("href");
			verifyLinks(url);
		}

	}

	public static void verifyLinks(String url) {
		try {
			@SuppressWarnings("deprecation")
			URL url1 = new URL(url);

			//iterating over the links for status check
			HttpURLConnection httpURLConnect = (HttpURLConnection) url1.openConnection();
			httpURLConnect.setConnectTimeout(5000);
			httpURLConnect.connect();
			if (httpURLConnect.getResponseCode() >= 400) {
				System.out.println(url + " - " + " is a broken link");
				
			}
			
		} catch (Exception e) {
		}
	}
}
