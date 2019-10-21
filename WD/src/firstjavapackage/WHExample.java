package firstjavapackage;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WHExample {

	public void closeWindow(WebDriver driver, String titleToclose) {
		Set<String> ids = driver.getWindowHandles();
		for (String id : ids) {
			driver.switchTo().window(id);
			String title = driver.getTitle();
			if (title.equals(titleToclose)) {
				driver.close();
				break;
			}
		}
	}

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://naukri.com");// 4
		WHExample obj = new WHExample();
		obj.closeWindow(driver, "ABCD");
		obj.closeWindow(driver, "VMWare");
		obj.closeWindow(driver, "Fujitsu");

	}

}
