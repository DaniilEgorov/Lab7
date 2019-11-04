package sample.Task3;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class Controller {
    @FXML
    TextArea area;
    @FXML
    ComboBox<String> who ;
    ObservableList<String> list_1 = FXCollections.observableArrayList(
            "Кузнечик","Вася","Крокодил","Орел","Трактор","Боинг 747","Слоник");
    @FXML
    ComboBox<String> go ;
    ObservableList<String> list_2 = FXCollections.observableArrayList(
            " ушел"," полетел"," побежал"," залез"," уполз"," упрыгал"," умчался");
    @FXML
    ComboBox<String> where ;
    ObservableList<String> list_3 = FXCollections.observableArrayList(
            " в кусты"," на дискотеку"," домой"," за пивом"," на Чукотку"," по грибы"," на охоту");
    @FXML
    void initialize(){
        who.setItems(list_1);
        go.setItems(list_2);
        where.setItems(list_3);
        who.setValue("Кузнечик");
        go.setValue(" ушел");
        where.setValue(" в кусты");
    }
    @FXML
    void addPhrase(){
        area.appendText(who.getValue()+go.getValue()+where.getValue()+"\n");
    }
    @FXML
    void close(){
        Platform.exit();
    }
}
