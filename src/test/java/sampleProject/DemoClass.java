package sampleProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoClass {
@Test
public void sampleTest()
{
	WebDriver driver = new ChromeDriver();
	driver.get("http://localhost:8888/");
driver.findElement(By.xpath("")).sendKeys("admin");
driver.findElement(By.xpath("")).sendKeys("admin");
driver.findElement(By.xpath("")).sendKeys("admin");
}
}
