package day11_framework;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BrowserUtils {
	
	public static void main(String[] args) {
	
		
	}
	
	public static void AlertUtilsDemo(WebDriver driver,WebElement element,Alert alerts) {
		driver.get("https://demoqa.com/alerts");
		
	}
	
	public void selectByVisibleText(WebElement element) {
		Select select = new Select(element);
		selectByVisibleText(element);
	}
}
	

