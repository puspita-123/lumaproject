package SeachOptionFunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class EnterSearchFunctionality {
	WebDriver driver;

	public EnterSearchFunctionality (WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void url() throws InterruptedException
	{
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(2000);
	}
	
	public void searchbtn()
	{
		
		WebElement btn=driver.findElement(By.id("search"));
		btn.sendKeys(Keys.ENTER);
		
		boolean resultpage=driver.findElement(By.id("search")).equals(btn);
		
		if(resultpage)
		{
			System.out.println("Search box not performing when the keyword is not entered test case passed");
			
		}
		else
		{
			System.out.println("test case failed");
		}
			}

}
