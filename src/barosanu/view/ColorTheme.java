package barosanu.view;

/**
 * Created by "Bartosz Chodyla" on 2020-08-16.
 */
public enum ColorTheme {
    LIGHT,
    DEFAULT,
    DARK;

    public static String getCssPatch(ColorTheme colorTheme) {
        switch(colorTheme) {
            case LIGHT:
                return "css/themeLight.css";
            case DEFAULT:
                return "css/themeDefault.css";
            case DARK:
                return "css/themeDark.css";
            default:
                throw null;
        }
    }

}
