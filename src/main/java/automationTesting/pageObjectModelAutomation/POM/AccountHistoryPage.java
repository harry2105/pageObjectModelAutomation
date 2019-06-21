package automationTesting.pageObjectModelAutomation.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountHistoryPage {
	
	WebDriver driver;
	
	private By link_ViewAccountHistory=By.linkText("View Account Summary");
	
	public AccountHistoryPage(WebDriver driver){
		this.driver=driver;
		
	}
	
	
	public boolean is_link_ViewAccountHistory_displayed(){
		
		WebDriverWait wait=new WebDriverWait(driver, 60);
		
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(link_ViewAccountHistory));
		boolean isDisplayed= driver.findElement(link_ViewAccountHistory).isDisplayed();
		
		return isDisplayed;
	}

}
