package pages;

import org.openqa.selenium.By;

public class CreateNewOffice365AdminPage {
    private By header = By.xpath("//div[@id='exceptionMessageContainer']");

    public By getHeader() {
        return header;
    }
}
