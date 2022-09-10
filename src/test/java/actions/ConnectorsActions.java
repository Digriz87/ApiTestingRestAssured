package actions;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.ConnectorsPage;
import pages.CreateNewOffice365AdminPage;

public class ConnectorsActions extends BasePage {
    ConnectorsPage connectorsPage = new ConnectorsPage();
    CreateNewOffice365AdminPage createnewoffice365AdminPage = new CreateNewOffice365AdminPage();
    public ConnectorsActions(WebDriver driver) {
        super(driver);
    }
    @Test
    public String get365OfficeHeader(){
        click(connectorsPage.getCloudDeviceButton()); // Click Add connector
        System.out.println("STEP 1: Click Add Connector");
        click(connectorsPage.getOffice365Admin()); // Click Add connector Office365
        System.out.println("STEP 2: Click Add connector Office365");
        click(connectorsPage.getSignInButton()); // Click SignIn btn
        System.out.println("STEP 3: Click SignIn Button");
        click(connectorsPage.getInputFieldForEmail()); // Find field for input email
        sendKeys(connectorsPage.getInputFieldForEmail(),"fiveadvert@gmail.com"); // Input email
        System.out.println("STEP 4: Input email");
        click(connectorsPage.getBtnNext()); // Click Next btn
        System.out.println("STEP 5: Click Next Button");
        click(connectorsPage.getFieldForPasswordToMicrosoft()); // Click on field with input password of Microsoft account
        sendKeys(connectorsPage.getFieldForPasswordToMicrosoft(),"Trinity123"); // Input password
        System.out.println("STEP 6: Input Password");
        click(connectorsPage.getBtnNext()); // Click Next btn
        System.out.println("STEP 7: Click Enter Button");
        click(connectorsPage.getbtnAgreeWithCondition()); // Agree with condition about save next time
        System.out.println("STEP 8: Agree with condition about save next time");

        return getText(createnewoffice365AdminPage.getHeader()); // Return message of System
    }
}
