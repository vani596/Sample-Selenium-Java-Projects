
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
package packTest;
public class FirstTest {
	static int a=10;
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("http://www.google.com");
		System.out.println("output is a" +a);
			

	}

}
