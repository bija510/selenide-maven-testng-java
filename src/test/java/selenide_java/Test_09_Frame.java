package selenide_java;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;

public class Test_09_Frame extends Base{

    @Test
    public void test_frames() throws InterruptedException {
        open("https://letskodeit.teachable.com/pages/practice");
        executeJavaScript("window.scrollTo(0, 1200)" );
        switchTo().frame("courses-iframe");
        $(By.id("search-courses")).sendKeys("python");
        Thread.sleep(2000);
        switchTo().defaultContent();
        executeJavaScript("window.scrollTo(0, -1200)");
        $(By.id("name")).sendKeys("Robert");
        Thread.sleep(2000);
    }
}
