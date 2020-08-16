package barosanu.view;

import javafx.scene.text.Font;

/**
 * Created by "Bartosz Chodyla" on 2020-08-16.
 */
public enum FontSize {
    SMALL,
    MEDIUM,
    BIG;

    public static String getCssPatch(FontSize fontSize) {
        switch(fontSize) {
            case SMALL:
                return "css/fontSmall.css";
            case MEDIUM:
                return "css/fontMedium.css";
            case BIG:
                return "css/fontBig.css";
            default:
                throw null;
        }
    }
}
