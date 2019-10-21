package packTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WDClass{
int a=10;
public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	WDClass obj=new WDClass();
	d.get("http://www.flipkart.com");
	d.navigate().refresh();
	d.close();
	d.quit();
	System.out.println("value of a is:" +obj.a);
	
}
}
