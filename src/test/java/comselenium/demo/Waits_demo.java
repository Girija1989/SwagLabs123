package comselenium.demo;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits_demo {
	@Test
	public void method() {

	//public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get("https://www.leafground.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//li[@id='menuform:j_idt40']")).click();
		driver.findElement(By.xpath("//li[@id='menuform:m_wait']")).click();
		
		//Wait for Visibility
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='j_idt87:j_idt89']")));
		driver.findElement(By.xpath("//button[@id='j_idt87:j_idt89']")).click();
		
		//Wait for Invisibility
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='j_idt87:j_idt93']")));
		driver.findElement(By.xpath("//button[@id='j_idt87:j_idt92']")).click();
		
		//Wait for Clickability
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='j_idt87:j_idt95']")));
		driver.findElement(By.xpath("//button[@id='j_idt87:j_idt95']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='j_idt87:j_idt96']")));
		driver.findElement(By.xpath("//button[@id='j_idt87:j_idt96']")).click();
		
        //Wait for Text Change
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='j_idt87:j_idt99']")));
		driver.findElement(By.xpath("//button[@id='j_idt87:j_idt99']")).click();
		driver.findElement(By.xpath("//button[@id='j_idt87:j_idt98']")).click();
		

	}

}
