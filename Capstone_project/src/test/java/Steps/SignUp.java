package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUp {
	WebDriver driver;

	public SignUp(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public void SignUp(WebDriver driver) {

		driver.findElement(By.xpath("//a[contains(text(),'Login/Signup')]")).click();
		System.out.println("user has opened login page");
		driver.findElement(By.xpath("//a[contains(text(),'Not a member? Signup')]")).click();
		System.out.println("user opts to register");
		driver.findElement(By.name("email_id")).sendKeys("avinash@domain.com");
		driver.findElement(By.name("pwd")).sendKeys("avinash");
		driver.findElement(By.name("pwd2")).sendKeys("avinash");
		driver.findElement(By.name("name")).sendKeys("avinash");
		System.out.println("user enters details required");
		driver.findElement(By.xpath("//button[contains(text(),'Signup')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Already a member? Login')]")).click();
		System.out.println("user registered successfully");


	}
}
