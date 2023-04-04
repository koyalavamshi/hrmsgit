package testngExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Exp_Testing {
	WebDriver driver;
	@BeforeClass
	public void setUp() {
	 System.setProperty("webdriver.geckodriver.driver","C:\\drivers\\geckodriver\\geckodriver.exe");
	 driver = new FirefoxDriver();
	 driver.manage().window().maximize();
	 driver.get("http://183.82.103.245/nareshit/login.php");
	 }
	@Test
	public void login() throws InterruptedException {
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		 driver.findElement(By.linkText("Logout")).click();
	}
	@AfterClass
	public void close() {
		driver.close();
		 }

}
