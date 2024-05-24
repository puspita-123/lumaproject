package SeachOptionFunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RelevantProductDisplayMen {
	
	WebDriver driver;

	public RelevantProductDisplayMen (WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void url() throws InterruptedException
	{
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(2000);
	}
	
	public void searchcheck() throws InterruptedException
	{
		Actions actions=new Actions(driver);
		WebElement menTab=driver.findElement(By.xpath("//*[@id=\"ui-id-5\"]"));
		WebElement mentopTab=driver.findElement(By.xpath("//*[@id=\"ui-id-17\"]"));
		WebElement menjacketTab=driver.findElement(By.xpath("//*[@id=\"ui-id-19\"]"));
		actions.moveToElement(menTab).moveToElement(mentopTab).moveToElement(menjacketTab).click().perform();
				
		Thread.sleep(2000);
	}
	public void productvalidation()
	{
		
		String ProductName=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/ol/li[1]/div/div/strong/a")).getText();
		System.out.println(ProductName);
		driver.findElement(By.id("search")).sendKeys(ProductName);
		driver.findElement(By.id("search")).sendKeys(Keys.ENTER);
		
		String ResultProduct=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div[1]/div[2]/div[2]/ol/li[1]/div/div/strong/a")).getText();
		
		
		if(ProductName.equalsIgnoreCase(ResultProduct))
		{
			System.out.println("Results matched and test case passed");
		}
		else
		{
			System.out.println("Results not matched and test case failed");
			
	}
	}

}


