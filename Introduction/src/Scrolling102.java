import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scrolling102 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Program Files/Java/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//to run the javascript we have to make javascriptExecuter Object,JavascriptExecutor is a class
		//using that class we can run javascript testcases
		JavascriptExecutor js= (JavascriptExecutor)driver;//we are typecasting our driver to inform we are running javascript code

		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		List <WebElement>	values=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum =0;
		for (int i=0;i<values.size();i++) {
			sum = sum + Integer.parseInt(values.get(i).getText());
			//it parseint is uset to convert in integer otherwise it will come in text form
		}
		System.out.println(sum);
		driver.findElement(By.cssSelector(".totalAmount")).getText();
		int total= Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		
		Assert.assertEquals(sum, total);
		
	}

}
