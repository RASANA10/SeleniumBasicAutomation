import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class e2e {

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
//		driver.findElement(By.xpath("//a[text()='23' and @class='ui-state-default ui-state-highlight']")).click();
		if(driver.findElement(By.id("Div1")).getAttribute("Style").contains("0.5")) {
			System.out.println("its enabled");
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		for(int i=1;i<5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();//4 times
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.cssSelector("input[name*='FindFlights']")).click();

	}

}
