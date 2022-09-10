package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static base.BaseTest.getDriver;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = getDriver();
    }

    protected void openUrl(String url) {
        driver.get(url);
    }

    protected WebElement find(By locator) {
        return driver.findElement(locator);
    }

    protected void click(By locator) {
        waitForVisibilityOf(locator, 10);
        find(locator).click();
    }

    protected void scrollToElement(By cloudDeviceButton) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
                driver.findElement(cloudDeviceButton));
    }

    protected void sendKeys(By locator, String text) {
        waitForVisibilityOf(locator, 5);
        find(locator).sendKeys(text);
    }

    protected String getText(By locator) {
        waitForVisibilityOf(locator, 5);
        return find(locator).getText();
    }

    protected void waitFor(ExpectedCondition<WebElement> condition, Integer timeOut) {
        timeOut = timeOut != null ? timeOut : 30;
        WebDriverWait wait = new WebDriverWait(driver, timeOut);
        wait.until(condition);
    }

    public String getCurrentPage() {
        return driver.getCurrentUrl();
    }

    protected void waitForVisibilityOf(By locator, Integer... timeOutInSeconds) {
        int attemps = 0;
        while (attemps < 2) {
            try {
                waitFor(ExpectedConditions.visibilityOfElementLocated(locator),
                        (timeOutInSeconds.length > 0 ? timeOutInSeconds[0] : null));
                break;
            }catch (StaleElementReferenceException e){

            }
            attemps++;
        }
    }
}
