package pl.lait.Steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.*;
import cucumber.api.java.en.Given;
import pl.lait.Setup.Init;

public class MainPageStepDefs extends Init {
	protected WebDriver driver;

	@Before
	public void init() {
		driver = getDriver();
	}

	@Given("^I open main page$")
	public void i_open_main_page() {
		System.out.println("Krok pierwszy w naszym teście.");
	}

	@After
	public void end() {

	}

}
