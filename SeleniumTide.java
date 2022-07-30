package Mindtree.SeleTide;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./driverss/chromedriver.exe");
WebDriver driver=new ChromeDriver();

driver.get("https://tide.com/en-us");
driver.manage().window().maximize();

driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Tide Pods");
driver.findElement(By.xpath("//button[@type='submit']")).click();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.findElement(By.xpath("//body[@class='custom_class']")).click();
	}

}
