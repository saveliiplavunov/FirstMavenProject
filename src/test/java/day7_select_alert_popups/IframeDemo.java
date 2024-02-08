package day7_select_alert_popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IframeDemo {

	public static void main(String[] args) {
		iFrameDemo();
	}
	
	public static void iFrameDemo() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		
		driver.get("https://demoqa.com/frames");
		
		
		String mainFrameText = driver.findElement(By.xpath("//*[contains(text(),'Sample Iframe page')]")).getText();
		System.out.println(mainFrameText);
		
		driver.switchTo().frame("frame1");
		
		String frameText = driver.findElement(By.id("sampleHeading")).getText();
		if (frameText.equals("This is a simple page")) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
	
	}

}
