import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MicrosoftEdge_01 {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\Public\\MicrosoftEdgeDriver\\edgedriver_win64\\msedgedriver.exe" );
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
        driver.close();
	

	}

}
