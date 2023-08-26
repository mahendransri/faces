package org.face;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.firebox.driver",
				"C:\\Users\\ADMIN\\eclipse-workspace\\Selenium4pm\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		System.out.println(title);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl); 
		WebElement textuser = driver.findElement(By.id("email"));
		textuser.sendKeys("mahendransri999@gmail.com");
		WebElement textpwd = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		textpwd.sendKeys("Dran@1997");
		WebElement loginbtn = driver.findElement(By.xpath("//button[contains(@name,'login')]"));
		loginbtn.click();
		Thread.sleep(4000);
		WebElement logbtn = driver.findElement(By.xpath("//div[@class='x78zum5 x1n2onr6']"));
         JavascriptExecutor js = (JavascriptExecutor)driver;
         js.executeScript("arguments[0].click", logbtn);
		Thread.sleep(5000);
		WebElement exit = driver.findElement(By.xpath("//span[text()='Meld af']"));
		exit.click();
		Thread.sleep(2000);
		
		

	}
}