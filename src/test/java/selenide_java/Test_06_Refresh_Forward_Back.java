package selenide_java;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;

public class Test_06_Refresh_Forward_Back extends Base{

    @Test
    public void test_refreshForwardBac() throws InterruptedException {
        open("http://demo.automationtesting.in/");
        $(By.xpath("//img[@id='enterimg']")).click();
        refresh();
        Thread.sleep(1000);
        back();
        Thread.sleep(1000);
        forward();
    }
}
