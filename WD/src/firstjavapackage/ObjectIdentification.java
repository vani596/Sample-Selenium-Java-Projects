package firstjavapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ObjectIdentification {
	public static void main(String[] args) {
		WebDriver driver = null;

		try {
			driver = new FirefoxDriver();
			int i=100;
		} catch (Exception wde) {
			System.out.println(wde.getMessage());
		}
		try    {
			
		} catch (Throwable e) {
			System.out.println(e.getMessage()); 
		
		}

		WebElement ele = driver.findElement
				(By.id("twotabsearchtextboxfdasfjljadksfl"));

		ele.sendKeys("Bags");

		WebElement ele1 = driver.findElement
				(By.className("nav-inputgsretgf"));

		ele1.click();

	}
}
