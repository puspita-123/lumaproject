package HomePageFunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginFunctionality {
	WebDriver driver;

	public LoginFunctionality(WebDriver driver)
	{
		this.driver=driver;
	}
	

	By eid=By.id("email");
	By psd=By.id("pass");
	By sgnup=By.xpath("//*[@id=\"send2\"]/span");
	
	public void url() throws InterruptedException
	{
		driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/");
		Thread.sleep(2000);
	}
	
	public void logincheck(String e, String p) throws InterruptedException
	{
		driver.findElement(eid).sendKeys(e);
		driver.findElement(psd).sendKeys(p);
	    driver.findElement(sgnup).click();
	    Thread.sleep(2000);
	    
	    String accurl=driver.getCurrentUrl();
		String expurl="https://magento.softwaretestingboard.com/";
		
		if(expurl.equals(accurl))
		{
			System.out.println("Current url is "  +accurl);
			System.out.println(" logged in successfully and test case passed");
		}
	}
	
}
