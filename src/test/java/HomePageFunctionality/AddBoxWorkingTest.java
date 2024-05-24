package HomePageFunctionality;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddBoxWorkingTest {
	

	WebDriver driver;

	public  AddBoxWorkingTest (WebDriver driver)
	{
		this.driver=driver;
	}

	public void url() throws InterruptedException
	{
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(2000);
	}
	
	public void addboxtest() throws InterruptedException
	{
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/a/img")).click();
		Thread.sleep(5000);
		
		WebDriverWait wt=new WebDriverWait(driver, Duration.ofSeconds(10)); 
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div[1]/a/img")));
		System.out.println("current page url: " +driver.getCurrentUrl());
		System.out.println("Elementis clickable hence test case passed");
		
		
		}
			
			
		}
	
	
	

