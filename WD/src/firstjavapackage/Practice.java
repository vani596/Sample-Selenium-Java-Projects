package firstjavapackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http:google.com");

		driver.get("flipkart.com");

	}

}
