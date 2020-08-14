package barosanu.view;

import barosanu.EmailManager;

/**
 * Created by "Bartosz Chodyla" on 2020-08-15.
 */
public class ViewFactory {

    private EmailManager emailManager;

    public ViewFactory(EmailManager emailManager) {
        this.emailManager = emailManager;
    }

    public void showLoginWindow() {
        System.out.println("Show login window called");
    }
}
