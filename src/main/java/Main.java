import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main {

//    @Override
//    public void start(Stage stage) throws Exception {
//        Group root = new Group();
//        Scene scene = new Scene(root, Color.SKYBLUE);
//
//        stage.setScene(scene);
//        stage.setTitle("Title");
//        stage.show();
//
//    }
    public static void main(String[] args) throws IOException {
                    Game.play();
    }
}
