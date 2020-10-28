package Controllers;

import Models.CountryGdp;
import Utilities.DBUtility;
import Utilities.SceneChanger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class GdpTableViewController implements Initializable {

    @FXML
    private TableView<CountryGdp> gdpTable;

    @FXML
    private TableColumn<CountryGdp, String> countryNameColumn;

    @FXML
    private TableColumn<CountryGdp, String> countryCodeColumn;

    @FXML
    private TableColumn<CountryGdp, Float> year2000Column;

    @FXML
    private TableColumn<CountryGdp, Float> year2001Column;

    @FXML
    private TableColumn<CountryGdp, Float> year2002Column;

    @FXML
    private TableColumn<CountryGdp, Float> year2003Column;

    @FXML
    private TableColumn<CountryGdp, Float> year2004Column;

    @FXML
    private TableColumn<CountryGdp, Float> year2005Column;

    @FXML
    private TableColumn<CountryGdp, Float> year2006Column;

    @FXML
    private TableColumn<CountryGdp, Float> year2007Column;

    @FXML
    private TableColumn<CountryGdp, Float> year2008Column;

    @FXML
    private TableColumn<CountryGdp, Float> year2009Column;

    @FXML
    private TableColumn<CountryGdp, Float> year2010Column;

    @FXML
    private TableColumn<CountryGdp, Float> year2011Column;

    @FXML
    private TableColumn<CountryGdp, Float> year2012Column;

    @FXML
    private TableColumn<CountryGdp, Float> year2013Column;

    @FXML
    private TableColumn<CountryGdp, Float> year2014Column;

    @FXML
    private TableColumn<CountryGdp, Float> year2015Column;

    @FXML
    private TableColumn<CountryGdp, Float> year2016Column;

    @FXML
    private TableColumn<CountryGdp, Float> year2017Column;

    @FXML
    private TableColumn<CountryGdp, Float> year2018Column;

    @FXML
    private TableColumn<CountryGdp, Float> year2019Column;

    /**
     * Set up the table to accept values from the CountryGDP constructor.
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        countryNameColumn.setCellValueFactory(new PropertyValueFactory<CountryGdp, String>("countryName"));
        countryCodeColumn.setCellValueFactory(new PropertyValueFactory<CountryGdp, String>("countryCode"));
        year2000Column.setCellValueFactory(new PropertyValueFactory<CountryGdp, Float>("year2000"));
        year2001Column.setCellValueFactory(new PropertyValueFactory<CountryGdp, Float>("year2001"));
        year2002Column.setCellValueFactory(new PropertyValueFactory<CountryGdp, Float>("year2002"));
        year2003Column.setCellValueFactory(new PropertyValueFactory<CountryGdp, Float>("year2003"));
        year2004Column.setCellValueFactory(new PropertyValueFactory<CountryGdp, Float>("year2004"));
        year2005Column.setCellValueFactory(new PropertyValueFactory<CountryGdp, Float>("year2005"));
        year2006Column.setCellValueFactory(new PropertyValueFactory<CountryGdp, Float>("year2006"));
        year2007Column.setCellValueFactory(new PropertyValueFactory<CountryGdp, Float>("year2007"));
        year2008Column.setCellValueFactory(new PropertyValueFactory<CountryGdp, Float>("year2008"));
        year2009Column.setCellValueFactory(new PropertyValueFactory<CountryGdp, Float>("year2009"));
        year2010Column.setCellValueFactory(new PropertyValueFactory<CountryGdp, Float>("year2010"));
        year2011Column.setCellValueFactory(new PropertyValueFactory<CountryGdp, Float>("year2011"));
        year2012Column.setCellValueFactory(new PropertyValueFactory<CountryGdp, Float>("year2012"));
        year2013Column.setCellValueFactory(new PropertyValueFactory<CountryGdp, Float>("year2013"));
        year2014Column.setCellValueFactory(new PropertyValueFactory<CountryGdp, Float>("year2014"));
        year2015Column.setCellValueFactory(new PropertyValueFactory<CountryGdp, Float>("year2015"));
        year2016Column.setCellValueFactory(new PropertyValueFactory<CountryGdp, Float>("year2016"));
        year2017Column.setCellValueFactory(new PropertyValueFactory<CountryGdp, Float>("year2017"));
        year2018Column.setCellValueFactory(new PropertyValueFactory<CountryGdp, Float>("year2018"));
        year2019Column.setCellValueFactory(new PropertyValueFactory<CountryGdp, Float>("year2019"));

        try {
            gdpTable.getItems().addAll(DBUtility.getCountryGdp());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Use the SceneChanger Utility to go back to the chart view.
     * @param event
     * @throws IOException
     */
    @FXML private void backToChartView(ActionEvent event) throws IOException {
        SceneChanger.changeScene(event, "/Views/GdpChartView.fxml", "Per Capita Gross Domestic Product Per Country 2000 - 2019");
    }
}
