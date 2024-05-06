import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_WindowCommands {
  /*

    Invoke Chrome Browser

    Open URL: https://www.google.com/

    Print the position and size of the page.

    Minimize the page.

    Wait 5 seconds in the icon state and maximize the page.

    Print the position and dimensions of the page in maximized state.

    Make the page fullscreen.

    Close the Browser.
 */

    public static void main(String[] args) throws InterruptedException {
//        Invoke Chrome Browser
        WebDriver driver = new ChromeDriver();

//        Open URL: https://www.google.com/
        driver.get("https://www.google.com/");

//        Print the position and size of the page.
        Point position = driver.manage().window().getPosition();
        System.out.println("position = " + position);
        Dimension size = driver.manage().window().getSize();
        System.out.println("size = " + size);

//        Minimize the page.
        driver.manage().window().minimize();

//        Wait 5 seconds in the icon state and maximize the page.
        Thread.sleep(5000);
        driver.manage().window().maximize();

//        Print the position and dimensions of the page in maximized state.
        Point position2 = driver.manage().window().getPosition();
        System.out.println("position2 = " + position2);
        Dimension size2 = driver.manage().window().getSize();
        System.out.println("size2 = " + size2);

//        Make the page fullscreen.
        Thread.sleep(2000);
        driver.manage().window().fullscreen();

//        Close the Browser
        Thread.sleep(2000);
        driver.quit();

    }
}