package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class CrossBrowserTesting {

    static WebDriver driver;

    public static void main(String[] args) {

        System.out.println("Which browser do you want to use?");

        Scanner sc = new Scanner(System.in);
        String browser = sc.next();

        if (browser.equalsIgnoreCase("chrome")) {

            System.setProperty("webdriver.chrome.driver", "D:\\WebDriver\\chromedriver.exe");
            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("firefox")) {

            System.setProperty("webdriver.gecko.driver", "D:\\WebDriver\\geckodriver.exe");
            driver = new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("edge")) {

            System.setProperty("webdriver.edge.driver", "D:\\WebDriver\\msedgedriver.exe");
            driver = new EdgeDriver();

        } else {
            System.out.println("please enter a valid browser:" + browser);
        }

        driver.get("https:\\www.google.com"); //will not work without the https/http, but "www" is not mandatory.
        String title = driver.getTitle();
        System.out.println("page title is: " + title);

        //validation
        if (title.equals("Yahoo")) {
            System.out.println("PASS -- correct title");
        } else {
            System.out.println("FAIL -- incorrect title");
        }
    }
}