import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCHECK105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
//		options.setAcceptInsecureCerts(true);
		Proxy proxy=new Proxy();
		proxy.setHttpProxy("ipaddress:444");
		options.setCapability("proxy", proxy);
		
//	Set download directory		
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "/directory/path");
		options.setExperimentalOption("prefs", prefs);
//Block pop-up windows		

		options.setExperimentalOption("excludeSwitches",

		     Arrays.asList("disable-popup-blocking"));
		
// https://chromedriver.chromium.org/capabilities		
		
		System.setProperty("webdriver.chrome.driver", "/Program Files/Java/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());

	}

}
