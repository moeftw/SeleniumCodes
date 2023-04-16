package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverBasics {
    public static void main(String[] args) {


        System.setProperty("webdriver.gecko.driver", "D:\\WebDriver\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "D:\\WebDriver\\chromedriver.exe");

        // Top cast by WeDriver, cannot create an object of an interface.
        // "driver"  is an object reference, not an object.
        // Child class "ChromeDriver" object can be referred by parent interface "WebDriver" reference variable "driver"

        WebDriver driver = new FirefoxDriver();
      // WebDriver driver = new ChromeDriver();

        driver.get("https:\\www.google.com"); //will not work without the https/http, but "www" is not mandatory.
        String title = driver.getTitle();
        System.out.println("page title is: " + title);

        //validation
        if (title.equals("Google")) {
            System.out.println("PASS -- correct title");
        } else {
            System.out.println("FAIL -- incorrect title");
        }

        driver.close();

        // Automation testing is when you automate steps and validate them.


    }
}
