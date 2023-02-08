import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class test01 {

	@Test
	void test() throws InterruptedException {
		  WebDriver driver = null;
	        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
	        driver = new ChromeDriver();
	        
			driver.get("https://nxtgenaiacademy.com/demo-site/");


			driver.findElement(By.xpath("//*[@id=\"vfb-5\"]")).sendKeys("Naphat ");
			driver.findElement(By.xpath("//*[@id=\"vfb-7\"]")).sendKeys("Saithongsuk");
			driver.findElement(By.xpath("//*[@id=\"vfb-13-address\"]")).sendKeys("190หมู่2");
			driver.findElement(By.xpath("//*[@id=\"vfb-13-address-2\"]")).sendKeys("เพชรเกษม");
			driver.findElement(By.xpath("//*[@id=\"vfb-13-city\"]")).sendKeys("อำเภอหนองหญ้าปล้อง");
			driver.findElement(By.xpath("//*[@id=\"vfb-13-state\"]")).sendKeys("ตำบลหนองหญ้าปล้อง");
			driver.findElement(By.xpath("//*[@id=\"vfb-13-zip\"]")).sendKeys("76160");
			driver.findElement(By.xpath("//*[@id=\"vfb-14\"]")).sendKeys("644259030@webmail.npru.ac.th");
			driver.findElement(By.xpath("//*[@id=\"vfb-18\"]")).sendKeys("020866");
			driver.findElement(By.xpath("//*[@id=\"vfb-19\"]")).sendKeys("0838185090");
			driver.findElement(By.xpath("//*[@id=\"vfb-20-0\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"vfb-20-1\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"vfb-20-2\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"vfb-20-3\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"vfb-20-4\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"vfb-20-5\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"vfb-23\"]")).sendKeys("Selenium WebDriver,UFT,TestNG,Core Java,Functional,Testing,Others");
			driver.findElement(By.xpath("//*[@id=\"vfb-3\"]")).sendKeys("99");
		    driver.findElement(By.xpath("//*[@id=\"vfb-4\"]")).click();
		    String result = driver.findElement(By.id("comment")).getText();
		    assertEquals("Registration Form is Successfully Submitted. The Transaction",result);

			String title = driver.getTitle();  
			System.out.println(title);

			Thread.sleep(1000);
			driver.quit();
			driver = null;
		}

	}