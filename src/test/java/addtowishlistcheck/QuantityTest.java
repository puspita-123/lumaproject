package addtowishlistcheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QuantityTest {
	
	WebDriver driver;

	public  QuantityTest (WebDriver driver)
	{
		this.driver=driver;
	}

	
	public void url() throws InterruptedException
			{
				driver.get("https://magento.softwaretestingboard.com/strike-endurance-tee.html");
				Thread.sleep(2000);
			}
	
	public void quantitycheck() throws InterruptedException
		{
			driver.findElement(By.xpath("//*[@id=\"option-label-size-143-item-166\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"option-label-color-93-item-49\"]")).click();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"qty\"]")).clear();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"qty\"]")).sendKeys("5");
			
			driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div/a")).click();
			Thread.sleep(3000);
			
			String qnt=driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div/div[2]/form/div[1]/table/tbody/tr[1]/td[3]/div/div/label/input")).getAttribute("value");
			System.out.println(qnt);
			
			if(qnt.contains("5"))
           {
	         System.out.println("Quantity check done successfully hence test case passed");

	
            }
		}
}
		
	
			
			
