package showperpagetest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TwelvePerPageCheck {
	
	WebDriver driver;

	public TwelvePerPageCheck  (WebDriver driver)
	{
		this.driver=driver;
	}

	
	public void url() throws InterruptedException
	{
		driver.get("https://magento.softwaretestingboard.com/women/tops-women/tees-women.html");
		Thread.sleep(2000);
	}
	
	public void firsttest() throws InterruptedException
	{
		Select twelvepage=new Select(driver.findElement(By.id("limiter")));
		String p=twelvepage.getFirstSelectedOption().getText();
		Thread.sleep(2000);
	
		List<WebElement> count=driver.findElements(By.className("product-item-link"));
		String q=count.toString();
	
		
		if(q.valueOf(p) != null)
		{
			System.out.println(count.size());
			System.out.println("test case passed");
		}
		
	}
	
	
}
