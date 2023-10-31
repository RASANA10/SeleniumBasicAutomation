import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdownlec58to60 {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Program Files/Java/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
//		driver.get("https://spicejet.com");
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
//perform click operation on checkbox and verify selected or not
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

// to find the all checkbox count and print to console
		System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']")).getSize());

		
		
		
		
/*		driver.findElement(By.id("autosuggest")).sendKeys("India"); */
		driver.findElement(By.cssSelector("#autosuggest")).sendKeys("India");
		Thread.sleep(3000);
		List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for(WebElement option:options) {
			if(option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
		}
		
		System.out.println("Given Option has selected");
		
	}

}
