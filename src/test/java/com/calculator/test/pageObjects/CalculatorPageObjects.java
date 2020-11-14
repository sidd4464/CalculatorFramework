package com.calculator.test.pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;

public class CalculatorPageObjects {  
	//Page Object Class for the Calculator Site
	
	
	By Input = By.xpath("//table[@id='sciout']");
	By Multiply = By.xpath("//tbody/tr[2]/td[2]/div[1]/div[3]/span[4]");
	
	By Answer = By.xpath("//div[@id='sciOutPut']"); 
	
	By ClearScreen = By.xpath("//tbody/tr[2]/td[2]/div[1]/div[5]/span[3]");
	
	By division = By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[4]"); 
	
	By Subtract = By.xpath("//tbody/tr[2]/td[2]/div[1]/div[2]/span[4]");
	
	By Add = By.xpath("//tbody/tr[2]/td[2]/div[1]/div[1]/span[4]");
	
	public WebElement EnterFirstElement(WebDriver driver) { 
		
	WebElement firstInt = driver.findElement(Input);
	return firstInt;
		
		
		
		
	}
	
	public WebElement clickOnMultiply(WebDriver driver) {
	WebElement multiply =driver.findElement(Multiply);
		return multiply;
		
	} 
	
	public WebElement getAnswer(WebDriver driver) {
		
	WebElement answer = driver.findElement(Answer);
	return answer;
	}
	
	public WebElement clearScreen(WebDriver driver) {
		
	WebElement clearScreen = driver.findElement(ClearScreen);
		return clearScreen;
	}
	
	public WebElement divide(WebDriver driver) {
		
	WebElement divide =	driver.findElement(division);
	return divide;
	}
	
	public WebElement clickOnSubtract(WebDriver driver) {
		WebElement subtract = driver.findElement(Subtract);
		return subtract;
	}
	
	public WebElement clickOnAdd(WebDriver driver) {
		WebElement add = driver.findElement(Add);
		return add;
	}
	
	

}
