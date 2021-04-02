package selenide_java;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;

public class Test_12_MouseEvent extends Base{


    @Test
    public void test_doubleClick() throws InterruptedException {
        open("http://api.jquery.com/dblclick/");
        switchTo().frame(0);
        SelenideElement aaa = $(By.xpath("/html/body/div"));
        Thread.sleep(3000);
        aaa.doubleClick();
        Thread.sleep(3000);
        aaa.doubleClick();
    }
}
