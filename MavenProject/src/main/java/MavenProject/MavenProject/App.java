package MavenProject.MavenProject;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
	public static WebDriver driver;
	public static String baseUrl = "https://www.google.com/";
	public static String driverPath = "C:\\work\\EclipseProjects\\MavenProject\\chromedriver.exe";
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver", driverPath);
    	try {
			driver = new ChromeDriver();
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  
	    	driver.manage().window().maximize();  
	    	driver.get(baseUrl);
	    	Thread.sleep(10000);
	    	System.out.println("Done");
		} catch (Exception e) {
			e.printStackTrace();
		}        
    }
}
