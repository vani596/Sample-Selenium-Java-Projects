package firstjavapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LTPLTExample {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		
		WebElement gmaillink=driver.findElement(By.id("XYZ"));
		gmaillink.click();

	}

}
