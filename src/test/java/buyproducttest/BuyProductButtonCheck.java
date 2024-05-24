package buyproducttest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class BuyProductButtonCheck {
	
	WebDriver driver;

	public  BuyProductButtonCheck (WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void url() throws InterruptedException
	{
		driver.get("https://magento.softwaretestingboard.com/men/tops-men/tanks-men.html");
		Thread.sleep(2000);
	}
	
	public void buyitemtest() throws InterruptedException
	{
		driver.findElement(By.linkText("Cassius Sparring Tank")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"option-label-size-143-item-167\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"option-label-color-93-item-50\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"product-addtocart-button\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[1]/ul/li[1]/button")).click();
		Thread.sleep(3000);
		
	}
	By email=By.id("customer-email");
	By pass=By.id("customer-password");
	
	
	By stname=By.name("street[0]");
	By location=By.name("street[1]");
	By area=By.name("street[2]");
	By city=By.name("city");
	By pstcd=By.name("postcode");
	By tphone=By.name("telephone");
	
	public void enteradddetails(String e, String ps,  String s, String lo, String a, String c, String p, String t) throws InterruptedException
	{
		driver.findElement(email).sendKeys(e);
		Thread.sleep(5000);
		driver.findElement(pass).sendKeys(ps);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"customer-email-fieldset\"]/fieldset/div[2]/div[1]/button")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[2]/div/div[3]/form/div[1]/table/tbody/tr[1]/td[1]/input")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div/div[2]/div[4]/ol/li[2]/div/div[3]/form/div[3]/div/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button/span")).click();
		Thread.sleep(2000);
		String accurl=driver.getCurrentUrl();
		System.out.println(accurl);
		
		
			System.out.println("product ordered succefully hence test case passed");
		
	}
}

