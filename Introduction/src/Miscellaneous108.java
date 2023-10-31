import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//this package for screenshot fileUtils
//import org.apache.commons.io.FileUtils*;

public class Miscellaneous108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Program Files/Java/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//delete any specific name
//		driver.manage().deleteCookieNamed("asdf");
//		driver.manage().deleteCookieNamed("sessionKey");
		// if we will de
		driver.get("http://google.com");
		
		//_-----------------takescreenshot----------------
		//after typeccast of driver screenshot then we will get getscreenshots
//		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src,new File("C:\\User\\Screenshot.png"));
		
		
		

	}

}
