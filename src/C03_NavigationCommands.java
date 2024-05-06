import org.checkerframework.common.reflection.qual.Invoke;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_NavigationCommands {
    /*
    Invoke Chrome Browser
    Navigate to URL:https://clarusway.com/
    Navigate to URL: http://google.com/
    Come back to the Clarusway using the back command.
    Again go back to the Google website using forward command
    Refresh the Browser using refresh command.
    Close the Browser.
 */
    public static void main(String[] args) throws InterruptedException {
//        Invoke Chrome Browser
        WebDriver driver = new ChromeDriver();

//        Navigate to URL:https://clarusway.com/
        driver.get("https://clarusway.com/");

//        Navigate to URL: http://google.com/
        driver.navigate().to("http://google.com/");  // get() methodu ile aynidir.
        Thread.sleep(3000);

//        Come back to the Clarusway using the back command
        driver.navigate().back(); // back() methodu onceki sayfaya doner.
        Thread.sleep(3000);

//        Again go back to the Google website using forward command
        driver.navigate().forward(); // Bu yontem ile mevcut tarayicidaki ileri dugmesi tiklanir.
        Thread.sleep(3000);

//        Refresh the Browser using refresh command
        driver.navigate().refresh();
        Thread.sleep(3000);

//        Close the Browser
        driver.quit();
    }
}
