package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PurchasePage {

    WebDriver driver;

    public PurchasePage(WebDriver driver) {

        this.driver = driver;

    }

    By name = By.id("inputName");
    By address = By.id("address");
    By city = By.id("city");
    By state = By.id("state");
    By zip = By.id("zipCode");
    By cardNumber = By.id("creditCardNumber");

    By purchaseButton = By.xpath("//input[@value='Purchase Flight']");

    public void enterPassengerDetails() {

        driver.findElement(name).sendKeys("Teja");
        driver.findElement(address).sendKeys("India");
        driver.findElement(city).sendKeys("Hyderabad");
        driver.findElement(state).sendKeys("Telangana");
        driver.findElement(zip).sendKeys("500001");
        driver.findElement(cardNumber).sendKeys("123456789012");

    }

    public void clickPurchase() {

        driver.findElement(purchaseButton).click();

    }

}