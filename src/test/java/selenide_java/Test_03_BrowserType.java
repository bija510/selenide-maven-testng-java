package selenide_java;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import org.testng.annotations.Test;

public class Test_03_BrowserType extends Base{

    @Test
    public void test_browserType(){
        open("https://www.facebook.com");
    }
}
