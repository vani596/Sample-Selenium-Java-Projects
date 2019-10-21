package pck;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathExample {
	public static void main(String[] args) {
		WebDriver d= new ChromeDriver();
		d.get("http://ebay.com");
		WebElement dropdown=d.findElement(By.xpath(".//select[@id=\"gh-cat\"]"));
		Select sel=new Select(dropdown);
		List<WebElement> items = sel.getOptions();
			for(int i=0; i<items.size();i++) {
			if(items.get(i).getText().equals("Stamps")){
			sel.selectByVisibleText("Stamps");	
			
			System.out.println("Stamps found");				
			}
			else {
				System.out.println("Stamps not  found");	
		} 		
	  }
	}
}
