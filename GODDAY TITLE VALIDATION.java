package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.JavascriptExecutor;
//Selenium Imports
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
///


public class TestCases {
    ChromeDriver driver;
    public TestCases()
    {
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    
    public  void testCase01()throws InterruptedException{
        System.out.println("Start Test case: testCase01");
        

        // Launch Chrome :
        // Load URL  https://www.godaddy.com/en-in
        driver.get("https://www.godaddy.com/en-in");
        // Wait for 30 seconds  
        Thread.sleep(2000);
        // Get and Validate the page title 
        System.out.println("The PageTitle  is Present : "+ driver.getTitle().equalsIgnoreCase("Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN"));
        // Printing the page title
        System.out.println("The Page Title is : "+ driver.getTitle());
    }


}
