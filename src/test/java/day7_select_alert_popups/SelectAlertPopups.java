package day7_select_alert_popups;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAlertPopups {

	public static void main (String[]args) throws InterruptedException {
		
	
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/select-menu");
	
	WebElement colors = driver.findElement(By.id("oldSelectMenu"));
	
	Select letsSelect = new Select(colors);
	Thread.sleep(500);
	
	String firstSelectedColor = letsSelect.getFirstSelectedOption().getText();
	
	System.out.println(firstSelectedColor);
	
	List <WebElement> allColors = letsSelect.getOptions();
	System.out.println(allColors.size());
	
	for (WebElement color : allColors) {
		System.out.println(color.getText());
	}
	
	List <WebElement> allSelectedOptions = letsSelect.getAllSelectedOptions();
	System.out.println(allSelectedOptions.size());
	
	letsSelect.selectByVisibleText("Black");
	
	Thread.sleep(2000);
	
	letsSelect.selectByIndex(4);
	
	
}
}