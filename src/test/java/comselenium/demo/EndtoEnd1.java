package comselenium.demo;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EndtoEnd1 {
	@Test
	public void method() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	driver.findElement(By.xpath("//input[@id='login-button']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//div[@class='inventory_item_name '])[6]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
	driver.findElement(By.xpath("//button[@id='checkout']")).click();
	
	driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("chithra");
	driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("lekha");
	driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("517507");
	driver.findElement(By.xpath("//*[@id='continue']")).click();
	driver.findElement(By.xpath("//*[@id='finish']")).click();
	driver.findElement(By.xpath("//button[@id='back-to-products']")).click();
	
	
	}
}
