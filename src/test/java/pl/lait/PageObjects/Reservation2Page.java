package pl.lait.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Reservation2Page {

	static String radioPathDepart = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/"
			+ "table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[1]/tbody/tr[9]/td[1]/input";

	static String radioPathReturn = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/"
			+ "table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table[2]/tbody/tr[7]/td[1]/input";

	static String checkDelAdr = "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/"
			+ "tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[14]/td[2]/input";
	
	static String textPassName = "passFirst0";
	static String textLastName = "passLast0";
	static String selectMeal = "pass.0.meal";
	static String selectCreditCard = "creditCard";
	static String textCreditNo = "creditnumber";
	static String selectExpYear = "cc_exp_dt_yr";
	static String selectExpMonth = "cc_exp_dt_mn";
	static String textCcName = "cc_frst_name";
	static String textCcMiddle = "cc_mid_name";
	static String textCcLast = "cc_last_name";
	static String textBillAdr = "billAddress1";
	static String textBillCity = "billCity";
	static String textBillState = "billState";
	static String textBillPostCode = "billZip";
	static String textBillCountry = "billCountry";
	static String buttonSecure = "buyFlights";

	static String buttonReserveFlights = "reserveFlights";

	public WebElement radio_departFlight(WebDriver driver) {
		return driver.findElement(By.xpath(radioPathDepart));
	}

	public WebElement radio_returnFlight(WebDriver driver) {
		return driver.findElement(By.xpath(radioPathReturn));
	}

	public WebElement button_selectFlights(WebDriver driver) {
		return driver.findElement(By.name(buttonReserveFlights));

	}

	public void text_passName(WebDriver driver, String name, String last) {
		driver.findElement(By.name(textPassName)).sendKeys(name);
		driver.findElement(By.name(textLastName)).sendKeys(last);
	}

	public void select_passMeal(WebDriver driver, String typeMeal) {
		Select passMeal = new Select(driver.findElement(By.name(selectMeal)));
		passMeal.selectByVisibleText(typeMeal);
	}

	public void select_ccType(WebDriver driver, String nameCard) {
		Select cardType = new Select(driver.findElement(By.name(selectCreditCard)));
		cardType.selectByVisibleText(nameCard);
	}

	public void text_ccNumber(WebDriver driver, String cardNumber) {
		driver.findElement(By.name(textCreditNo)).sendKeys(cardNumber);
	}

	public void select_ccExYear(WebDriver driver, String year) {
		Select exYear = new Select(driver.findElement(By.name(selectExpYear)));
		exYear.selectByVisibleText(year);
	}

	public void select_ccExMonth(WebDriver driver, String month) {
		Select exMonth = new Select(driver.findElement(By.name(selectExpMonth)));
		exMonth.selectByVisibleText(month);
	}

	public void text_ccOwnerName(WebDriver driver, String name, String middle, String last) {
		driver.findElement(By.name(textCcName)).sendKeys(name);
		driver.findElement(By.name(textCcMiddle)).sendKeys(middle);
		driver.findElement(By.name(textCcLast)).sendKeys(last);
	}

	public void text_billAddress(WebDriver driver, String adress, String city, String state, String postCode) {
		driver.findElement(By.name(textBillAdr)).clear();
		driver.findElement(By.name(textBillAdr)).sendKeys(adress);
		driver.findElement(By.name(textBillCity)).clear();
		driver.findElement(By.name(textBillCity)).sendKeys(city);
		driver.findElement(By.name(textBillState)).clear();
		driver.findElement(By.name(textBillState)).sendKeys(state);
		driver.findElement(By.name(textBillPostCode)).clear();
		driver.findElement(By.name(textBillPostCode)).sendKeys(postCode);
	}

	public void select_billCountry(WebDriver driver, String counrty) {
		Select billCountry = new Select(driver.findElement(By.name(textBillCountry)));
		billCountry.selectByVisibleText(counrty);
	}

	public WebElement check_delAdress(WebDriver driver) {
		return driver.findElement(By.xpath(checkDelAdr));
	}
	public WebElement check_delAdress2(WebDriver driver) {
		return driver.findElement(By.xpath(checkDelAdr));
	}

	public WebElement button_securePurchase(WebDriver driver) {
		return driver.findElement(By.name(buttonSecure));
	}
}
