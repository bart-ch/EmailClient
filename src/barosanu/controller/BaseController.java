package barosanu.controller;

import barosanu.EmailManager;
import barosanu.view.ViewFactory;

/**
 * Created by "Bartosz Chodyla" on 2020-08-15.
 */
public abstract class BaseController {

    private EmailManager emailManager;
    private ViewFactory viewFactory;
    private String fxmlName;

    public BaseController(EmailManager emailManager, ViewFactory viewFactory, String fxmlName) {
        this.emailManager = emailManager;
        this.viewFactory = viewFactory;
        this.fxmlName = fxmlName;
    }
}
