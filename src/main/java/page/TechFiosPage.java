package page;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TechFiosPage {

	WebDriver driver;

	public TechFiosPage(WebDriver driver) {
		this.driver = driver;

	}

	//Element Library
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Set SkyBlue Background')]")
	WebElement SET_SKYBLUE_BACKGROUND_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Set White Background')]")
	WebElement SET_WHITE_BACKGROUND_BUTTON_ELEMENT;




	
	// Interactive methods
	public void clickOnSetSkyBlueBackgroundButton() {
		SET_SKYBLUE_BACKGROUND_BUTTON_ELEMENT.click();
	}
	
	public void takeScreenshotAtEndOfSkyBlueBackgroundChange() throws IOException {
		TakesScreenshot ts = ((TakesScreenshot) driver);
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File("screenshot" + "/screenshots" + System.currentTimeMillis() + ".png"));
	} 
	public void clickOnSetWhiteBackgroundButton() {
		SET_WHITE_BACKGROUND_BUTTON_ELEMENT.click();
	}
	
	public void takeScreenshotAtEndOfWhiteBackgroundChange() throws IOException {
		TakesScreenshot ts = ((TakesScreenshot) driver);
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File("screenshot" + "/screenshots" + System.currentTimeMillis() + ".png"));
	} 
	
	
}

