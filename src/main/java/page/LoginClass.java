package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginClass extends BasePage {

	WebDriver driver;
	
	
	public LoginClass(WebDriver driver) {
		
		this.driver=driver;
	}
	
	
	@FindBy(how=How.ID, using="username")
	WebElement UserName;
	
	@FindBy(how=How.ID, using="password")
	WebElement Password;
	@FindBy(how=How.NAME, using="login")
	WebElement SigninButton;
	
	public void login(String username, String password) {
		
	UserName.sendKeys(username);
	Password.sendKeys(password);
	SigninButton.click();
	
	}

	public String getPageTitle() {
		// TODO Auto-generated method stub
		return driver.getTitle();
	}
	}
