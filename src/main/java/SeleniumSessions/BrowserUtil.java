package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {
    public WebDriver driver;

    /**
     * this method is used to launch browser on the basis of a given browser name
     *
     * @param browser;
     * @return this will return the driver
     */
    public WebDriver launchBrowser(String browser) {
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

        return driver;
    }

    /**
     * this method is used to enter the url
     *
     * @param url
     */
    public void enterUrl(String url) {
        if (url == null) {
            System.out.println("The url you provided is null...");
            return;
        }
        if (url.indexOf("http") == -1) {
            System.out.println("http is missing in the url");
            return;
        }
        driver.get(url);
    }

    public String getPageTitle() {
        return driver.getTitle();

    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    public void closeBrowser() {
        driver.close();
    }

}