import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_01 {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Public\\FirefoxDriver\\geckodriver-v0.31.0-win64\\geckodriver.exe" );
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
	        driver.close();
		

	}

}
