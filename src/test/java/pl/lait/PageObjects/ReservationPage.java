package pl.lait.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ReservationPage {

	static String radioPathRoundTrip = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table"
			+ "/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[1])";

	static String radioPathOneWay = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table"
			+ "/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/b/font/input[2]";

	static String radioPathFirstClass = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/"
			+ "table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/font/font/input[2]";

	static String selectPassCount = "passCount";
	static String selectFromPort = "fromPort";
	static String selectFromMonth = "fromMonth";
	static String selectFromDay = "fromDay";
	static String selectToPort = "toPort";
	static String selectToMonth = "toMonth";
	static String selectToDay = "toDay";
	static String selectAirline = "airline";
	static String buttonFindFligts = "findFlights";

	public WebElement radio_roundTrip(WebDriver driver) {
		return driver.findElement(By.xpath(radioPathRoundTrip));
	}

	public WebElement radio_oneWay(WebDriver driver) {
		return driver.findElement(By.xpath(radioPathOneWay));
	}

	public void select_passengersCount(WebDriver driver, String visibleText) {
		Select passengers = new Select(driver.findElement(By.name(selectPassCount)));
		passengers.selectByVisibleText(visibleText);
	}

	public void select_departFrom(WebDriver driver, String namePortStart) {
		Select departFrom = new Select(driver.findElement(By.name(selectFromPort)));
		departFrom.selectByVisibleText(namePortStart);
	}

	/*
	 * public Select select_departFrom(WebDriver driver) { Select departFrom =
	 * new Select(driver.findElement(By.name(selectFromPort))); return
	 * departFrom; }
	 */

	public void select_fromMonth(WebDriver driver, String firstMonth) {
		Select fromMonth = new Select(driver.findElement(By.name(selectFromMonth)));
		fromMonth.selectByVisibleText(firstMonth);
	}

	public void select_fromDay(WebDriver driver, String firstDay) {
		Select fromDay = new Select(driver.findElement(By.name(selectFromDay)));
		fromDay.selectByVisibleText(firstDay);
	}

	public void select_arriveIn(WebDriver driver, String namePortArrive) {
		Select fromDay = new Select(driver.findElement(By.name(selectToPort)));
		fromDay.selectByVisibleText(namePortArrive);
	}

	public void select_toMonth(WebDriver driver, String lastMonth) {
		Select toMonth = new Select(driver.findElement(By.name(selectToMonth)));
		toMonth.selectByVisibleText(lastMonth);
	}

	public void select_toDay(WebDriver driver, String lastDay) {
		Select toDay = new Select(driver.findElement(By.name(selectToDay)));
		toDay.selectByVisibleText(lastDay);
	}

	public WebElement radio_FirstClass(WebDriver driver) {
		return driver.findElement(By.xpath(radioPathFirstClass));
	}

	public void select_airlines(WebDriver driver, String nameAirline) {
		Select toDay = new Select(driver.findElement(By.name(selectAirline)));
		toDay.selectByVisibleText(nameAirline);
	}

	public WebElement button_FindFlights(WebDriver driver) {
		return driver.findElement(By.name(buttonFindFligts));
	}
}
