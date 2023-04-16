package SeleniumSessions;

public class AmazonTest {
    public static void main(String[] args) {
        BrowserUtil br = new BrowserUtil();

        br.launchBrowser("ChRoMe");
        br.enterUrl("http://www.amazon.com");
        String title = br.getPageTitle();
        System.out.println(title);

        if (title.contains("Amazon")) {
            System.out.println("Title is correct");
        }
        String url = br.getCurrentUrl();
        System.out.println(url);

        br.closeBrowser();
    }
}