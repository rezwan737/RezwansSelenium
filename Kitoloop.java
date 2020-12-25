package seleniumtool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kitoloop {

	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window();
		driver.get("https://bett3rketo.com/products/5-better-keto-gift-card");
		Thread.sleep(1000);		
		driver.findElement(By.xpath("//button[text()='Buy it now']")).click();
		Thread.sleep(5000);	
		driver.findElement(By.id("checkout_buyer_accepts_marketing")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("checkout_reduction_code")).sendKeys("holidaythanks");
		Thread.sleep(1200);
		driver.findElement(By.cssSelector(".field__input-btn.btn")).click();
		Thread.sleep(1200);
		driver.findElement(By.id("checkout_billing_address_first_name")).sendKeys("Rick");
		Thread.sleep(1200);	
		driver.findElement(By.id("checkout_billing_address_last_name")).sendKeys("Bobby");
		Thread.sleep(1200);	
		driver.findElement(By.id("checkout_billing_address_address1")).sendKeys("635 Madison Avenue");
		Thread.sleep(1200);	
		driver.findElement(By.id("checkout_billing_address_city")).sendKeys("New York");
		Thread.sleep(1200);	
		driver.findElement(By.id("checkout_billing_address_zip")).sendKeys("10022");
		Thread.sleep(1200);	
		driver.findElement(By.id("continue_button")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("continue_button")).click();
		Thread.sleep(10000);
		driver.quit();
		
		
	}

}

//button[text()='Buy it now']