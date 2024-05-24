import com.google.common.base.Verify;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C08_PageSource {

/*
    Go to Clarusway homaepage
    Verify title contains 'Bootcamp'
    Verify URL contains 'clarusway'
    Verify PageSource contains 'SDET'
*/
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

//        Go to Clarusway homaepage
        driver.get("https://clarusway.com");

//        Verify title contains 'Bootcamp'
        if (driver.getTitle().contains("Bootcamp")){
            System.out.println("Title contains Bootcamp");
        }else {
            System.out.println("Title does not contains Bootcamp");
        }
//        Verify URL contains 'clarusway'
        if (driver.getCurrentUrl().contains("clarusway")){
            System.out.println("URL contains 'clarusway'");
        }else {
            System.out.println("URL does not contain 'clarusway'");
        }

//        Verify PageSource contains 'SDET'
        String pageSource = driver.getPageSource();
        //System.out.println("pageSource = " + pageSource);

        if (pageSource.contains("SDET")){
            System.out.println("PageSource contains 'SDET'");
        }else {
            System.out.println("PageSource does not contain 'SDET'");
        }

        Thread.sleep(3000);
        driver.quit();

    }
}
