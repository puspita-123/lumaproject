package sortoptionfunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SortByProductTest {
	
	WebDriver driver;

	public SortByProductTest (WebDriver driver)
	{
		this.driver=driver;
	}

	public void url() throws InterruptedException
	{
		driver.get("https://magento.softwaretestingboard.com/gear/bags.html");
		Thread.sleep(2000);
	}
	
	public void sortbyproduct() throws InterruptedException
	{
		Select sort=new Select(driver.findElement(By.className("sorter-options")));
		sort.selectByVisibleText("Product Name");
		
		String accurl=driver.getCurrentUrl();
		String expurl="https://magento.softwaretestingboard.com/gear/bags.html?product_list_order=name";
		
		if(expurl.equals(accurl))
		{
			System.out.println("Test case passed");
		}
	}
	
	
}
