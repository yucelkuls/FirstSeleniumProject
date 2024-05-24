import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_PositionSize {
    /*
     Go to the Clarusway URL : https://www.clarusway.com/
     Print the position and size of the page.
     Adjust the position and size of the page as desired.
     Test that the page is in the position and size you want.
     Close the page.
 */
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//Sayfanın maksimum dolum süresi. Bu süre içerisinde sayfa dolmazsa exception atar.
        driver.manage().window().maximize();

        // Go to the Clarusway URL : https://www.google.com/
        driver.get("https://www.google.com/");

        // Print the position and size of the page.
        Point position = driver.manage().window().getPosition();
        System.out.println("position = " + position);
        Dimension size = driver.manage().window().getSize();
        System.out.println("size = " + size);

//  Adjust the position and size of the page as desired
        Point newPoint = new Point(100, 100);
        Dimension newDimension = new Dimension(600, 300);

        driver.manage().window().setPosition(newPoint);
        driver.manage().window().setSize(newDimension);

//     Test that the page is in the position and size you want.
        Point actualPoint = driver.manage().window().getPosition();
        int x = actualPoint.getX();
        int y = actualPoint.getY();

        Dimension actualDimension = driver.manage().window().getSize();
        int width = actualDimension.getWidth();
        int height = actualDimension.getHeight();

        if (x==100 && y==100 && width==600 && height==300){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

//     Close the page
        Thread.sleep(3000);
        driver.quit();

    }
}
