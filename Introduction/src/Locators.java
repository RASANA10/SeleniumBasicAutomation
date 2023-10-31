
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//these two line code invoke the Chrome Driver ,open will chrome driver only
		System.setProperty("webdriver.chrome.driver", "/Program Files/Java/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// it will hit the url on chrome
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("r");
		driver.findElement(By.name("inputPassword")).sendKeys("password3234");
		driver.findElement(By.className("signInBtn")).click();//  this will not work because of space it is declaring two classes "submit" and "signInBtn"
		//without adding wait it will fail because locator will not find
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@type=\"text\" and @placeholder=\"Name\"]")).sendKeys("derfg");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("dfgt@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("67967345678");
		Thread.sleep(1000);//1000 milisecond means 1s 
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Go to Login']")).click();
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
		driver.findElement(By.cssSelector("input[type*='Pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
	}

}
