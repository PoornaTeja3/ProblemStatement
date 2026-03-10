package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class FlightPage {

    WebDriver driver;

    public FlightPage(WebDriver driver) {
        this.driver = driver;
    }

    By chooseFlight = By.xpath("(//input[@value='Choose This Flight'])[1]");

    public void selectFlight() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.visibilityOfElementLocated(chooseFlight));

        driver.findElement(chooseFlight).click();
    }
}