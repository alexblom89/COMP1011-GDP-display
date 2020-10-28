package Controllers;

import Models.CountryGdp;
import Utilities.DBUtility;
import Utilities.SceneChanger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.ComboBox;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class GdpChartViewController implements Initializable {

    @FXML
    private LineChart<String, Float> gdpLineChart;

    @FXML
    private CategoryAxis yearAxis;

    @FXML
    private NumberAxis gdpAxis;

    @FXML
    private ComboBox<String> countryComboBox;

    private ArrayList<CountryGdp> gdpData = new ArrayList<>();

    /**
     * Set various items in the scene, put all data from the database into an arraylist, loop through data and put all country names
     * into the combo box. Pre-select Canada in the combobox and load chart. (If no country is selected, on startup the
     * application's linechart x-axis labels act strangely).
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
                gdpData.addAll(DBUtility.getCountryGdp());
                XYChart.Series<String, Float> gdpSeries = new XYChart.Series<>();
                gdpLineChart.setLegendVisible(false);

                gdpSeries.setName("GDP Per Capita (US$)");
                yearAxis.setLabel("Year");
                gdpAxis.setLabel("GDP Per Capita");

                for (CountryGdp data:gdpData) {
                    countryComboBox.getItems().add(data.getCountryName());
                }

                countryComboBox.setValue("Canada");
                selectChart();

                //gdpLineChart.getData().addAll(gdpSeries);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     * Clear the previous country's chart, and load the new chart from the data retrieved based on the country that has
     * been selected with the combo box.
     */
    @FXML private void selectChart() {
        XYChart.Series<String, Float> gdpSeries = new XYChart.Series<>();

        gdpLineChart.getData().clear();

        for (CountryGdp data:gdpData){
            if (data.getCountryName().equals(countryComboBox.getValue())) {
                gdpSeries.getData().add(new XYChart.Data<>("2000", data.getYear2000()));
                gdpSeries.getData().add(new XYChart.Data<>("2001", data.getYear2001()));
                gdpSeries.getData().add(new XYChart.Data<>("2002", data.getYear2002()));
                gdpSeries.getData().add(new XYChart.Data<>("2003", data.getYear2003()));
                gdpSeries.getData().add(new XYChart.Data<>("2004", data.getYear2004()));
                gdpSeries.getData().add(new XYChart.Data<>("2005", data.getYear2005()));
                gdpSeries.getData().add(new XYChart.Data<>("2006", data.getYear2006()));
                gdpSeries.getData().add(new XYChart.Data<>("2007", data.getYear2007()));
                gdpSeries.getData().add(new XYChart.Data<>("2008", data.getYear2008()));
                gdpSeries.getData().add(new XYChart.Data<>("2009", data.getYear2009()));
                gdpSeries.getData().add(new XYChart.Data<>("2010", data.getYear2010()));
                gdpSeries.getData().add(new XYChart.Data<>("2011", data.getYear2011()));
                gdpSeries.getData().add(new XYChart.Data<>("2012", data.getYear2012()));
                gdpSeries.getData().add(new XYChart.Data<>("2013", data.getYear2013()));
                gdpSeries.getData().add(new XYChart.Data<>("2014", data.getYear2014()));
                gdpSeries.getData().add(new XYChart.Data<>("2015", data.getYear2015()));
                gdpSeries.getData().add(new XYChart.Data<>("2016", data.getYear2016()));
                gdpSeries.getData().add(new XYChart.Data<>("2017", data.getYear2017()));
                gdpSeries.getData().add(new XYChart.Data<>("2018", data.getYear2018()));
                gdpSeries.getData().add(new XYChart.Data<>("2019", data.getYear2019()));
            }

            gdpLineChart.getData().add(gdpSeries);
        }
    }

    /**
     * Use SceneChanger Utility to go to the Table View.
     * @param event
     * @throws IOException
     */
    @FXML private void goToTableView(ActionEvent event) throws IOException {
        SceneChanger.changeScene(event, "/Views/GdpTableView.fxml", "Per Capita Gross Domestic Product Per Country 2000 - 2019");
    }
}
