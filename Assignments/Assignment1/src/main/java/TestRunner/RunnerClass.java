package TestRunner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.AssBase;


public class RunnerClass extends AssBase{

	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		initialization();
	}

	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

	@Test
	public void iPhone()
	{

		try {
			driver.navigate().to("https://www.amazon.in");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			amzn.obj_search.sendKeys("iPhone XR (64GB) - Yellow"); 
			amzn.obj_clk.click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			String A = amzn.obj_price.getText();
			System.out.println("Price of Iphone in Amazone is"+A);			



			driver.navigate().to("https://www.flipkart.com/");
			flpkart.obj_flp_page_click.click();
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("");
			flpkart.obj_flp_search.sendKeys("iPhone XR (64GB) - Yellow");
			flpkart.obj_flp_clk_search.click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			String B = flpkart.obj_flp_price.getText();
			System.out.println("Price of Iphone in Flipkart is"+B);


			int i=0;
			{
				int A_ch=A.charAt(i);
				int B_ch=B.charAt(i);

				if(A_ch>B_ch)
				{
					System.out.println("Flipkart is cheaper with the price of Rs"+B);
				}
				else
				{
					System.out.println("Amazon is cheaper with the price of Rs"+A);
				}

			}


		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
