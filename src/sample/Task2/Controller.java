package sample.Task2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class Controller {
    @FXML
    Label label;
    @FXML
    TextField x, y;
    @FXML
    Button button;

    @FXML
    void check() {
        double x, y;
        x = Double.parseDouble(this.x.getText());
        y = Double.parseDouble(this.y.getText());
        if ((x < 0 && y >= 0 && (2 * x + 6) >= y) || (x >= 0 && x <= 3 && (x * x + y * y) <= 36)) {
            label.setText("Точка (" + x + "; " + y + ") лежит в этой области");
            label.setTextFill(Color.BLUE);
        } else {
            label.setText("Точка (" + x + "; " + y + ") не попала в эту область");
            label.setTextFill(Color.RED);
        }
    }
}
