import com.talentlm.UI.helpers.Helper;
import org.openqa.selenium.WebElement;

public class Test {
    public static void main(String[] args) {

        WebElement element= null;
        Helper helper = new Helper();
        helper.waitElementToBeClickable(element);

    }
}
