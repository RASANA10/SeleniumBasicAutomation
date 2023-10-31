import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingItemIntoCart71 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Program Files/Java/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		//we will declare array
		String[] itemsNeeded= {"Cucumber","Brocoll","Cauliflower"};
		Thread.sleep(3000L);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000L);
		addItems(driver,itemsNeeded);
	}
	
	
	
	
		
		public static void addItems(WebDriver driver,String[] itemsNeeded) {
			
		int j=0;
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0;i<products.size();i++) {
			//format it to get actual vegetable name
			String[] name=products.get(i).getText().split("-");
			String formattednames=name[0].trim();//it is used for whitespace
//			if (name.contains("Cucumber")) {
			
			//check whether name you extracted is present in array or not
			//convert array into array list for easy search
			
			List itemsNeededlist=Arrays.asList(itemsNeeded);
			
			if(itemsNeededlist.contains(formattednames)) {
				//click on Add to card
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				if(j==itemsNeeded.length) {
					break;
				}

			}
			
		}


	}

}
