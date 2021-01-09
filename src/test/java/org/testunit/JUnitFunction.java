package org.testunit;

import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JUnitFunction {

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
		driver.findElement(By.id("email")).sendKeys("dinesh");
		driver.findElement(By.id("pass")).sendKeys("dinesh@123");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
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
