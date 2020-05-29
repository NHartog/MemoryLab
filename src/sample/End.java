package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class End {
    //instance variables
    public Text finalTime;
    public Game g  = new Game();

    //constructor
    public void initialize(){
        finalTime.setText(Game.realTime);
    }

    //play again page
    public void playAgain(MouseEvent event) throws IOException {
        g.replay();
        Parent three = FXMLLoader.load(getClass().getResource("/Files/Game.fxml"));
        Scene sceneThree = new Scene(three);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(sceneThree);
        window.centerOnScreen();
        window.show();
    }
//exit
    public void bye(MouseEvent event) {
        System.exit(0);
    }
}
