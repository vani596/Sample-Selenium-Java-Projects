package pck;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Program to get the number of frames in a webpage

public class FramesExample {
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.flipkart.com");
		d.manage().window().maximize();
		//Set<String> id=d.getWindowHandles();
		List<WebElement> ele=d.findElements(By.xpath(".//*[@title=\"Frames\"]"));
		System.out.println(ele.size());
		String title = d.getTitle();
		System.out.println(title);
	}

}
