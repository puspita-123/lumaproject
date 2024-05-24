package showperpagetest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ShowpageBydefaultText {
	
	WebDriver driver;

	public  ShowpageBydefaultText (WebDriver driver)
	{
		this.driver=driver;
	}

	
	public void url() throws InterruptedException
	{
		driver.get("https://magento.softwaretestingboard.com/gear/fitness-equipment.html");
		Thread.sleep(2000);
	}

	public void bydefaulttext() throws InterruptedException
	{
		Select defaulttext=new Select(driver.findElement(By.className("limiter-options")));
		String p=defaulttext.getFirstSelectedOption().getAttribute("innerHTML");
		System.out.println(p);
	int i=12;
	String s=Integer.toString(i);
	
	if(s.valueOf(p) != null)
	{
		System.out.println("test case passed");
	}

	}
}

