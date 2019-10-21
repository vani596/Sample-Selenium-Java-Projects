package firstjavapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {

	public static void main(String[] args) 
			throws InterruptedException {

		WebDriver driv = new FirefoxDriver();
		driv.manage().window().maximize();

		driv.get("http://ebay.com");
		Thread.sleep(10000);
		Actions act = new Actions(driv);
		act.keyDown(Keys.CONTROL)
		.sendKeys(Keys.F5)
		.keyUp(Keys.CONTROL).perform();
		WebElement signin = driv.findElement
				(By.xpath(".//*[text()='Hello. Sign in']"));
		act.moveToElement(signin).perform();

		WebElement button = driv.findElement
				(By.xpath(".//*[text()='Sign in']"));
		act.click(button).perform();

/*
* WebElement ele1=driv.findElement(By.id("gh-btn")); WebElement
* ele2=driv.findElement(By.id("gf-norton"));
* 
* act.dragAndDrop(ele1, ele2).perform();
*/
}
}
