package com.softserve.edu;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

//DEFAULT_OMS_URL

public class OmsTest {
	private final Long ONE_SECOND_DELAY = 1000L;
	private static String defaultOmsUrl = "http://localhost:8080/OMS";
	private static WebDriver driver;
	private static String currentUrl;

	//@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeClass setUpBeforeClass()");
		WebDriverManager.chromedriver().setup();
		System.out.println("Open Browser");
		//
		// HtmlUnitDriver Without UI
		//driver = new HtmlUnitDriver(true);
		//
		// Chrome Without UI
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		driver = new ChromeDriver(options);
		//
		// Chrome
		//driver = new ChromeDriver();
		//
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//
		System.out.println("***DEFAULT_OMS_URL = " + System.getenv().get("DEFAULT_OMS_URL"));
		currentUrl = System.getenv().get("DEFAULT_OMS_URL");
		if (currentUrl == null) {
			currentUrl = defaultOmsUrl;
		}
	}

	//@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("@AfterClass tearDownAfterClass()");
		System.out.println("driver.quit()");
		driver.quit();
	}

	//@Before
	public void setUp() throws Exception {
		System.out.println("\t@Before setUp()");
		System.out.println("\tgotoUrl(" + currentUrl + ")");
		driver.get(currentUrl);
		presentationSleep();
	}

	//@After
	public void tearDown() throws Exception {
		System.out.println("\t@After tearDown()");
		System.out.println("\tdeleteAllCookies()");
		driver.manage().deleteAllCookies();
		presentationSleep();
	}

	//@Test
	public void checkLogin() {
		System.out.println("\t\tType username");
		driver.findElement(By.name("j_username")).clear();
		driver.findElement(By.name("j_username")).click();
		driver.findElement(By.name("j_username")).sendKeys("iva");
		presentationSleep();
		//
		System.out.println("\t\tType password");
		driver.findElement(By.name("j_password")).clear();
		driver.findElement(By.name("j_password")).click();
		driver.findElement(By.name("j_password")).sendKeys("qwerty");
		presentationSleep();
		//
		System.out.println("\t\tType submit");
		driver.findElement(By.name("submit")).click();
		presentationSleep();
		//
		System.out.println("\t\tget First name");
		String firstName = driver.findElement(By.xpath("//td[contains(text(),'First name')]/following-sibling::td")).getText();
		System.out.println("\t\tget Last name");
		String lastName = driver.findElement(By.xpath("//td[contains(text(),'Last name')]/following-sibling::td")).getText();
		presentationSleep();
		//
		System.out.println("\t\tAssert.assertEquals");
		Assert.assertEquals("ivanka", firstName);
		presentationSleep();
		Assert.assertEquals("horoshko", lastName);
		presentationSleep();
		//
		System.out.println("\t\tlogout");
		driver.findElement(By.cssSelector("a[href*='logout']")).click();
		presentationSleep();
	}

	protected void presentationSleep() {
		presentationSleep(1);
	}

	protected void presentationSleep(int seconds) {
		try {
			Thread.sleep(seconds * ONE_SECOND_DELAY); // For Presentation ONLY
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
