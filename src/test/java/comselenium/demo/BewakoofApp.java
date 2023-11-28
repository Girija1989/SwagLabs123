package comselenium.demo;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BewakoofApp {
	@Test
	public void bewakoof() throws InterruptedException {
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.bewakoof.com/");
		driver.manage().window().maximize();
		Actions act =new Actions(driver);
		WebElement men =driver.findElement(By.xpath("//span[text()='MEN']"));
		act.moveToElement(men).build().perform();
		WebElement women =driver.findElement(By.xpath("//span[text()='WOMEN']"));
		act.moveToElement(women).build().perform();
		WebElement mobileCovers =driver.findElement(By.xpath("//span[text()='MOBILE COVERS']"));
		act.moveToElement(mobileCovers).build().perform();
		WebElement men1 =driver.findElement(By.xpath("//span[text()='MEN']"));
		act.moveToElement(men1).build().perform();
		act.moveToElement(men1).click().build().perform();
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,5000)");
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(0,-2000)");
		WebElement men2 =driver.findElement(By.xpath("//span[text()='MEN']"));
		act.moveToElement(men2).build().perform();
		Men: driver.findElement(By.xpath("//span[text( )='Henleys']")).click();
		driver.findElement(By.xpath(
				"//img[@src='https://images.bewakoof.com/t640/men-s-blue-striped-slim-fit-t-shirt-525486-1658995519-1.jpg']"))
				.click();
		// Moving between the sizes:
		Thread.sleep(500);
		WebElement small = driver.findElement(By.xpath("//span[text( )='S']"));
		WebElement medium = driver.findElement(By.xpath("//span[text( )='M']"));
		WebElement large = driver.findElement(By.xpath("//span[text( )='L']"));
		WebElement xl = driver.findElement(By.xpath("//span[text( )='XL']"));
		act.moveToElement(small).moveToElement(medium).moveToElement(large).moveToElement(xl).click().build().perform();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text( )='ADD TO BAG']")).click();
		driver.findElement(By.xpath("//a[@class='cartIcon']")).click();
		Thread.sleep(500);
		WebElement size = driver.findElement(By.xpath("//span[text( )='Size : ']"));
		size.click();
		try {
			List<WebElement> size1 = driver.findElements(By.xpath("//div[@class='SizeModal']/child::button"));
			System.out.println("No.of sizes:" + size1.size());
			String value = "S";
			for (WebElement sizes : size1) {
				if (sizes.getText().equals(value)) {
					sizes.click();
				}
			}
		} catch (StaleElementReferenceException e) {
			List<WebElement> size1 = driver.findElements(By.xpath("//div[@class='SizeModal']/child::button"));
			String value = "S";
			for (WebElement sizes : size1) {
				if (sizes.getText().equals(value)) {
					sizes.click();
				}
			}
		}
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[@class='cartModOptions']")).click();
		List<WebElement> qty = driver.findElements(By.xpath("//div[@class='SizeModal']/child::button"));
		System.out.println("No.of Quqntities" + qty.size());
		String str = "10";
		for (WebElement quantity : qty) {
			if (quantity.getText().equals(str)) {
				quantity.click();
			}
		}
		System.out.println("Men Product is Added Successfully");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().back(); // Selecting the product from Women:
		WebElement women1 = driver.findElement(By.xpath("//span[text( )='WOMEN']"));
		act.moveToElement(women1).build().perform();
		driver.findElement(By.xpath("//span[text()='Kurtis']")).click();
		driver.findElement(By.xpath(
				"//img[@src='https://images.bewakoof.com/t640/women-s-sleevelesss-ethnic-kurti-403805-1656182466-1.jpg']"))
				.click();
		driver.findElement(By
				.xpath("//div[@style='height: calc(100%); background-color: rgb(249, 54, 126); border-radius: 8px;']"))
				.click();
		driver.findElement(By.xpath("//span[text()='S']")).click();
		jse.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//span[text( )='ADD TO BAG']")).click();
		Thread.sleep(300);
		driver.findElement(By.xpath("//span[@class='cartCount']")).click();
		driver.findElement(By.xpath("//span[text( )='Size : ']")).click();
		try {
			List<WebElement> sizeW = driver.findElements(By.xpath("//div[@class='SizeModal']/child::button"));
			System.out.println("No.of sizes:" + sizeW.size());
			String value = "M";
			for (WebElement sizes : sizeW) {
				if (sizes.getText().equals(value)) {
					sizes.click();
				}
			}
		} catch (StaleElementReferenceException e) {
			List<WebElement> sizeW = driver.findElements(By.xpath("//div[@class='SizeModal']/child::button"));
			String value = "M";
			for (WebElement sizes : sizeW) {
				if (sizes.getText().equals(value)) {
					sizes.click();
				}
			}
		}
		driver.findElement(By.xpath("//div[@class='cartModOptions']")).click();
		try {
			List<WebElement> qtyW = driver.findElements(By.xpath("//div[@class='SizeModal']/child::button"));
			System.out.println("No.of Quantities" + qtyW.size());
			String val = "3";
			for (WebElement quantity : qtyW) {
				if (quantity.getText().equals(val)) {
					quantity.click();
				}
			}
		} catch (StaleElementReferenceException e) {
			List<WebElement> qtyW = driver.findElements(By.xpath("//div[@class='SizeModal']/child::button"));
			String val = "3";
			for (WebElement quantity : qtyW) {
				if (quantity.getText().equals(val)) {
					quantity.click();
				}
			}
		}
		System.out.println("Women Product is Added Successfully");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().back(); // Selecting the product from MobileCovers:
		WebElement covers = driver.findElement(By.xpath("//span[text( )='MOBILE COVERS']"));
		act.moveToElement(covers).build().perform();
		driver.findElement(By.xpath("//a[text( )='iPhone 15 Pro max']")).click();
		driver.findElement(By.xpath(
				"//img[@src='https://images.bewakoof.com/t640/floating-floral-print-premium-glass-case-for-iphone-15-pro-max-627299-1699628899-1.jpg']"))
				.click();
		WebElement mobile = driver.findElement(By.xpath("//select[@class='form-control']"));
		System.out.println("No.of Mobile Covers:" + mobile.getSize());
		Select sec = new Select(mobile);
		sec.selectByValue("2");
		driver.findElement(By.xpath("//span[text( )='ADD TO BAG']")).click();
		driver.findElement(By.xpath("//span[@class='cartCount']")).click();
		jse.executeScript("window.scrollBy(0,1000)");
		driver.findElement(By.xpath("(//span[text( )='Qty : '])[2]")).click();
		try {
			List<WebElement> cov = driver.findElements(By.xpath("//div[@class='SizeModal']/child::button"));
			System.out.println("No.of Quantities" + cov.size());
			String number = "5";
			for (WebElement quan : cov) {
				if (quan.getText().equals(number)) {
					quan.click();
				}
			}
		} catch (StaleElementReferenceException e) {
			List<WebElement> cov = driver.findElements(By.xpath("//div[@class='SizeModal']/child::button"));
			String number = "5";
			for (WebElement quan : cov) {
				if (quan.getText().equals(number)) {
					quan.click();
				}
			}
		}
		System.out.println("Mobile Covers are Added Successfully ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().back();
		// Adding More mobile covers
		WebElement covers1 = driver.findElement(By.xpath("//span[text( )='MOBILE COVERS']"));
		act.moveToElement(covers1).build().perform();
		driver.findElement(By.xpath("//a[text( )='Samsung Galaxy S21 fe 5G']")).click();
		// selecting covers for samsung product
		driver.findElement(By.xpath(
				"//img[@src='https://images.bewakoof.com/t640/peace-out-astro-premium-glass-case-for-samsung-galaxy-s21-fe-5g-shock-proof-scratch-resistant-600135-1687444154-1.jpg']"))
				.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement samsung_cover_qty = driver.findElement(By.xpath("//select[@class='form-control']"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("No.of Mobile Covers:" + samsung_cover_qty.getSize());
		Select samsung_quty = new Select(samsung_cover_qty);
		samsung_quty.selectByValue("9");
		driver.findElement(By.xpath("//span[text( )='ADD TO BAG']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[@class='cartCount']")).click();
		System.out.println("samsung products added successfully");
		driver.navigate().to("https://www.bewakoof.com/");
		WebElement Diff_mobile_covors = driver.findElement(By.xpath("//span[text( )='MOBILE COVERS']"));
		act.moveToElement(Diff_mobile_covors).build().perform();
		driver.findElement(By.xpath("//a[text()='Realme 10 Pro+ 5G']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath(
				"//img[@src='https://images.bewakoof.com/t640/modern-ultra-chevron-premium-glass-case-for-realme-10-pro-5g-shock-proof-scratch-resistant-599814-1687441534-1.jpg']")).click();
				
		// Selecting covers for ream me products
		WebElement real_covers = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select real_cover_quty = new Select(real_covers);
		real_cover_quty.selectByValue("9");
		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//img[@class='bag-icon']")).click();
		System.out.println("Realme prodts added successfully");
		Thread.sleep(200);
		driver.findElement(By.xpath("//div[@id='testRemoveCart']")).click();
		System.out.println("Samsung is removed");
		driver.findElement(By.xpath("//div[@id='testSavefrLater']")).click();
		System.out.println("Real me is added to wishlist");
//Validating the text box with invalid data
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://www.bewakoof.com/");
		driver.findElement(By.xpath("//a[@id='loginLink']")).click();
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='mobile_number']")));
		driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("uihhg");
		driver.findElement(By.xpath("//button[@id='web_continue_submit']")).click();
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='Please Enter Valid Mobile Number']")));
		String actualErrorMessege1 = driver.findElement(By.xpath("//p[text()='Please Enter Valid Mobile Number']")).getText();
		System.out.println(actualErrorMessege1);
		driver.findElement(By.xpath("//button[@id='web_email_login']")).click();
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email_input']")));
		driver.findElement(By.xpath("//input[@id='email_input']")).sendKeys("hudhs");
		driver.findElement(By.xpath("//button[@id='mob_login_password_submit']")).click();
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='error']")));
		String actualErrorMessege2 = driver.findElement(By.xpath("//p[@class='error']")).getText();
		System.out.println(actualErrorMessege2);
		driver.findElement(By.xpath("//input[@id='email_input']")).clear();
		driver.findElement(By.xpath("//input[@id='email_input']")).sendKeys("hudhs@gmail.com");
		driver.findElement(By.xpath("//input[@id='mob_password']")).sendKeys("jkhkk8");
		driver.findElement(By.xpath("//button[@id='mob_login_password_submit']")).click();
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='mob_toast_error']")));
		String actualErrorMessege3 = driver.findElement(By.xpath("//span[@id='mob_toast_error']")).getText();
		System.out.println(actualErrorMessege3);
		driver.quit();
	}
}


	

