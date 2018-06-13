package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"/Users/asme/Documents/selenium dependencies/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://cybertekschool.com");
		WebDriver driver1 = new ChromeDriver();
		driver.get("http://google.com");
		WebDriver driver2 = new ChromeDriver();
		driver.get("http://amazon.com");
		WebDriver driver3 = new ChromeDriver();
		driver.get("http://tesfanews.com");

	}

}
