import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class GdpChartViewController implements Initializable {


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {



    }

    @FXML private void goToTableView(ActionEvent event) throws IOException {
        SceneChanger.changeScene(event, "GdpTableView.fxml", "Gross Domestic Product Per Country 2000 - 2019");
    }
}
