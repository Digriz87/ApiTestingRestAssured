package pages;

import org.openqa.selenium.By;

public class LoginPage {
    private By login = By.xpath("//input[@placeholder='Email']");
    private By password = By.xpath("//input[@placeholder='Password']");
    private By submit = By.xpath("//button[text()='Sign in']");

    public By getLogin() {
        return login;
    }

    public By getPassword() {
        return password;
    }

    public By getSubmit() {
        return submit;
    }
}
