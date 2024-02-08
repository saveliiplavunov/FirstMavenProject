package utils;

import org.openqa.selenium.By;

public class DriverUtilDemo {

	public static void main(String[] args) {
		sauceDemoTest();

	}
	
	public static void sauceDemoTest(){
		
		
		Driver.getDriver().get("https://saucedemo.com");
		
		Driver.getDriver().findElement(By.id("user-name")).sendKeys(DataReader.GetProperty("sauce_username"));
		
		Driver.getDriver().findElement(By.id("password")).sendKeys(DataReader.GetProperty("sauce_password"));
		
		Driver.getDriver().findElement(By.id("login-button")).click();
	}

}
