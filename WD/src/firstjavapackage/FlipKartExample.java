package firstjavapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartExample {
	
	

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://flipkart.com");
		System.out.println("Closing the popup");
		WebElement popUpClose=driver.findElement
		(By.xpath(".//button[@class='_2AkmmA _29YdH8']"));
	popUpClose.click();
		WebElement srchBox=driver.findElement
(By.xpath(".//input[@title='Search for products, brands and more']"));
	srchBox.sendKeys("Bags");
	
		WebElement popUpClose1=driver.findElement
			(By.className("_1dBPDZ"));
	}

}
