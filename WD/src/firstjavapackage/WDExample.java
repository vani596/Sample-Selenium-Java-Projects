package firstjavapackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class WDExample {
	
	public static void main(String[] args) {
		ProfilesIni ini=new ProfilesIni();
		FirefoxProfile fp=ini.getProfile("ABCD");
		
		WebDriver  driver=new FirefoxDriver(fp);
		driver.manage().window().maximize();
		driver.get("http://google.com");
		driver.get("http://flipkart.com");
		driver.navigate().refresh();
		driver.navigate().back();
		driver.navigate().forward();
		
		
	}

}
