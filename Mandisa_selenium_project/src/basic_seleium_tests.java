import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basic_seleium_tests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Automatically manage ChromeDriver version
//        WebDriverManager.chromedriver().setup();
		
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SiphoC\\Documents\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://uat-syx-www1.hollywoodbets.net:8094/");
		
		driver.findElement(By.xpath("//button[normalize-space()='Log In']"));

	}

}
