import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GoogleTests {

    @Test
    public void googleTest() {

        Configuration.startMaximized = true;
        open("https://www.google.com/");

        $("[name=q]").val("selenide").pressEnter();
        $(byText("ru.selenide.org")).shouldBe(Condition.visible);

    }

}
