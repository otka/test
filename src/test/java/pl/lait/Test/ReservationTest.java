package pl.lait.Test;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import pl.lait.PageObjects.MainPage;
import pl.lait.PageObjects.Reservation2Page;
import pl.lait.PageObjects.ReservationPage;
import pl.lait.PageObjects.SignOnPage;
import pl.lait.Setup.Init;

public class ReservationTest extends Init {

	protected static WebDriver driver;

//	@Before
	public void run() {
		driver = getDriver();
	}
//	@Test
	public void reservation() {
		MainPage mainPage = new MainPage();
		SignOnPage signOnPage = new SignOnPage();
		ReservationPage reservPage = new ReservationPage();
		Reservation2Page reserv2Page = new Reservation2Page();

		mainPage.link_signOn(driver).click();
		signOnPage.loginAs("dorota_12346", "qwe123", driver);
		reservPage.radio_oneWay(driver).click();
		reservPage.select_passengersCount(driver, "1");
		reservPage.select_departFrom(driver, "Paris");
		reservPage.select_fromMonth(driver, "March");
		reservPage.select_fromDay(driver, "3");
		reservPage.select_arriveIn(driver, "Portland");
		reservPage.select_toMonth(driver, "April");
		reservPage.select_toDay(driver, "15");
		reservPage.radio_FirstClass(driver).click();
		reservPage.select_airlines(driver, "Pangea Airlines");
		printScr("reservation");
		reservPage.button_FindFlights(driver).click();
		printScr("reservation");

		reserv2Page.radio_departFlight(driver).click();
		printScr("reservation2");
		reserv2Page.radio_returnFlight(driver).click();
		printScr("reservation2");
		reserv2Page.button_selectFlights(driver).click();

		reserv2Page.text_passName(driver, "Janina", "Kowalska");
		reserv2Page.select_passMeal(driver, "Diabetic");
		reserv2Page.select_ccType(driver, "Visa");
		reserv2Page.select_ccExMonth(driver, "03");
		reserv2Page.select_ccExYear(driver, "2007");
		reserv2Page.text_ccNumber(driver, "123456789");
		reserv2Page.text_ccOwnerName(driver, "Janina", "Lucyna", "Kowalska");
		reserv2Page.text_billAddress(driver, "Kaczeńcowa 5/45", "Lublin", "lubelskie", "20-222");
		reserv2Page.select_billCountry(driver, "POLAND");
		printScr("reservation2");
		reserv2Page.check_delAdress(driver).click();
		printScr("reservation3");
		
		reserv2Page.button_securePurchase(driver).click();
		printScr("reservation3");

	}

}
