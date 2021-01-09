package org.testunit;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JUnitAssert {
	public static WebDriver driver;
	@BeforeClass
	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();

	}
	@AfterClass
	public static void closeBrowser() {
		driver.quit();

	}
	@Before
	public void startTime() {
		Date d = new Date();
		System.out.println(d);
	}
	@After
	public void endTime() {
		Date d=new Date();
		System.out.println(d);
	}

	@Test
	public void test1() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String url = driver.getCurrentUrl();
		Assert.assertTrue("corrct url", url.contains("facebook"));
		driver.findElement(By.id("email")).sendKeys("dinesh");
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("dinesh@123");
		txtPass.getAttribute("value");
		Assert.assertEquals("thiz value corrct or not", "dinesh@123", "dinesh@123");
		
		driver.findElement(By.name("login")).click();
		
	}

	@Test
	public void test3() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("muthu");
		driver.findElement(By.id("pass")).sendKeys("dinesh@123");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);

	}

	@Test
	public void test2() {
		System.out.println("dinesh2");


	}



}
