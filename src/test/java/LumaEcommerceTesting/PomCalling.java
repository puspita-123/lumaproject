package LumaEcommerceTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import FilterOptionFunctionality.HoodieSingleFilterTest;
import FilterOptionFunctionality.JacketSingleFilterTest;
import FilterOptionFunctionality.MultipleFilterTest;
import HomePageFunctionality.AddBoxWorkingTest;
import HomePageFunctionality.InvalidLoginFunctionality;
import HomePageFunctionality.LoginFunctionality;
import HomePageFunctionality.LogoTesting;
import HomePageFunctionality.LogoutFunctionality;
import HomePageFunctionality.PageTitle;
import HomePageFunctionality.RegistrationPage;
import SeachOptionFunctionality.EnterSearchFunctionality;
import SeachOptionFunctionality.RelevantProductDisplay;
import SeachOptionFunctionality.RelevantProductDisplayGear;
import SeachOptionFunctionality.RelevantProductDisplayMen;
import addtowishlistcheck.AddToCompareTest;
import addtowishlistcheck.EditEmailIdTest;
import addtowishlistcheck.EditPasswordTest;
import addtowishlistcheck.QuantityTest;
import addtowishlistcheck.womenjacketatwlcheck;
import buyproducttest.BuyProductButtonCheck;
import showperpagetest.ShowpageBydefaultText;
import showperpagetest.TwelvePerPageCheck;
import sortoptionfunctionality.ByDefaultTextCheck;
import sortoptionfunctionality.SortByPriceTest;
import sortoptionfunctionality.SortByProductTest;

public class PomCalling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		    PageTitle pgt=new PageTitle(driver);
			pgt.url();
			pgt.pagetle();
			
		
			RegistrationPage rsp=new RegistrationPage(driver);
			rsp.url1();
		    rsp.enterdetails("sweta","mishra", "avc@gmail.com", "abcdrf@123", "abcdrf@123");
			rsp.createacc();
			
			LogoTesting lgt=new LogoTesting(driver);
			lgt.url2();
			lgt.logo();
			
			LoginFunctionality lif=new LoginFunctionality(driver);
			lif.url();
			lif.logincheck("zxcv@gmail.com", "zxcv@123");
			
			LogoutFunctionality lof=new LogoutFunctionality(driver);
			lof.url();
			lof.logoutcheck("zxcv@gmail.com", "zxcv@123");
			
			InvalidLoginFunctionality ilf=new InvalidLoginFunctionality(driver);
			ilf.url3();
			ilf.logintest("xyz@gmail.com", "cvry@123");
			ilf.clickbutton();


	         RelevantProductDisplay rpd=new  RelevantProductDisplay(driver);
			 rpd.url();
			 rpd.searchcheck();
			 rpd.productvalidation();
			 
			 
			 EnterSearchFunctionality esf=new EnterSearchFunctionality(driver);
			 esf.url();
			 esf.searchbtn();
			 
			 
			 RelevantProductDisplayMen rpdm=new RelevantProductDisplayMen(driver);
			 rpdm.url();
			 rpdm.searchcheck();
			 rpdm.productvalidation();
			 
			 RelevantProductDisplayGear rpdg=new RelevantProductDisplayGear(driver);
			 rpdg.url();
			 rpdg.searchcheck();
			 rpdg.productvalidation();


	        JacketSingleFilterTest jsft=new JacketSingleFilterTest(driver);
			jsft.url();
			jsft.singlefiltertest();


	        HoodieSingleFilterTest hsft=new HoodieSingleFilterTest(driver);
			hsft.url();
			hsft.Hoodiefiltertest();
			hsft.climatefilter();
			
	        SortByProductTest sbpt=new SortByProductTest(driver);
			sbpt.url();
			sbpt.sortbyproduct();

	        SortByPriceTest sbp=new SortByPriceTest(driver);
			sbp.url();
			sbp.sortbyprice();


			ByDefaultTextCheck bftc=new ByDefaultTextCheck(driver);
			bftc.url();
			bftc.defaulttestcheck();


	        TwelvePerPageCheck tppc=new TwelvePerPageCheck(driver);
			tppc.url();
			tppc.firsttest();



	         ShowpageBydefaultText sbdt=new ShowpageBydefaultText (driver);
			sbdt.url();
			sbdt.bydefaulttext();


	        womenjacketatwlcheck wjc=new womenjacketatwlcheck(driver);
			wjc.url();
			wjc.womenjacketcheck();


	        EditEmailIdTest eeit=new EditEmailIdTest(driver);
			eeit.url();
			eeit.editemail();


	        EditPasswordTest ept=new EditPasswordTest(driver);
			ept.url();
			ept.pwordtest();

	        MultipleFilterTest mft=new MultipleFilterTest(driver);
			mft.url();
			mft.mfiltertest();

	         AddToCompareTest act=new  AddToCompareTest(driver);
			 act.url();
			 act.addtocomparecheck();

	        QuantityTest qtt=new QuantityTest(driver);
			qtt.url();
			qtt.quantitycheck();
			
			    BuyProductButtonCheck bpbc= new BuyProductButtonCheck(driver);
				bpbc.url();
				bpbc.buyitemtest();
				bpbc.enteradddetails("qwer@gmail.com", "qwer@123",  "accd street", "vinayak  nagar", "whitefield", "bangalore", "12345", "1234567890");
			
			    AddBoxWorkingTest abwt=new AddBoxWorkingTest(driver);
				abwt.url();
				abwt.addboxtest();



	}

}