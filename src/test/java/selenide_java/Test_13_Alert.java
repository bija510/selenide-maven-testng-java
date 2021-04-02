package selenide_java;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;

public class Test_13_Alert extends Base{

    @Test
    public void test_alert() throws InterruptedException {
        open("https://www.rahulshettyacademy.com/AutomationPractice/");
        $(By.xpath("//input[@id='alertbtn']")).click();
        Thread.sleep(2000);
        confirm("Hello , share this practice page and share your knowledge");
        Thread.sleep(2000);

        $(By.xpath("//input[@id='alertbtn']")).click();
        Thread.sleep(2000);
        dismiss("Hello , share this practice page and share your knowledge");
        Thread.sleep(2000);
    }
}
