package comselenium.demo;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class EndToEnd_Cases {
	@Test
	public void method() throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.demoblaze.com/cart.html");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[@id='signin2']")).click();
	driver.findElement(By.xpath("//input[@id='sign-username']")).sendKeys("d_lukthika");
	driver.findElement(By.xpath("//input[@id='sign-password']")).sendKeys("50330079");
	driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[2]")).click();
	Thread.sleep(3000);
	Alert alert =driver.switchTo().alert();
	alert.accept();
	driver.findElement(By.xpath("(//a[@class='nav-link'])[1]")).click();
	//driver.findElement(By.xpath("(//a[@class='list-group-item'])[3]")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("(//a[@href='prod.html?idp_=1'])[2]")).click();
	driver.findElement(By.xpath("//a[@class='btn btn-success btn-lg']")).click();
	Thread.sleep(3000);
	Alert alert1 =driver.switchTo().alert();
	alert1.accept();
	driver.findElement(By.xpath("//a[@id='cartur']")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();
	driver.findElement(By.xpath("//input[@id='name']")).sendKeys("kumar");
	driver.findElement(By.xpath("//input[@id='country']")).sendKeys("India");
	driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Tirupati");
	driver.findElement(By.xpath("//input[@id='card']")).sendKeys("5678943211234567");
	driver.findElement(By.xpath("//input[@id='month']")).sendKeys("July");
	driver.findElement(By.xpath("//input[@id='year']")).sendKeys("2025");
	driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[3]")).click();
	Thread.sleep(2000);
	Alert alert2 =driver.switchTo().alert();
	alert2.accept();
	
}
}
