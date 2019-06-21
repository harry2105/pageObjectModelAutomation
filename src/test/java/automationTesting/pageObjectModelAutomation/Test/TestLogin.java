package automationTesting.pageObjectModelAutomation.Test;

import org.openqa.selenium.WebDriver;

import automationTesting.pageObjectModelAutomation.POM.AccountHistoryPage;
import automationTesting.pageObjectModelAutomation.POM.LoginPage;
import automationTesting.pageObjectModelAutomation.utility.InitializeWebDriver;

public class TestLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=InitializeWebDriver.getDriver("chrome");
		driver.get("http://demo.testfire.net/login.jsp");
		
		LoginPage lp=new LoginPage(driver);
		
		lp.setUserName("jsmith");
		lp.setPassword("Demo1234");
		lp.clickLoginButton();
		
		AccountHistoryPage ahp=new AccountHistoryPage(driver);
		
		ahp.is_link_ViewAccountHistory_displayed();
		
	}

}
