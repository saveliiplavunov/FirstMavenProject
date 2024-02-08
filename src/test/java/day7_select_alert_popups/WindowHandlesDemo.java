package day7_select_alert_popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandlesDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoqa.com/browser-windows");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		
		String firstWindowID = driver.getWindowHandle();
		
		WebElement we1 = driver.findElement(By.id("tabButton"));
		we1.click();
		
		for (String newWindow : driver.getWindowHandles()) {
			driver.switchTo().window(newWindow);
		}
		WebElement we2 = driver.findElement(By.id("sampleHeading"));
		
		if (we2.getText().equals("This is a sample page")) {
			System.out.println("Verifed");
		}
		else {
			System.out.println("Fail");
		}
		System.out.println(firstWindowID);
		String newWindowID = driver.getWindowHandle();
		if (!newWindowID.equals(firstWindowID)) {
			System.out.println("U got it boss");
		}
		else {
			System.out.println("Oh well");
		}
	}

}
