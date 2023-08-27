import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDropTest {
    @Test
    public void dragAndDrop(){
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a header").shouldHave(text("A"));

//        Не работает
//        actions().dragAndDrop($(By.id("column-a")),$(By.id("column-b")));
//        actions().clickAndHold($("#column-a")).moveToElement($("#column-b")).release().build().perform();

        $("#column-a").dragAndDropTo($("#column-b"));
        $("#column-a header").shouldHave(text("B"));

    }
}
