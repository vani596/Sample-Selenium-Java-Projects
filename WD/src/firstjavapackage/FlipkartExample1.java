package firstjavapackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartExample1 {
	
	public static void main(String[] args) {
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.get
("https://www.flipkart.com/search?q=Mobiles&otracker=search&otracker1="
		+ "search&marketplace=FLIPKART&as-show=on&as=off");

		//24 mobiles will be displayed
		List<WebElement> mobiles=driver.findElements
				(By.xpath(".//*[@class='_3wU53n']"));
		List<WebElement> prices=driver.findElements
				(By.xpath(".//*[@class='_1vC4OE _2rQ-NK']"));
		
		for(int i=0;i<mobiles.size();i++)
		{
			String MobileName=mobiles.get(i).getText();
			System.out.println(MobileName);
			
			String price=prices.get(i).getText();
			System.out.println(price);
			}
		}

}
