package Dominos_base_pkg;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dominose_baseclass {

	public static WebDriver driver;

	public static void enterurl(String s) {
		driver.get(s);
	}

	public static void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}

	public static void input(WebDriver driver, WebElement element, String u) {
		element.sendKeys(u);
	}

	public static void cli(WebElement clk) {
		clk.click();
	}

	public static void close(WebDriver driver) {
		driver.close();
	}

	public static void toTakeSnap(WebDriver driver, String picname) throws IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File s = tk.getScreenshotAs(OutputType.FILE);
		File d = new File("C:\\Users\\myler\\eclipse-workspace\\Dominos_cucumber_04\\src\\test\\resources\\dominos_snap"
				+ picname + ".png");
		FileUtils.copyFile(s, d);
	}

	public static void toGetText(WebDriver driver) {
		Alert a1 = driver.switchTo().alert();
		String t = a1.getText();
		System.out.println(t);
	}
 
	public static void toScrollUp(WebDriver driver, WebElement ref) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", ref);
	}

	public static void toScrollDown(WebDriver driver, WebElement ref) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", ref);

	}

	public static void jclick(WebDriver driver, By locatemebtn) {
		JavascriptExecutor jc = (JavascriptExecutor) driver;
		jc.executeScript("arguments[0].click();", locatemebtn);
	}

	public void implwait(WebDriver driver, int seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));

	}

	public void explicitWait(WebDriver driver, WebElement element) {

		WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofMinutes(1));
		driverWait.until(ExpectedConditions.visibilityOf(element));
	}

}
