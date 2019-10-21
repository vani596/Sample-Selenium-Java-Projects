package firstjavapackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
public static void main(String[] args) {
	WebDriver d = new ChromeDriver();
	d.get("https://www.nngroup.com/articles/checkboxes-vs-radio-buttons/");
		List<WebElement> li = d.findElements(By.xpath(".//input[@type='checkbox']"));
	int count =li.size();
	for(int i = 0; i<count; i++)
	{
		boolean b =li.get(i).isSelected();
		if(!b) {
			li.get(i).click();
		}
		
	}
}
}
