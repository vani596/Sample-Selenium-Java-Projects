package firstjavapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxExample {
public static void main(String[] args) throws Exception {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
	//write code to go to frame
	//switch
	driver.switchTo().frame("iframeResult");
	
	WebElement listbox=driver.findElement(By.name("cars"));
	
	Select sel=new Select(listbox);
	Thread.sleep(2000);
	sel.selectByIndex(1);
	sel.selectByIndex(2);
	Thread.sleep(2000);
	sel.deselectByValue("saab");
	
	
	
	
}
}
