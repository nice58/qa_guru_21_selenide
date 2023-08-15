import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.DragAndDropOptions.to;
import static com.codeborne.selenide.Selenide.*;

public class SelenideDragAndDrop {

    @Test
    void selenideDragAndDropTest(){

        open("https://the-internet.herokuapp.com/drag_and_drop");
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";

        $("#column-a").shouldHave(text("A"));
        $("#column-b").shouldHave(text("B"));
        $("#column-a").dragAndDrop(to($("#column-b")));

        //asserts
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));
    }
}
