package firstjavapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class W3SchoolsExample {
	public static void main(String[] args)  throws Exception{
		WebDriver driv = new FirefoxDriver();
		driv.manage().window().maximize();

		driv.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driv.switchTo().frame("iframeResult");

		WebElement ele = driv.findElement(By.name("cars"));
		Select sel = new Select(ele);
		sel.selectByIndex(1);

		driv.findElement
		(By.xpath(".//*[@type='submit']")).click();

		Thread.sleep(5000);
		String text = driv.findElement
	(By.xpath(".//*[@class='w3-container w3-large w3-border']"))
	.getText();
		String expected = "cars/=saab";
		if (expected.equals(text)) {
			System.out.println("pass");
		} else {
			System.out.println("Fail");
		}

	}

}
