package selenide_java;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;

public class Test_05_CheckBx_RadioBtn extends Base{

    @Test
    public void test_CheckBx_RadioBtn() {
        open("https://learn.letskodeit.com/p/practice");
        $(By.cssSelector("#hondacheck")).click(); //checkBox
        $(By.cssSelector("#benzradio")).selectRadio("benz");
    }

    @Test
    public void test_CheckBx_all_checkBx_with_commonLocator() throws InterruptedException {
        open("https://learn.letskodeit.com/p/practice");
        //Example:-1
       // $$("input[type='checkbox']").stream().forEach(el->{el.click();}); //checkBox

        //Example:-2
        //$$("input[type='checkbox']").forEach(el->{el.click();}); //checkBox

        //Example:-3
        $$("input[type='checkbox']").forEach(SelenideElement::click); //checkBox
        Thread.sleep(2000);

    }
}
