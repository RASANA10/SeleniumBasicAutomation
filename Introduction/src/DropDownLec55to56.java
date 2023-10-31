import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownLec55to56 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Program Files/Java/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
//		driver.get("https://spicejet.com");
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
//sometime people will not 	recommende index concept better to go parent child relationship xpath	
//		parent child relatiomship locator
		//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']
		//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']-- parent xpath
		//a[@value='MAA']-- child xpath following the parent xpath
		//this is called parent child relationaship xpath to find the unique xpath
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']")).click();
	}

}
