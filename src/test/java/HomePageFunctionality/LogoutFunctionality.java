package HomePageFunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class LogoutFunctionality {
	
	WebDriver driver;

	public LogoutFunctionality (WebDriver driver)
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
		public void logoutcheck(String e, String p) throws InterruptedException
		{
			driver.findElement(eid).sendKeys(e);
			driver.findElement(psd).sendKeys(p);
		    driver.findElement(sgnup).click();
		    Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/span/button")).click();
		driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a")).click();
		Thread.sleep(2000);
		 
		String accurl=driver.getCurrentUrl();
		String expurl="https://magento.softwaretestingboard.com/customer/account/logoutSuccess/";
		
		if(expurl.equals(accurl))
		{
			System.out.println("Current url is "  +accurl);
			System.out.println("log out done successfully and test case passed");
		}
		
	}
}
