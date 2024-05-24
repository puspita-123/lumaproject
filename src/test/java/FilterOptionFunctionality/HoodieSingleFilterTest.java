package FilterOptionFunctionality;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HoodieSingleFilterTest {
	WebDriver driver;

	public HoodieSingleFilterTest (WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void url() throws InterruptedException
	{
		driver.get("https://magento.softwaretestingboard.com/men/tops-men/hoodies-and-sweatshirts-men.html");
		Thread.sleep(2000);
	}
	
	public void Hoodiefiltertest() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[2]/div[2]/ol/li[1]/a")).click();
		Thread.sleep(2000);
	}
	
	public void climatefilter()
	{
	
		List<WebElement> productsize=driver.findElements(By.className("product-item-link"));
		System.out.println(productsize.size());
		for(WebElement webElement: productsize)
		{
			String productname=webElement.getText();
			System.out.println(productname);
			
		}
		 
		
	}
}

