package pck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WTest {
int a=10;
	public static void main(String[] args) {
	WTest w=new WTest();
	System.out.println("value of a:" +w.a);
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com");
	driver.navigate().refresh();
	driver.close();
	driver.quit();
		
		
		
		
	}
	
	
	
}
