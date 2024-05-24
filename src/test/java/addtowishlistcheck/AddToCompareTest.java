package addtowishlistcheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCompareTest {
	
	WebDriver driver;

	public  AddToCompareTest (WebDriver driver)
	{
		this.driver=driver;
	}
public void url() throws InterruptedException
{
	driver.get("https://magento.softwaretestingboard.com/gear/watches.html");
	Thread.sleep(200);
}
	
	public void addtocomparecheck() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/div/strong/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("ADD TO COMPARE")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div/a")).click();
		Thread.sleep(3000);
		
		String product=driver.findElement(By.xpath("//*[@id=\"product-comparison\"]/tbody[1]/tr/td/strong/a")).getText();
		
		if(product.contentEquals("Didi Sport Watch"))
		{
			System.out.println("product added to the compare page hence test case passed");
		}
	}
}
