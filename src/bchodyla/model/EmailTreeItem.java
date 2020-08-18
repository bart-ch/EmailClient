package bchodyla.model;

import javafx.scene.control.TreeItem;

/**
 * Created by "Bartosz Chodyla" on 2020-08-18.
 */
public class EmailTreeItem<String> extends TreeItem<String> {

    private String name;

    public EmailTreeItem(String name) {
        super(name);
        this.name = name;
    }
}
