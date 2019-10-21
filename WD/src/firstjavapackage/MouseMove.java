package firstjavapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMove {

	public static void main(String[] args) throws Exception {
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.get("http://ebay.com");
		WebElement link = d.findElement(By.linkText("My eBay"));
		Actions act = new Actions(d);
		act.moveToElement(link).perform();

		Thread.sleep(2000);

		WebElement messages=d.findElement(By.xpath(".//*[@role='navigation']/li[9]/a"));
		act.click(messages).perform();
		

	}

}
