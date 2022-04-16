package qaautomation.march2022;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import qaautomation.march2022.pages.LoginPage;
import qaautomation.march2022.pages.LoginPageFactory;
import qaautomation.march2022.pages.ProfilePage;
import qaautomation.march2022.pages.ProfilePageFactory;

/**
 * Unit test for simple App.
 */
public class AppTestAfterPageFactory extends BaseWebTestHeadless {


	// karena semua extends dari BaseWebTest maka semua driver mesti menggunakan
	// driver.get()
	@Test
	public void loginSuccess() {
		LoginPageFactory loginPage = new LoginPageFactory(driver, explicitWait);
		ProfilePageFactory profilePage = new ProfilePageFactory(driver, explicitWait);
		String username = "tomsmith";
		String password = "SuperSecretPassword!";

		loginPage.inputUsername(username);
		loginPage.inputPassword(password);
		loginPage.clickLoginButton();

		String actualText = profilePage.getProfileText();

		String expectedText = "You logged into a secure area!";
		Assert.assertTrue(actualText.contains(expectedText));
	}

	@Test
	public void loginWithoutSubmitLoginBtn() {
		LoginPageFactory loginPage = new LoginPageFactory(driver, explicitWait);
		ProfilePageFactory profilePage = new ProfilePageFactory(driver, explicitWait);
		String username = "tomsmith";
		String password = "SuperSecretPassword!";
		
		loginPage.inputUsername(username);
		loginPage.inputPassword(password);
		
		String actualText = loginPage.getBannerText();
		String expectedText = "Login Page";
		Assert.assertTrue(actualText.contains(expectedText));
	}

	@Test
	public void loginInvalidPassword() {
		LoginPageFactory loginPage = new LoginPageFactory(driver, explicitWait);
		ProfilePageFactory profilePage = new ProfilePageFactory(driver, explicitWait);
		String username = "tomsmith";
		String password = "passwordsalah!";

		loginPage.inputUsername(username);
		loginPage.inputPassword(password);
		loginPage.clickLoginButton();

		String actualText = profilePage.getProfileText();
		String expectedText = "Your password is invalid!";
		Assert.assertTrue(actualText.contains(expectedText));
	}
}
