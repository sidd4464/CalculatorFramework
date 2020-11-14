package com.calculator.test.testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.calculator.test.CalculatorFramework.CalculatorSetup;
import com.calculator.test.pageObjects.CalculatorPageObjects;

public class CalculatorTest extends CalculatorSetup {

	@Test
	public void Calculate() throws InterruptedException, IOException {

		String n1 = getPropertyValue("four") + getPropertyValue("two") + getPropertyValue("three");
		String n2 = getPropertyValue("five") + getPropertyValue("two") + getPropertyValue("five");

		CalculatorPageObjects pob = new CalculatorPageObjects();
		Actions action = new Actions(driver);

		// Multiply Operations
		action.sendKeys(n1).build().perform();
		Thread.sleep(2000);
		pob.clickOnMultiply(driver).click();
		Thread.sleep(1000);
		action.sendKeys(n2).build().perform();
		Thread.sleep(2000);
		String text = pob.getAnswer(driver).getText();
		Assert.assertEquals(text, " 222075");
		pob.clearScreen(driver).click();
		System.out.println(text);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,-350)", "");

		
		
		// Divison Operation
		pob.clearScreen(driver).click();
		String n3 = getPropertyValue("four") + getPropertyValue("zero") + getPropertyValue("zero")
				+ getPropertyValue("zero");
		String n4 = getPropertyValue("two") + getPropertyValue("zero") + getPropertyValue("zero");
		action.sendKeys(n3).build().perform();
		Thread.sleep(2000);
		pob.divide(driver).click();
		Thread.sleep(2000);
		action.sendKeys(n4).build().perform();
		Thread.sleep(2000);
		String text1 = pob.getAnswer(driver).getText();
		Assert.assertEquals(" 20", text1);
		pob.clearScreen(driver).click();
		System.out.println(text1);

		
		
		// Addition Operation
		pob.clearScreen(driver).click();
		Thread.sleep(1000);

		String n5 = getPropertyValue("subtract") + getPropertyValue("two") + getPropertyValue("three")
				+ getPropertyValue("four") + getPropertyValue("two") + getPropertyValue("three")
				+ getPropertyValue("four");
		String n6 = getPropertyValue("three") + getPropertyValue("four") + getPropertyValue("five")
				+ getPropertyValue("three") + getPropertyValue("four") + getPropertyValue("five");
		action.sendKeys(n5).build().perform();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-350)", "");

		pob.clickOnAdd(driver).click();

		action.sendKeys(n6).build().perform();
		Thread.sleep(2000);
		String text2 = pob.getAnswer(driver).getText();
		Assert.assertEquals(text2, " 111111");
		pob.clearScreen(driver).click();
		System.out.println(text2);

		js.executeScript("window.scrollBy(0,-350)", "");

		
		// Subtraction Operation
		String n7 = getPropertyValue("two") + getPropertyValue("three") + getPropertyValue("four")
				+ getPropertyValue("eight") + getPropertyValue("two") + getPropertyValue("three");
		String n8 = getPropertyValue("subtract") + getPropertyValue("two") + getPropertyValue("three")
				+ getPropertyValue("zero") + getPropertyValue("nine") + getPropertyValue("four")
				+ getPropertyValue("eight") + getPropertyValue("two") + getPropertyValue("three"); 
		
		action.sendKeys(n7).build().perform();
		Thread.sleep(2000);
		pob.clickOnSubtract(driver).click();
		action.sendKeys(getPropertyValue("subtract")).build().perform();
		
		action.sendKeys(n8).build().perform();
		String text3 =pob.getAnswer(driver).getText();
		Assert.assertEquals(text3, " 23329646");
		System.out.println(text3);
	}

	public String getPropertyValue(String properties) {
		String value = CalculatorSetup.prop.getProperty(properties);
		return value;

	}

}
