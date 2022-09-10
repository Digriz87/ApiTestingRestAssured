import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import actions.ConnectorsActions;
import actions.HomePageActions;

public class AddOffice369Test extends BaseTest {

    String login = "automation@keepitqa.com";
    String password = "E#*b2wGIbFHz";

    @Test()
    public void office365Test() {
        //SignIn -> Add connector Office365 -> SignIn to Microsoft account - > get Result
        HomePageActions homePageActions = new HomePageActions(driver);
        ConnectorsActions connectorsActions = new ConnectorsActions(driver);
        homePageActions.openPage();
        homePageActions.login(login, password);
        String officeHeader = connectorsActions.get365OfficeHeader();

        Assert.assertTrue(officeHeader.contains("AADSTS500200")); // Expected code AADSTS500200
    }
}
