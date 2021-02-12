package com.sr.genericlib;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
/**
 * 
 * @author Krithika
 *
 */
public class Utilies {
	/**
	 * to handle dropdown
	 * @param ele
	 * @param text
	 */
	public void dropDown(WebElement ele,String text) {
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}
	/**
	 * handle mouseaction
	 * @param driver
	 * @param ele
	 */
public void mouseAction(WebDriver driver ,WebElement ele) {
	Actions a=new Actions(driver);
	a.moveToElement(ele).perform();
	
}
/**
 * handle double click
 * @param driver
 * @param target
 */
public void doubleClick(WebDriver driver,WebElement target) {
	Actions a=new Actions(driver);
	a.doubleClick(target).perform();
}
/**
 * handle scrollbar
 * @param driver
 * @param x
 * @param y
 */
public void scrollBar(WebDriver driver,int x,int y) {
	JavascriptExecutor j=(JavascriptExecutor)driver;
	j.executeScript("window.scrollBy("+x+","+y+")");
}
/**
 * handle alertpopup
 * @param driver
 */
 public void alertpopup(WebDriver driver) {
	 driver.switchTo().alert().accept();
	
}
}
