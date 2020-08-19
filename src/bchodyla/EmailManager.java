package bchodyla;

import bchodyla.controller.services.FetchFoldersService;
import bchodyla.controller.services.FolderUpdaterService;
import bchodyla.model.EmailAccount;
import bchodyla.model.EmailTreeItem;
import javafx.scene.control.TreeItem;

import javax.mail.Folder;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by "Bartosz Chodyla" on 2020-08-15.
 */
public class EmailManager {

    private FolderUpdaterService folderUpdaterService;

    //Folder handling
    private EmailTreeItem<String> foldersRoot = new EmailTreeItem<String>("");

    public EmailTreeItem<String> getFoldersRoot() {
        return foldersRoot;
    }

    private List<Folder> folderList = new ArrayList<Folder>();

    public EmailManager() {
        folderUpdaterService = new FolderUpdaterService(folderList);
        folderUpdaterService.start();
    }

    public List<Folder> getFolderList() {
        return folderList;
    }

    public void addEmailAccount (EmailAccount emailAccount) {
        EmailTreeItem<String> treeItem = new EmailTreeItem<>(emailAccount.getAddress());
        FetchFoldersService fetchFoldersService = new FetchFoldersService(emailAccount.getStore(), treeItem, folderList);
        fetchFoldersService.start();
        foldersRoot.getChildren().add(treeItem);
    }
}
