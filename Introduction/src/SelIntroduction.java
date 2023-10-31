import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class SelIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				// first goal to invoking the browser
				//Chrome- Chromedriver--> Methods
				//Firefox FirefoxDriver--> methods
				//two ways to invoke chromedriver
				// chromedriver.exe  --> chrome browser
				//step to invoke chrome driver
				//selenium manager
		/*		System.setProperty("webdriver.chrome.driver", "/Program Files/Java/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
//				ChromeDriver driver1 = new ChromeDriver();
				driver.get("https://rahulshettyacademy.com");// to hit the url
				System.out.println(driver.getTitle()); //how to get title of the application to print in console
				System.out.println(driver.getCurrentUrl());// using getCurrentUrl() method ,it will print url in console
				driver.close();
				driver.quit();*/
				
				//firefox launch
		/*		System.setProperty("webdriver.gecko.driver", "/Program Files/Java/geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				driver.get("https://rahulshettyacademy.com");// to hit the url
				System.out.println(driver.getTitle()); //how to get title of the application to print in console
				System.out.println(driver.getCurrentUrl());// using getCurrentUrl() method ,it will print url in console
				driver.close();*/
				
				// Edge Driver
		/*		System.setProperty("webdriver.gecko.driver", "/Program Files/Java/msedgedriver.exe");
				WebDriver driver = new EdgeDriver();
				driver.get("https://rahulshettyacademy.com");// to hit the url
				System.out.println(driver.getTitle()); //how to get title of the application to print in console
				System.out.println(driver.getCurrentUrl());// using getCurrentUrl() method ,it will print url in console
				driver.close();*/
				
				WebDriver driver = new ChromeDriver();
//				ChromeDriver driver1 = new ChromeDriver();
				driver.get("https://rahulshettyacademy.com");// to hit the url
				System.out.println(driver.getTitle()); //how to get title of the application to print in console
				System.out.println(driver.getCurrentUrl());



	}

}
