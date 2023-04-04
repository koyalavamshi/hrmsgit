package com.hrms.lib;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.hrms.utility.log;

public class General extends Gobal{
	
	//To provide all reusable fun: for whole application
	
	public void openApplication() {
		System.setProperty("webdriver.geckodriver.driver","C:\\drivers\\geckodriver\\geckodriver.exe");
		 driver = new FirefoxDriver();
		
		driver.navigate().to(url);
		System.out.println("Application opened ");
	}
	
	public void LoginApplication() {
	  driver.findElement(By.name(txt_loginname)).sendKeys(un);
	  driver.findElement(By.name(txt_password)).sendKeys(pw);
	  driver.findElement(By.name(btn_login)).click();
	  System.out.println("Application login ");
       log.info("Application login");
	}
	  public void Frame() {
	  driver.switchTo().frame(frame);
	  System.out.println("switch to frame");
		}
	  public void exitFrame() {
		  driver.switchTo().defaultContent();
	  }
	public void LogoutApplication() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}
	public void Close() {
		driver.close();
		System.out.println("Application closed ");
	}
	public void AddEmployee() {
		driver.findElement(By.xpath(link_Addemploye)).click();
		driver.findElement(By.name(First_name)).sendKeys(fn);
		driver.findElement(By.id(Last_name)).sendKeys(ln);
		driver.findElement(By.id(save)).click();
		System.out.println("Add employee");
		log.info("add new employee");
	}
	
	
	public void ClickOnCheckbox() {
		driver.findElement(By.name(Checkbox)).click();
		driver.findElement(By.xpath(Delete)).click();
	}
	
    public void MouseOverOnPIM() {
    	Actions ac = new Actions(driver);
    	ac.moveToElement(driver.findElement(By.linkText(ClickPIM))).perform();
    	driver.findElement(By.linkText(ClickAddemployee)).click();
    	log.info("Mouseover action");
    }
    public void Dropdown() {
    	Select st = new Select(driver.findElement(By.id(dropdown_Select)));
    	st.selectByVisibleText("Emp. ID");
    	List<WebElement>down=st.getOptions();
    	for(WebElement op:down) {
    		System.out.println(op.getText());
    		log.info("select the Dropdown ");
    	}
    }

}
