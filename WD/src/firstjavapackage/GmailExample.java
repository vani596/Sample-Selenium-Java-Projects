package firstjavapackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailExample {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.HOURS);
		WebDriverWait wait = new WebDriverWait(driver, 15);

		driver.get("https://www.gmail.com");

		driver.findElement(By.id("identifierId")).sendKeys("kalyan");
		driver.findElement(By.xpath(".//*[text()='Next']")).click();

		WebElement ele = 
	wait.until(ExpectedConditions.visibilityOfElementLocated
			(By.name("password")));

		ele.sendKeys("abcd");

	}

}
