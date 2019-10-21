package firstjavapackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownBoxObject {

	public static void main(String[] args) {

		WebDriver d = new ChromeDriver();
		d.get("https://ebay.com");
//		WebElement ele=d.findElement(By.partialLinkText("My ebay"));
//		ele.click();
		
		WebElement dropdown = d.findElement(By.id("gh-cat"));
		Select sel = new Select(dropdown);
		List<WebElement> items = sel.getOptions();
		for(WebElement elems:items)
		{
			System.out.println(elems.getText());
		}
		
		
		

		// sel.selectByIndex(4);
		// sel.selectByVisibleText("Music");
		// sel.selectByValue("20081");
//		WebElement defaultOption = sel.getFirstSelectedOption();
//		String defaultValue = defaultOption.getText();
//		if (defaultValue.equals("All categories")) {
//			System.out.println("Item matched");
//		} else {
//			System.out.println("Item not matched");
//		}

	}

}
