package BaseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.AmazonObj;
import PageObject.FlipkartObj;

public class AssBase {

public static WebDriver driver = null;
public static FlipkartObj flpkart = null;
public static AmazonObj amzn = null;
public static int priceAmzn;
public static int priceFlp;
	
	public static void initialization() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Library\\browsers\\chromedriver.exe");
		driver = new ChromeDriver();
		amzn = new AmazonObj(driver);
		flpkart= new FlipkartObj(driver);
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
}
