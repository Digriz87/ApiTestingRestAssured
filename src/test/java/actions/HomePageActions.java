package actions;

import org.openqa.selenium.*;
import pages.BasePage;
import pages.HomePage;
import pages.LoginPage;

public class HomePageActions extends BasePage {

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    public HomePageActions(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        openUrl(homePage.getPageUrl());
    }

    public void login(String login, String password) {
        waitForVisibilityOf(loginPage.getLogin());
        sendKeys(loginPage.getLogin(),login);
        sendKeys(loginPage.getPassword(),password);
        click(loginPage.getSubmit());
    }
}
