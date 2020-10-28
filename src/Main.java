import Utilities.CSVUtility;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    //Icon made by Freepik from www.flaticon.com
    Image icon = new Image("icons/money.png");

    public static void main(String[] args) throws IOException {
        CSVUtility.convertCSVToSQL();
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Views/GdpChartView.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.getIcons().add(icon);
        stage.setTitle("GDP Per Capita");
        stage.show();
    }
}
