package sortoptionfunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SortByPriceTest {
	
	WebDriver driver;

	public SortByPriceTest (WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void url() throws InterruptedException
	{
		driver.get("https://magento.softwaretestingboard.com/gear/fitness-equipment.html");
		Thread.sleep(2000);
	}
	
	public void sortbyprice() throws InterruptedException
	{
		Select sort=new Select(driver.findElement(By.className("sorter-options")));
		sort.selectByVisibleText("Price");
		
		String accurl=driver.getCurrentUrl();
		String expurl="https://magento.softwaretestingboard.com/gear/fitness-equipment.html?product_list_order=price";
		
		if(expurl.equals(accurl))
		{
			System.out.println("Test case passed");
		}
	}
	
	
}



