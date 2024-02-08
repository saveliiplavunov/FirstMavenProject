package day7_select_alert_popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultiSelectDemo {

	public static void main(String[] args) {
		
		
		
	}

		public static void WebDriverWaitDemo() {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://ebay.com");
			driver.findElement(By.linkText("Motors")).click();
			
			WebDriverWait letswait = new WebDriverWait(driver,Duration.ofSeconds(5));
			
			WebElement addVehicleLink = driver.findElement(By.xpath("//div[text@='Add a vehciel']"));
			letswait.until(ExpectedConditions.visibilityOf(addVehicleLink));
		}

	}


