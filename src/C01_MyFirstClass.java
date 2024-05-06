import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class C01_MyFirstClass {
    public static void main(String[] args) {
        // Set property
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe"); // Bu islem Selenium 4.6 sonrasi gerekmez.
        //Driver objesi olustur
        WebDriver driver = new ChromeDriver();

        //Driver methodlarini kullan.
        driver.get("https://google.com");  // get() methodu ile yeni bir sayfa yukleriz

        // Close browser
        driver.close();  // close() methodu ile son acilan pencere kapatilir.
        driver.quit();  // quit() methodu ile oturumda acilan tum pencereler kapatilir.

    }
}
