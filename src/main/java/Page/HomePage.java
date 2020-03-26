package Page;



import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Util.TestBase;

public class HomePage extends TestBase {
WebDriver driver;
By Signup = By.cssSelector("a#header-sign-up-btn");



public void OpenBrowser(WebDriver driver) throws IOException {
	this.driver = driver;
	driver=initializeDriver();	
	driver.get(prop.getProperty("url"));
	driver.findElement(Signup).click();
}
public WebElement SignUp()
{
	
	return driver.findElement(Signup);
}


}
