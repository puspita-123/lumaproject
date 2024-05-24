package HomePageFunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogoTesting {
	
	WebDriver driver;

	public LogoTesting (WebDriver driver)
	{
		this.driver=driver;
	}
public void url2() throws InterruptedException
{
	driver.get("https://magento.softwaretestingboard.com/");
	Thread.sleep(2000);
}
	
	public void logo()
	{
		WebElement i=driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/a/img"));
		
		Boolean p=(Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth !=\"undefined\""  + "&& arguments[0].naturalWidth > 0", i);
	
	if(p)
	{
		System.out.println("logo present");
		
	}
	else
	{
		System.out.println("logo not present");
	}
	}
	
}
