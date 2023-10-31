

//TestNG is one of the Testing Framework,TestNg Framework has provide to assertion

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertion61 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Program Files/Java/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
//perform click operation on checkbox and verify selected or not
//		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
// lineno22 we got java.lang.AssertionError: expected [true] but found [false] bacause we are expecting here checkbox should not select i put wrong assertion		
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

//  perform assertequal assertion we are expecting here 4 Adult 		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
/*		int i=1;
		while (i<5) {
			driver.findElement(By.id("hrefIncAdt")).click();//4 times
			i++;
		} */
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		for(int i=1;i<5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();//4 times
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		
	}
	}


