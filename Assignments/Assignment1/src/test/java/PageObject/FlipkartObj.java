package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartObj {

	public FlipkartObj(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type='text']")
	public WebElement obj_flp_search;

	@FindBy(xpath = "//button[@class='_2AkmmA _29YdH8']")
	public WebElement obj_flp_page_click;
	
	@FindBy(xpath = "//button[@class='vh79eN']")
	public WebElement obj_flp_clk_search;

	@FindBy(xpath = "//div[@class='_1vC4OE _2rQ-NK']")
	public WebElement obj_flp_price;
	
}
