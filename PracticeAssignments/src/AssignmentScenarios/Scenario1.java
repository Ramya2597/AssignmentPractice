package AssignmentScenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1 {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Ramya gajjala\\Downloads\\Java Downloads\\browsers\\chromedriver.exe" );
	
		 WebDriver driver=ImportingBrowsers.drivers("firefox");
		driver.get("https://portal.accenture.com");
		driver.manage().window().maximize();
		String gettitle= driver.getTitle();
		System.out.println(gettitle);
		String cururl=  driver.getCurrentUrl();
		System.out.println(cururl);
		driver.close();
		driver.quit();

	
	}

	

}
