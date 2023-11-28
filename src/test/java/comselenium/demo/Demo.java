package comselenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void webDriverExample() {
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.leafground.com/");
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("girija.keerthipati@gmail.com");
//		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("Hello good morning");
//		driver.findElement(By.xpath("//button[@id='j_idt130']")).click();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']")).sendKeys("Admin");
		
	}

}
