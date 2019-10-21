package firstjavapackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cleartrip {
	
	public void tableexe() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/trains/14553/");
		List<WebElement> columnlist=driver.findElements(By.xpath(".//table[@class='results']/tbody/tr"));
		
	for(int i=0;i<columnlist.size();i++) {
		
		System.out.println(columnlist.get(i).getText());

	
	}
	}
	
	public static void main(String[] args) {
		Cleartrip obj=new Cleartrip();
		obj.tableexe();
	}
	

}
