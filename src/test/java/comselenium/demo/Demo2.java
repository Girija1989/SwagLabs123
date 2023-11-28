package comselenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo2 {
	@Test
	public void webDriverEx() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//li[@id='menuform:j_idt40']")).click();
		driver.findElement(By.xpath("//li[@id='menuform:m_button']")).click();
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt90']")).click();
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt92']")).click();
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt94']")).click();
//		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt96']']")).getCssValue("font");
//		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']']")).click();

	}

}
