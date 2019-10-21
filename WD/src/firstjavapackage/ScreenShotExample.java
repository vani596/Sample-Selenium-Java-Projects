package firstjavapackage;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotExample {
	
	public static void main(String[] args) throws Exception {
		
		double d=100.456;
		int a=(int)d;
		//d=driver
		//int =takesscreenshot
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com");
	
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\S@f'\\Desktop\\chromescreen.png"));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
