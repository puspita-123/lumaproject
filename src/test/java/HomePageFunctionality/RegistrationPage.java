package HomePageFunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
	WebDriver driver;

	public RegistrationPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	By fname=By.name("firstname");
	By lname=By.name("lastname");
	By emailid=By.name("email");
	By pwd=By.name("password");
	By confirmpwd=By.name("password_confirmation");
	By button=By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button");

	public void url1() throws InterruptedException
	{
	   driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
	   Thread.sleep(2000);
	}
	public void enterdetails(String f,String l,String e, String p, String c) throws InterruptedException
	{
		driver.findElement(fname).sendKeys(f);
		Thread.sleep(2000);
		driver.findElement(lname).sendKeys(l);
		driver.findElement(emailid).sendKeys(e);
		Thread.sleep(2000);
		driver.findElement(pwd).sendKeys(p);
		Thread.sleep(2000);
		driver.findElement(confirmpwd).sendKeys(c);
		
		}
	public void createacc() throws InterruptedException
	{
		driver.findElement(button).click();
		Thread.sleep(3000);
		
		String accurl=driver.getCurrentUrl();
		String expurl="https://magento.softwaretestingboard.com/customer/account/";
		
		if(expurl.equals(accurl))
		{
			System.out.println("Current url is "  +accurl);
			System.out.println("Registration done successfully and test case passed");
		}
	}
}
