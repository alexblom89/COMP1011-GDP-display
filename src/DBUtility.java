import java.sql.*;
import java.util.ArrayList;

public class DBUtility {
    private static String user = "root";
    private static String password = "trains";

    public static ArrayList<CountryGdp> getCountryGdp() throws SQLException {
        ArrayList<CountryGdp> countryGdps = new ArrayList<>();
//        ArrayList<Float> yearlyGdp = new ArrayList<>();
        Connection conn = null;
        Statement statement = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/week4java", user, password);
            statement = conn.createStatement();
            rs = statement.executeQuery("SELECT * FROM country_gdp");
            int counter = 6;
            while (rs.next())
            {
                //This is my attempt at automating the process of getting each column value for each year and placing them into an arraylist object.
//                while (counter < 66){
//                    CountryGdp newCountryGdp = new CountryGdp(
//                            rs.getInt("gdpId"),
//                            rs.getString("countryName"),
//                            rs.getString("countryCode"),
//                            yearlyGdp.add(rs.getFloat(counter))
//                        );
//                    counter++;
//                }

                CountryGdp newGdp = new CountryGdp(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getFloat(46),
                        rs.getFloat(47),
                        rs.getFloat(48),
                        rs.getFloat(49),
                        rs.getFloat(50),
                        rs.getFloat(51),
                        rs.getFloat(52),
                        rs.getFloat(53),
                        rs.getFloat(54),
                        rs.getFloat(55),
                        rs.getFloat(56),
                        rs.getFloat(57),
                        rs.getFloat(58),
                        rs.getFloat(59),
                        rs.getFloat(60),
                        rs.getFloat(61),
                        rs.getFloat(62),
                        rs.getFloat(63),
                        rs.getFloat(64),
                        rs.getFloat(65));
                countryGdps.add(newGdp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(conn != null)
                conn.close();
            if(rs != null)
                rs.close();
            if(statement != null)
                statement.close();

            return countryGdps;
        }
    }
}
