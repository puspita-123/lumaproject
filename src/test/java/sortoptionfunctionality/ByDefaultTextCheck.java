package sortoptionfunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ByDefaultTextCheck {
	
	WebDriver driver;

	public ByDefaultTextCheck (WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void url() throws InterruptedException
	{
		driver.get("https://magento.softwaretestingboard.com/gear/watches.html");
		Thread.sleep(2000);
	}

	public void defaulttestcheck()
	{
		Select select=new Select(driver.findElement(By.className("sorter-options")));
		String option=select.getFirstSelectedOption().getText();
		System.out.println(option);
		String exptext="Position";
		
		if(exptext.equals(option))
		{
			System.out.println("test case passed");
		}
	}
	
}
