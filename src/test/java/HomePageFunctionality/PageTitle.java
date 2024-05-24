package HomePageFunctionality;

import org.openqa.selenium.WebDriver;

public class PageTitle {
	
	WebDriver driver;

	public PageTitle(WebDriver driver)
	{
		this.driver=driver;
	}

	
	public void url() throws InterruptedException
	{
		driver.get("https://magento.softwaretestingboard.com/");
		Thread.sleep(2000);
	}
	
	public void pagetle()
	{
		String acctle=driver.getTitle();
		String exptle="Home Page";
		if(exptle.equals(acctle))
		{
			System.out.println("Title is" +acctle);
			System.out.println("Test case passed");
		}
	}
}
