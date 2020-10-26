import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    public static void main(String[] args) throws IOException {
        CSVUtility.convertCSVToSQL();
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("GdpChartView.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("GDP Per Capita");
        stage.show();
    }
}
