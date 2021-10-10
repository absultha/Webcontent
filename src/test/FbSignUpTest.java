package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbSignUpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver");
		WebDriver driver=new ChromeDriver();
		
        driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(4000,TimeUnit.MILLISECONDS);
		WebElement CreateAccount = driver.findElement(By.xpath("//a[text()='Create New Account']"));
	     CreateAccount.click();
	     WebElement FirstName = driver.findElement(By.cssSelector("input[name=firstname]"));
	        FirstName.sendKeys("John");
	        
	     
	     WebElement Day = driver.findElement(By.xpath("//select[@id='day']"));
	     Select ddDay=new Select(Day);
	     ddDay.selectByVisibleText("14");
	     
	    /* WebElement Month = driver.findElement(By.xpath("//select[@id='month']"));
	     Select m=new Select(Month);
	     m.selectByIndex(5);

	     WebElement Year = driver.findElement(By.xpath("//select[@id='year']"));
	     Select y=new Select(Year);
	     y.selectByValue("2019");*/
	     
	     WebElement Female = driver.findElement(By.cssSelector("input[@type='radio' and @value='1']"));
	        Female.click();
	        if(Female.isSelected()) {
	          System.out.println("RAdio button selected");
	        }else {
	        	System.out.println("RAdio button is not selected");
	        }
	        List<WebElement>Months=driver.findElements(By.xpath("//select[@id='month']/option"));
	        for(int i=1;i<=Months.size();i++) {
	            
	            WebElement data = driver.findElement(By.xpath("//select[@id='month']/option[" + i + "]"));
	            System.out.println(data.getText());
	            //System.out.println(Months.get(i).getText());
	        }
	
	}

}
