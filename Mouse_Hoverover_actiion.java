package Action_class_Functions;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hoverover_actiion {

	// scenario : WAP to launch amazon & hoverover account&list then click on signin

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement e1 = driver.findElement(By.xpath("//a[@id=\"nav-link-accountList\"]"));
		Thread.sleep(3000);
		WebElement e2 = driver.findElement(By.xpath("//div[@id=\"nav-flyout-ya-signin\"]//span"));
		Thread.sleep(3000);
		Actions a = new Actions(driver);
		Thread.sleep(3000);
		a.moveToElement((e1)).moveToElement(e2).click().perform();
	}

}
