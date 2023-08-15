
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.CollectionCondition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenideHover extends SelenideTest{

    @Test
    void selenideHoverTest() {
        $(".header-menu-wrapper").$(byText("Solutions")).hover();
        $(".header-menu-wrapper").$(byText("Enterprise")).click();
        $$("h1.h1-mktg").shouldHave(texts("Build like the best", "Build like the best"));
    }
}
