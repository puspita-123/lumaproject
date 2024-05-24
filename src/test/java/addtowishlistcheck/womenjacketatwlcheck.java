package addtowishlistcheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class womenjacketatwlcheck {
	

	WebDriver driver;

	public womenjacketatwlcheck (WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void url() throws InterruptedException
	{
		driver.get("https://magento.softwaretestingboard.com/women/tops-women/jackets-women.html");
		Thread.sleep(2000);
	}

	public void womenjacketcheck() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/div/strong/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("ADD TO WISH LIST")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("email")).sendKeys("mnbv@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("mnbv@123");
		driver.findElement(By.id("send2")).click();
		Thread.sleep(2000);
		
		String acctext=driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div[1]/form/div[1]/ol/li/div/strong/a")).getText();
		System.out.println(acctext);
		
		if(acctext.contentEquals("Olivia 1/4 Zip Light Jacket"))
		{
			System.out.println("Product successfully addded to wishlist hence Test case passed");
			
		}
	}
}
