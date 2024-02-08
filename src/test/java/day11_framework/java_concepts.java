package day11_framework;

import org.openqa.selenium.WebElement;
public class java_concepts {

	public static void main(String[] args) {
		
	}
	 
	public static void WebElement2(WebElement driver) {
		driver.click();
	}
		
	public static void typeTheSring(WebElement element,String input) {
		element.sendKeys(input);
	}
	
	public static String WebElement1(WebElement element) {
		return element.getText();
	}
}
