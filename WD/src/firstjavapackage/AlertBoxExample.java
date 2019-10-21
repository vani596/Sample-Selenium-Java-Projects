package firstjavapackage;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertBoxExample {
	
	public static void main(String[] args) {
		
		WebDriver d = new ChromeDriver();
		d.get("https://www.quackit.com/javascript/javascript_alert_box.cfm");
		WebElement ele=d.findElement(By.xpath("(.//*[@class='result'])[1]"));
		d.switchTo().frame(ele);
		d.findElement(By.xpath(".//*[@value='Click me']")).click();
		
		String text=d.switchTo().alert().getText();
		System.out.println(text);
		d.switchTo().alert().accept();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
