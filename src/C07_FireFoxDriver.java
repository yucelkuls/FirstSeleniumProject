import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C07_FireFoxDriver {
    /*
→Create main method
→Create firefox driver
→Open google home page:https://www.clarusway.com
→Get Title on page
→Get Current URLon page
→Close/Quit the browser
   */
    public static void main(String[] args) {

//        →Create firefox driver
        WebDriver driver = new FirefoxDriver();

//        →Open google home page:https://www.clarusway.com
        driver.get("https://www.clarusway.com");

//        →Get Title on page
        String title = driver.getTitle();
        System.out.println("title = " + title);

//        →Get Current URLon page
        String url = driver.getCurrentUrl();
        System.out.println("url = " + url);

//        →Close/Quit the browser
        driver.quit();

    }
}
