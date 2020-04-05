import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AbstractionDemo {

	WebDriver driver;
	
	public static void main(String[] args) {
		// create the object of the class
			
		AbstractionDemo abstraction = new AbstractionDemo();
		abstraction.login();
		abstraction.goToAdminTab();
		abstraction.selectUserRole();
		abstraction.clickOnSearchButton();
//		abstraction.logout();

	}

	public void login() {
		System.setProperty("webdriver.chrome.driver", "D:\\Programas\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().window().maximize();

		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("admin123");
		driver.findElement(By.cssSelector("input.button")).click();
	}
	
	public void logout() {
		
		driver.findElement(By.linkText("Welcome Admin")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}
	
	public void goToAdminTab() {
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
	}
	
	// handling dropbox
	public void selectUserRole() {
		Select dropdown = new Select(driver.findElement(By.id("searchSystemUser_userType")));
		dropdown.selectByVisibleText("ESS");
		
	}
	
	public void clickOnSearchButton() {
		driver.findElement(By.id("searchBtn")).click();
	}
}
