package authentication_SwagLAb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LogIn_SwagLab {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Desktop\\Ehab(QA)\\MyChromeNewWebDriver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		
		String user_Name = "standard_user";
		String passWord = "secret_sauce";
		String num = "6";
		
		Thread.sleep(2000);
		driver .findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys(user_Name);
		Thread.sleep(3000);
		driver .findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(passWord);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
		List<WebElement> MyClick = driver.findElements(By.className("btn"));
		for(int i = 0 ;i<MyClick.size();i++)
		{
			MyClick.get(i).click();
		}
		String numexp = driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]")).getText();
		Thread.sleep(3000);
		
		Assert.assertEquals(num, numexp);
		
		
  
	}

}
