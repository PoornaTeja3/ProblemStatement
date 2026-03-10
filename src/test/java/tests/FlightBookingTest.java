package tests;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;
import pages.FlightPage;
import pages.PurchasePage;

public class FlightBookingTest extends BaseClass {

    @Test

    public void bookFlightTest() {

        setup();

        HomePage home = new HomePage(driver);
        home.selectCities();
        home.clickFindFlights();

        FlightPage flight = new FlightPage(driver);
        flight.selectFlight();

        PurchasePage purchase = new PurchasePage(driver);
        purchase.enterPassengerDetails();
        purchase.clickPurchase();

        System.out.println("Flight booking completed successfully");

        tearDown();

    }

}