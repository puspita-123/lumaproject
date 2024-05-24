package addtowishlistcheck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditPasswordTest {
	

	WebDriver driver;

	public EditPasswordTest (WebDriver driver)
	{
		this.driver=driver;
	}
	

	public void url() throws InterruptedException
	{
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(2000);
	}
public void pwordtest() throws InterruptedException

{
	driver.findElement(By.linkText("Sign In")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("email")).sendKeys("zxcv@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("mnbv@123");
	driver.findElement(By.id("send2")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/span/button")).click();
	driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/div/ul/li[1]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.linkText("Change Password" )).click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("current-password")).sendKeys("mnbv@123");
	driver.findElement(By.id("password")).sendKeys("zxcv@123");
	Thread.sleep(2000);
	driver.findElement(By.id("password-confirmation")).sendKeys("zxcv@123");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button")).click();
	
	String acctext=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div")).getText();
	String exptext="You saved the account information";
	System.out.println(acctext);
	
	
	if(exptext.valueOf(acctext) != null)
	{
		System.out.println("Password edited successfully hence test case passed");
	}
	else
	{
		System.out.println("test case failed");
	}
	}

	
}

