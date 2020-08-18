package bchodyla;

import bchodyla.controller.services.FetchFoldersService;
import bchodyla.model.EmailAccount;
import bchodyla.model.EmailTreeItem;
import javafx.scene.control.TreeItem;

/**
 * Created by "Bartosz Chodyla" on 2020-08-15.
 */
public class EmailManager {

    //Folder handling
    private EmailTreeItem<String> foldersRoot = new EmailTreeItem<String>("");

    public EmailTreeItem<String> getFoldersRoot() {
        return foldersRoot;
    }

    public void addEmailAccount (EmailAccount emailAccount) {
        EmailTreeItem<String> treeItem = new EmailTreeItem<>(emailAccount.getAddress());
        FetchFoldersService fetchFoldersService = new FetchFoldersService(emailAccount.getStore(), treeItem);
        fetchFoldersService.start();
        foldersRoot.getChildren().add(treeItem);
    }
}
