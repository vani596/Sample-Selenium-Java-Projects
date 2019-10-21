package firstjavapackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsExample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		// need to identify all the links
		int count = 0;
		List<WebElement> links = driver.findElements(By.tagName("aa"));
		System.out.println(links.size());
		for (int i = 0; i < links.size(); i++) {
			if (!(links.get(i).getText().equals(""))) {
				System.out.println(links.get(i).getText());
				count = count + 1;
			}

		}
		System.out.println(count);

	}
}
