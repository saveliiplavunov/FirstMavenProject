package day8_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actionsHM {

	public static void main(String[] args) {
		//ebayTwo();
		ebayOne();	
		}
	
	
	public static void ebayOne() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://ebay.com");
		
		Actions action = new Actions(driver);
		
		WebElement motorsElement = driver.findElement(By.linkText("Motors"));
		action.moveToElement(motorsElement).build().perform();
		
		WebElement parts = driver.findElement(By.linkText("Car & Truck Parts"));
		action.moveToElement(parts).click().perform();
		
		if (driver.getTitle().contains("Car & Truck Parts")) {
			System.out.println("Page with car & truck parts is open");
		}
		else {
			System.out.println("FAIL");
		}
		
	}
	public static void ebayTwo() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://ebay.com");
		Actions act = new Actions(driver);
		
		WebElement electronicsElement = driver.findElement(By.linkText("Electronics"));
		act.moveToElement(electronicsElement).build().perform();
		
		WebElement cameraPhoto = driver.findElement(By.linkText("Cameras & Photo"));
		act.moveToElement(cameraPhoto).click().perform();
		
		if (driver.getTitle().contains("Cameras & Photo")) {
			System.out.println("You are on the Cameras & Photo page");
		}
		else {
			System.out.println("Fail");
		}
	}
}
