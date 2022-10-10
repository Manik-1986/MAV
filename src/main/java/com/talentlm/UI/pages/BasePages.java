package com.talentlm.UI.pages;

import com.talentlm.UI.driverFactory.Driver;
import com.talentlm.UI.helpers.Helper;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePages {

    public BasePages(){

        PageFactory.initElements(Driver.getDriver(), this);// метод инициалзации элементов
    }
    Helper helper = new Helper();
}
