package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrom.chromedrive", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		
		WebElement button = driver.findElement(By.xpath("//*[@id='alertButton']"));
		button.click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		WebElement button1 = driver.findElement(By.xpath("//*[@id='promtButton']"));
		button1.click();
		
		Alert alert1 = driver.switchTo().alert();
		alert1.sendKeys("Abdul");
		alert1.accept();
		
		WebElement button2 = driver.findElement(By.xpath("//*[@id='confirmButton']"));
		button2.click();
		
		Alert alert2 = driver.switchTo().alert();
		alert2.dismiss();
		
		WebElement button3 = driver.findElement(By.xpath("//*[@id='timerAlertButton']"));
		button3.click();
		Thread.sleep(5000);
		Alert alert3 = driver.switchTo().alert();
		alert3.accept();

	}

}
