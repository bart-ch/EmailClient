package bchodyla.controller;

import bchodyla.EmailManager;
import bchodyla.view.ViewFactory;

/**
 * Created by "Bartosz Chodyla" on 2020-08-15.
 */
public abstract class BaseController {

    protected EmailManager emailManager;
    protected ViewFactory viewFactory;
    protected String fxmlName;

    public BaseController(EmailManager emailManager, ViewFactory viewFactory, String fxmlName) {
        this.emailManager = emailManager;
        this.viewFactory = viewFactory;
        this.fxmlName = fxmlName;
    }

    public String getFxmlName() {
        return fxmlName;
    }
}
