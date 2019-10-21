package firstjavapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FramesExample {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver d = new ChromeDriver();
		d.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		
		d.switchTo().frame("iframeResult");
		WebElement ele=d.findElement(By.name("cars"));
		Select sel=new Select(ele);
		sel.selectByIndex(0);
				
		sel.selectByIndex(3);	
		Thread.sleep(5000);
		sel.deselectByIndex(0);
				
				
				
				
				
				
				
				
				
				
		
	}

}
