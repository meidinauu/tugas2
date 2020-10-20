/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guijavatugas2;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 *
 * @author meidina
 */
public class GuiJavaTugas2 extends Application {
    
    @Override
    public void start(Stage stage) {
        Text label1 = new Text("Nama");
        Text label2 = new Text("Telepon");
        Text label3 = new Text("Alamat");
        TextField textField1 = new TextField();
        TextField textField2 = new TextField();
        TextArea alamat = new TextArea();

        Button button1 = new Button("Kirim");
        Button button2 = new Button("Hapus");

        GridPane gridPane = new GridPane();

        gridPane.setMinSize(400, 200);

        gridPane.setPadding(new Insets(50, 50, 50, 50));

        gridPane.setVgap(10);
        gridPane.setHgap(10);

        gridPane.setAlignment(Pos.CENTER);
        gridPane.add(label1, 0, 0);
        gridPane.add(textField1, 1, 0);
        gridPane.add(label2, 0, 1);
        gridPane.add(textField2, 1, 1);
        gridPane.add(label3, 0,2);
        gridPane.add(alamat,1,2);
        gridPane.add(button1, 0, 3);
        gridPane.add(button2, 1, 3);

        Scene scene = new Scene(gridPane);

        stage.setTitle("Tugas GUI - Meidina Ulin Nastiti");

        stage.setScene(scene);

        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
