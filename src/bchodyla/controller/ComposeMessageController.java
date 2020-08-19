package bchodyla.controller;

import bchodyla.EmailManager;
import bchodyla.view.ViewFactory;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.web.HTMLEditor;

/**
 * Created by "Bartosz Chodyla" on 2020-08-19.
 */
public class ComposeMessageController extends BaseController {

    @FXML
    private TextField recipientTextField;

    @FXML
    private TextField subjectTextField;

    @FXML
    private HTMLEditor htmlEditor;

    @FXML
    private Label errorLabel;

    @FXML
    void sendButtonAction() {
        System.out.println("Send button clicked");
    }

    public ComposeMessageController(EmailManager emailManager, ViewFactory viewFactory, String fxmlName) {
        super(emailManager, viewFactory, fxmlName);
    }


}
