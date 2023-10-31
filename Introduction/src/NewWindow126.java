import java.io.File;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow126 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Program Files/Java/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB); //using this method blank tab will open but driver is present on parent window
//		driver.switchTo().newWindow(WindowType.WINDOW);//it will create new window
//		driver.switchTo().window(null)
		Set<String> handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		String parentwindowID=it.next();
		String childwindowID=it.next();
		driver.switchTo().window(childwindowID);
		driver.get("https://rahulshettyacademy.com/");
		String coursename=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
		driver.switchTo().window(parentwindowID);
//		driver.findElement(By.cssSelector("[name='name']")).sendKeys(coursename);
//		driver.quit();
		
		//to take webelements screenshot
		
		WebElement name=driver.findElement(By.cssSelector("[name='name']"));
		name.sendKeys(coursename);
		File file=name.getScreenshotAs(OutputType.FILE);
		
		
		

	}

}
