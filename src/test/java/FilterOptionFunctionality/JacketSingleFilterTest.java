package FilterOptionFunctionality;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JacketSingleFilterTest {
	
	WebDriver driver;

	public JacketSingleFilterTest (WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void url() throws InterruptedException
	{
		driver.get("https://magento.softwaretestingboard.com/women/tops-women/jackets-women.html");
		Thread.sleep(2000);
	}

	public void singlefiltertest()
	{
		driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/div[1]/div[2]/ol/li[1]/a")).click();
		
		List<WebElement> products=driver.findElements(By.className("product-item-link"));
		
		System.out.println(products.size());
		for(WebElement webElement:products)
		{
			String name=webElement.getText();
			System.out.println(name);
			}
		
	}
}
