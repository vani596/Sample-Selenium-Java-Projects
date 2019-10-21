package firstjavapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertExample {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.quackit.com/javascript/javascript_alert_box.cfm");
		
		WebElement frm=driver.findElement(By.className("result"));
		
		driver.switchTo().frame(frm);
		
		WebElement clickMe=driver.findElement(By.xpath(".//*[@value='Click me']"));
		clickMe.click();
		
		//alert box will be opened
		
		String alertBoxText=driver.switchTo().alert().getText();
		System.out.println(alertBoxText);
		
		driver.switchTo().alert().accept();
	}

}
