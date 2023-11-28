package comselenium.demo;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class WebBrowser {
	@Test
	public void f() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.leafground.com/");
		driver.manage().window().maximize();
		List<WebElement> elements = driver.findElements(By.className("ui-column-title"));
		List<String> strName = new ArrayList<String>();
		for (WebElement var : elements) {
			strName.add(var.getText());
		}
		System.out.println("The Names are :" + strName);

	}
}
