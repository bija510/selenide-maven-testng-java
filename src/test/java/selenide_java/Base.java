package selenide_java;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Base {
    protected static Properties prop;

    @BeforeClass
    public void initialize() throws IOException {

        prop =new Properties();
        FileInputStream fis = new FileInputStream("../selenide-maven-testng-java/Configurations/Config.properties");
        prop.load(fis);
        String browser = prop.getProperty("Browser");

        if(browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromiumdriver().setup();
            System.setProperty("selenide.browser", "Chrome");
        }
        else if(browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            System.setProperty("selenide.browser", "Firefox");
        }
        else if(browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            System.setProperty("selenide.browser", "Edge");
        }
        else if(browser.equalsIgnoreCase("ie")) {
            WebDriverManager.iedriver().setup();
            System.setProperty("selenide.browser", "Ie");
        }
    }

}
