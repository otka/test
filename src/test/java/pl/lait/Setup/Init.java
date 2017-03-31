package pl.lait.Setup;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Init {

	static FirefoxDriver driver;
	String folder = "allScreens";


	public static FirefoxDriver getDriver() {
		if (driver == null) {
			System.out.println("obiekt DRIVERa == NULL - wykonuję new FirefoxDriver()");
			driver = new FirefoxDriver();
			driver.get("http://newtours.demoaut.com");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			return driver;
		} else {
			System.out.println("obiekt DRIVERa != NULL - zwracam obiekt");
			return driver;
		}

	}
	
	public void printScr(String folder) {

		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		Long milis = timestamp.getTime();
		File srcFile = driver.getScreenshotAs(OutputType.FILE);
		System.out.println("Generating screenshot: " + milis);
		try {
			FileUtils.copyFile(srcFile, new File("target\\" + folder + "\\screenshot-" + milis + ".png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	public static void close() {
		driver.close();
		driver.quit();
		driver = null;
	}

	@After
	public void cleanUp() {
		close();
	}

}
