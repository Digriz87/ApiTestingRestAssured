package pages;

import org.openqa.selenium.By;

public class ConnectorsPage {
    private By cloudDeviceButton = By.xpath("//button[contains(@class,'primary icon-left')]");
    private By office365Admin = By.xpath("//span[normalize-space()='Add Microsoft 365 connector']");
    private By btnSignInPopup = By.xpath("//button[@class='primary ']");
    private By inputEmailForSignIn = By.xpath("//div[@class='placeholderContainer']//input[@id='i0116']");
    private By btnNextOnPopup = By.xpath("//input[@id='idSIButton9']");
    private By fieldForPassword = By.xpath("//input[@name='passwd']");
    private By btnAgree = By.xpath("//input[@type='submit']");

    public By getCloudDeviceButton() {
        return cloudDeviceButton;
    }
    public By getbtnAgreeWithCondition() {
        return btnAgree;
    }
    public By getOffice365Admin() {
        return office365Admin;
    }
    public By getSignInButton() {
        return btnSignInPopup;
    }
    public By getInputFieldForEmail() {
        return inputEmailForSignIn;
    }
    public By getBtnNext() {
        return btnNextOnPopup;
    }
    public By getFieldForPasswordToMicrosoft() {
        return fieldForPassword;
    }

}
