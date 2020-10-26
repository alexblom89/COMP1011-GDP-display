import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CSVUtility {
    public static void convertCSVToSQL() throws IOException {
        String template = "INSERT INTO TABLE(%s,%s,%s) VALUES ('%s','%s',%s);";
        String delimiter = ";";

        List<String> statements = new ArrayList<>();

        List<String> lines = Files.readAllLines(Paths.get("GDPPerCapita/API_NY.GDP.PCAP.CD_DS2_en_csv_v2_1495171.csv"));
        String[] columnNames = lines.get(0).split(delimiter);
        for(String name:columnNames){
            System.out.println(name);
        }

        for (int i = 1; i < lines.size(); i++) {
            String[] rawValues = lines.get(i).split(delimiter, -1);
            ArrayList<String> values = new ArrayList<>();
            for (String value:rawValues) {
                String newValue = value.substring(0, value.length() - 1);
                values.add(newValue);
            }
            int counter = 0;
            while (counter < values.size()){
                statements.add(String.format("INSERT INTO country_gdp VALUES (%s);", values.get(counter)));
                counter++;
            }
        }

        Files.write(Paths.get("SqlFileOutput/GDPPerCapita.sql"), statements);
    }

}
