package Utilities;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CSVUtility {
    public static void convertCSVToSQL() throws IOException {
        String delimiter = ";";

        List<String> statements = new ArrayList<>();

        List<String> lines = Files.readAllLines(Paths.get("CSVFiles/API_NY.GDP.PCAP.CD_DS2_en_csv_v2_1495171.csv"));

        for (int i = 1; i < lines.size(); i++) {
            String[] rawValues = lines.get(i).split(delimiter, -1);
            ArrayList<String> values = new ArrayList<>();
            for (String value:rawValues) {
                String newValue = value.substring(0, value.length() - 1);
                values.add(newValue);
            }
            int counter = 0;
            while (counter < values.size()){
                statements.add(String.format("INSERT INTO country_gdp VALUES (NULL, %s);", values.get(counter)));
                counter++;
            }
        }

        Files.write(Paths.get("SqlFileOutput/GDPPerCapita.sql"), statements);
    }

}
