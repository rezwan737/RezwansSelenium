package seleniumtool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validitygreen {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://validitygreen.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='https://validitygreen.com/contact-us/']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("mtscontact_name")).sendKeys("Rezwan");
		Thread.sleep(2000);
		driver.findElement(By.id("mtscontact_phone")).sendKeys("121212121");
		Thread.sleep(2000);
		driver.findElement(By.id("mtscontact_email")).sendKeys("Rezwan@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("mtscontact_website")).sendKeys("www.rezwan.com");
		Thread.sleep(2000);
		driver.findElement(By.id("mtscontact_message")).sendKeys("My favourite food is Biriyani");
		Thread.sleep(2000);
		driver.findElement(By.id("mtscontact_submit")).click();
		Thread.sleep(15000);
		driver.quit();

	}

}
