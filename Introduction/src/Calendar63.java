import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar63 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "/Program Files/Java/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
				Thread.sleep(2000L);
				driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
				driver.findElement(By.xpath("//a[@value='BLR']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
		        Thread.sleep(2000L);
				driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight']")).click();

	}

}
