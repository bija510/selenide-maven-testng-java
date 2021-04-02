package selenide_java;

import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.source;
import static com.codeborne.selenide.WebDriverRunner.url;

public class Test_07_GetUrl_Title_Source extends Base{

    @Test
    public void test_url_title() {
        open("https://learn.letskodeit.com/p/practice");
        System.out.println("==> " + url());
        System.out.println("==> " + title());
        System.out.println("==> " + source());
    }

}
