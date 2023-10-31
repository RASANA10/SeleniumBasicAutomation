import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EnabledANDDisabled64 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Program Files/Java/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(2000L);
/*		driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled();
		System.out.println("done");*/
		System.out.println(driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date2']//parent::div")).getAttribute("Style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date2']//parent::div")).getAttribute("Style"));
		if(driver.findElement(By.id("Div1")).getAttribute("Style").contains("1")) {
			System.out.println("its enabled");
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		

	}

}
