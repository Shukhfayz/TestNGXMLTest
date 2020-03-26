package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class SignUpPage {
	WebDriver driver;
	
	public SignUpPage(WebDriver driver) {
		
		this.driver = driver;
	}


@FindBy(how=How.XPATH,using="//input[@id='user_name']")
WebElement FullName;
@FindBy(how=How.CSS, using="input#user_email")
WebElement Email;
@FindBy(how=How.CSS, using="input#user_password")
WebElement Password;
@FindBy(how=How.CSS, using="input#user_password_confirmation")
WebElement PasswordConf;

	
//	@FindBy.FullName = By.cssSelector("");
//	By Email = By.cssSelector("input#user_email");
//	By Password = By.cssSelector("input#user_password");
//	By PasswordConf = By.cssSelector("input#user_password_confirmation");
//	By RECapcha = By.xpath("//div[@class='recaptcha-checkbox-border']");
//	By Term1 = By.cssSelector("input#user_unsubscribe_from_marketing_emails");
//	By Term2 = By.cssSelector(" input#user_agreed_to_terms");
//	By Submit = By.xpath("//input[@type='submit']");

	public void FillTheForm(String name, String email, String password, String passwordConf) {
        
//		System.out.println(name);
//		System.out.println(email);
		
		
		
		FullName.sendKeys(name);
		Email.sendKeys(email);
		Password.sendKeys(password);
		PasswordConf.sendKeys(passwordConf);
//		driver.findElement(RECapcha).click();
//		//Actions a1 = new Actions(driver);
//		//a1.moveToElement(RECapcha).click().build().perform();
//		driver.findElement(Term1).click();
//		driver.findElement(Term2).click();
//		driver.findElement(Submit).click();
		
	}
}