package projectRelated;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverInit {

        private static WebDriver driver;
        private static WebDriverWait wait;

        private DriverInit(){
        }
        public static WebDriver getChromeDriver(){
            if(driver == null){
                System.setProperty("webdriver.chrome.driver", "C:\\tcristea\\Prj and Apps\\Chromedriver.exe");
                driver = new ChromeDriver();
            }
            return driver;
        }

        public static WebDriverWait getWebDriverWait(){
            if(wait == null){
                wait = new WebDriverWait(getChromeDriver(),5);
            }
            return wait;
        }
}
