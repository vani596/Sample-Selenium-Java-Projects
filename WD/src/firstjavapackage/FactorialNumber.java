package firstjavapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FactorialNumber {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nngroup.com/articles/checkboxes-vs-radio-buttons/");

		WebElement ele = driver.findElement(By.name("permission"));
		ele.click();
		boolean state = ele.isSelected();
		if (state) {
			System.out.println("Check box is already selected not selecting...");
		}

	}

}
