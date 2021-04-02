package selenide_java;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class Test_14_Wait extends Base{

    @Test
    public void test_explicitWait(){
        //NOTE: not working for some region
        //INSTEAD: we need to over write it's auto waiting mechanism default 4 to whatever

        open("http://demo.automationtesting.in/Loader.html");
        $("button#loader").click();
        $("button#loader").waitUntil(visible, 20000).click(); //for 10 sec explicit
    }
}
