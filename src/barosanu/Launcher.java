package barosanu;

import barosanu.view.ViewFactory;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Created by "Bartosz Chodyla" on 2020-08-14.
 */
public class Launcher extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {

        ViewFactory viewFactory = new ViewFactory(new EmailManager());
        viewFactory.showOptionsWindow();
        viewFactory.updateStyle();

    }
}
