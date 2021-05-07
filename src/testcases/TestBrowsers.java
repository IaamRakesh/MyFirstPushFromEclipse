package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
// import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBrowsers {

	public static void main(String[] args) {


		
		// System.setProperty("webdriver.gecko.driver", "C:\\Users\\SESA543238\\Desktop\\Udemy Learning\\Selenium Executables\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		
		// FirefoxDriver driver= new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SESA543238\\Desktop\\Udemy Learning\\Selenium Executables\\chromedriver_win32 (2)\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.ie.driver", "C:\\Users\\SESA543238\\Desktop\\Udemy Learning\\Selenium Executables\\IEDriverServer_x64_3.150.1 (2)\\IEDriverServer.exe");
		
		//InternetExplorerDriver driver = new InternetExplorerDriver();
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\SESA543238\\Desktop\\Udemy Learning\\Selenium Executables\\edgedriver_win64\\msedgedriver.exe");
		
		EdgeDriver driver= new EdgeDriver();
		
		
		driver.get("http://www.way2automation.com/");

	}

}
