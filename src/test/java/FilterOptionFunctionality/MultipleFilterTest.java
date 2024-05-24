package FilterOptionFunctionality;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class MultipleFilterTest {
	
	WebDriver driver;

	public MultipleFilterTest  (WebDriver driver)
	{
		this.driver=driver;
	}
	
public void url() throws InterruptedException
{
	driver.get("https://magento.softwaretestingboard.com/women/tops-women/hoodies-and-sweatshirts-women.html");
	Thread.sleep(2000);
}

public void mfiltertest() throws InterruptedException
{
	driver.findElement(By.xpath(("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/div/strong/a"))).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id=\"option-label-size-143-item-166\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"option-label-color-93-item-53\"]")).click();
	
	
	driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]/span")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.linkText("shopping cart")).click();
	Thread.sleep(2000);
	
	String accsize=driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr[1]/td[1]/div/dl/dd[1]")).getText();
	String expsize="XS";
	System.out.println(accsize);
	String accclr=driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr[1]/td[1]/div/dl/dd[2]")).getText();
	String expclr="Green";
	System.out.println(accclr);
	
	if(expsize.equals(accsize) && expclr.equals(accclr))
	{
		System.out.println("test case passed");
	}
	
	
}


}
