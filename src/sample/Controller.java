package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    //only needs to check if clicked to move onto game
    public void buttonClicked(MouseEvent m) throws IOException {
        System.out.println("clicked");
        Parent two = FXMLLoader.load(getClass().getResource("/Files/Game.fxml"));
        Scene sceneTwo = new Scene(two);
        Stage window = (Stage)((Node)m.getSource()).getScene().getWindow();
        window.setScene(sceneTwo);
        window.centerOnScreen();
        window.show();
    }
}
