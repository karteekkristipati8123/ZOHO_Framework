package testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.ReadXlsData;

public class MyFirstTest extends BaseTest {
	@Test()
	public static void LoginTest() throws InterruptedException {
	driver.findElement(By.linkText(loc.getProperty("sign_link"))).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(loc.getProperty("email_field"))).sendKeys("karthikkristipati123@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath(loc.getProperty("next_button"))).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(loc.getProperty("password_field"))).sendKeys("Karthik@zoho8123");
	Thread.sleep(2000);
	driver.findElement(By.xpath(loc.getProperty("login_button"))).click();
	Thread.sleep(5000);
	}
}
