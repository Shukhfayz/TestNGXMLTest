package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SignUpPage {
	WebDriver driver;
	
	public SignUpPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	By FullName = By.cssSelector("input#user_name");
	By Email = By.cssSelector("input#user_email");
	By Password = By.cssSelector("input#user_password");
	By PasswordConf = By.cssSelector("input#user_password_confirmation");
	By RECapcha = By.xpath("//div[@class='recaptcha-checkbox-border']");
	By Term1 = By.cssSelector("input#user_unsubscribe_from_marketing_emails");
	By Term2 = By.cssSelector(" input#user_agreed_to_terms");
	By Submit = By.xpath("//input[@type='submit']");

	public void FillTheForm(String name, String email, String password, String passwordConf) {
        
//		System.out.println(name);
//		System.out.println(email);
		
		
		
		driver.findElement(FullName).sendKeys(name);
		driver.findElement(Email).sendKeys(email);
		driver.findElement(Password).sendKeys(password);
		driver.findElement(PasswordConf).sendKeys(passwordConf);
		driver.findElement(RECapcha).click();
		//Actions a1 = new Actions(driver);
		//a1.moveToElement(RECapcha).click().build().perform();
		driver.findElement(Term1).click();
		driver.findElement(Term2).click();
		driver.findElement(Submit).click();
		
	}
}