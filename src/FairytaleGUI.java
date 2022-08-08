import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FairytaleGUI extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Fairytale Library");
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(getClass().getResource("Core/FairytaleGUI.fxml"));
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.show();

    }
}
