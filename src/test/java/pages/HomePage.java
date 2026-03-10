package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {

        this.driver = driver;

    }

    By departureCity = By.name("fromPort");
    By destinationCity = By.name("toPort");
    By findFlightsBtn = By.xpath("//input[@value='Find Flights']");

    public void selectCities() {

        Select departure = new Select(driver.findElement(departureCity));
        departure.selectByVisibleText("Boston");

        Select destination = new Select(driver.findElement(destinationCity));
        destination.selectByVisibleText("London");

    }

    public void clickFindFlights() {

        driver.findElement(findFlightsBtn).click();

    }

}