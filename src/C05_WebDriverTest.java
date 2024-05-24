import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_WebDriverTest {

   /*
     Maximize the window
     Open google home page https://www.google.com/
     Wait for 3 seconds
     Go to the https://www.linkedin.com/
     Get the title and URL of the page
     Check if the title contains the word "LinkedIn" print console "Title contains LinkedIn" or "Title does not contain LinkedIn"
     Check if the URL contains the word "LinkedIn" print console "URL contains LinkedIn" or "URL does not contain LinkedIn"
     Then go to https://www.instagram.com/
     Get the title and check if it contains the word "Instagram" and print "Title contains Instagram" or "Title does not contain Instagram"
     Navigate Back to the previous webpage
     Refresh the page
     Navigate to forward
     Wait for 3 seconds
     Close the browser
*/

    public static void main(String[] args) throws InterruptedException {
//        Maximize the window
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//        Open google home page https://www.google.com/
        driver.get("https://www.google.com/");

//        Wait for 3 seconds
        Thread.sleep(3000);

//        Go to the https://www.linkedin.com/
        driver.get("https://www.linkedin.com/");

//        Get the title and URL of the page
        String linkedInTitle = driver.getTitle();
        System.out.println("linkedInTitle = " + linkedInTitle);
//        Check if the title contains the word "LinkedIn" print console "Title contains LinkedIn" or "Title does not contain LinkedIn"
        if (linkedInTitle.contains("LinkedIn")) {
            System.out.println("Title contains LinkedIn");
        } else {
            System.out.println("Title does not contain LinkedIn");
        }

//        Check if the URL contains the word "linkedin" print console "URL contains linkedin" or "URL does not contain linkedin"
        String linkedInUrl = driver.getCurrentUrl();
        System.out.println("linkedInUrl = " + linkedInUrl);

        if (linkedInUrl.contains("linkedin")) {
            System.out.println("URL contains linkedin");
        } else {
            System.out.println("URL does not contain linkedin");
        }
//        Then go to https://www.instagram.com/
        driver.get("https://www.instagram.com/");
//        Get the title and check if it contains the word "Instagram" and print "Title contains Instagram" or "Title does not contain Instagram"
        String instagramTitle = driver.getTitle();

        if (instagramTitle.contains("Instagram")) {
            System.out.println("Title contains Instagram");
        } else {
            System.out.println("Title does not contain Instagram");
        }
//        Navigate Back to the previous webpage
        driver.navigate().back();

//        Refresh the page
        driver.navigate().refresh();

//        Navigate to forward
        driver.navigate().forward();

//        Wait for 3 seconds
        Thread.sleep(3000);

//        Close the browser
        driver.quit();


    }

}