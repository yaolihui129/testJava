package com.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.seleniumhq.*;
public class testFirefoxDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr;
		dr = new FirefoxDriver();
		dr.get("http://www.baidu.com");
	}

}
