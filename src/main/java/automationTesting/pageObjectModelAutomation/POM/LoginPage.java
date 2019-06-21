package automationTesting.pageObjectModelAutomation.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver;
	private By txt_Username=By.id("uid");
	private By txt_Password=By.id("passw");
	private By btn_Login=By.name("btnSubmit");	
	
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
	}
	
	
	public void setUserName(String userName){
		try{
		driver.findElement(txt_Username).sendKeys(userName);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void setPassword(String passWord){
		try{
			driver.findElement(txt_Password).sendKeys(passWord);
			}catch(Exception e){
				e.printStackTrace();
			}
	}
	
	public void clickLoginButton(){
		
		try{
			driver.findElement(btn_Login).click();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
}
