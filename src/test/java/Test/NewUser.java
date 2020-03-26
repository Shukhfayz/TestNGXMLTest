package Test;

import java.io.IOException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Page.HomePage;
import Page.SignUpPage;
import Util.TestBase;

public class NewUser extends TestBase{
	
	@Test
	@Parameters({"FullName","Email","Password","PasswordConf"})
	public void AddingContacts(String name, String email, String password, String passwordConf) throws IOException, InterruptedException {

		
		HomePage website = PageFactory.initElements(driver, HomePage.class);

		website.OpenBrowser(driver);
		
		
		
		//String expectedTitle = "Welcome to Let's Kode It";

		//String actuelTitle = website.getPageTitle();

		//Assert.assertEquals(expectedTitle, actuelTitle);

		SignUpPage Forme = PageFactory.initElements(driver, SignUpPage.class);
        Forme.FillTheForm(name,email,password,passwordConf);

		driver.close();
		driver.quit();
	}
}