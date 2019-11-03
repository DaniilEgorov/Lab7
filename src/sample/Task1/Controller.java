package sample.Task1;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    Label label;
    @FXML
    TextField a,b,c;
    @FXML
    Button button ;
    @FXML
    void click(){
        double a = Double.parseDouble(this.a.getText());
        double b = Double.parseDouble(this.b.getText());
        double c = Double.parseDouble(this.c.getText());
        if(a==0){label.setText("Решается не квадратное, а линейное уравнение");}
        else {
            double x1,x2;
            double d = b*b - 4*a*c;
            String string;
            if(d>0){
                x1 = (-b+Math.sqrt(d))/(2*a);
                x2 = (-b-Math.sqrt(d))/(2*a);
                string = String.format("\nКорни: х1 = %.2f и x2 = %.2f\nПри D = %.2f",x1,x2,d);
            }
            else if(d==0){
                x1 = -b/(2*a);
                string = String.format("\nКорень: х = %.2f\nПри D = %.2f",x1,d);
            }
            else {
                d = -d;
                b =  -b/(2*a);
                string =String.format("\nКорни: х1 = %.2f + i%.2f и x2 = %.2f - i%.2f\nПри D = -%.2f",b,Math.sqrt(d)/(2*a),b,Math.sqrt(d)/(2*a),d);
            }
            label.setText(string);
        }
    }
}
