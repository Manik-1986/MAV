package steps;

import com.talentlm.UI.helpers.Helper;
import com.talentlm.UI.pages.AdminHomePage;
import com.talentlm.UI.pages.LoginPage;

public abstract class BaseTest {

   protected LoginPage loginPage = new LoginPage();

  protected   Helper helper = new Helper();

    protected AdminHomePage adminHomePage = new AdminHomePage();
}
