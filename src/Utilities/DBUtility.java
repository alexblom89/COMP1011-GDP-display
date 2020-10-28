package Utilities;

import Models.CountryGdp;

import java.sql.*;
import java.util.ArrayList;

public class DBUtility {
    private static String user = "student";
    private static String password = "student";

    public static ArrayList<CountryGdp> getCountryGdp() throws SQLException {
        ArrayList<CountryGdp> countryGdps = new ArrayList<>();
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
//                    Models.CountryGdp newCountryGdp = new Models.CountryGdp(
//                            rs.getInt("gdpId"),
//                            rs.getString("countryName"),
//                            rs.getString("countryCode"),
//                            yearlyGdp.add(rs.getFloat(counter))
//                        );
//                    counter++;
//                }

                CountryGdp newGdp = new CountryGdp(
                        rs.getInt("gdpId"),
                        rs.getString("countryName"),
                        rs.getString("countryCode"),
                        rs.getFloat("2000"),
                        rs.getFloat("2001"),
                        rs.getFloat("2002"),
                        rs.getFloat("2003"),
                        rs.getFloat("2004"),
                        rs.getFloat("2005"),
                        rs.getFloat("2006"),
                        rs.getFloat("2007"),
                        rs.getFloat("2008"),
                        rs.getFloat("2009"),
                        rs.getFloat("2010"),
                        rs.getFloat("2011"),
                        rs.getFloat("2012"),
                        rs.getFloat("2013"),
                        rs.getFloat("2014"),
                        rs.getFloat("2015"),
                        rs.getFloat("2016"),
                        rs.getFloat("2017"),
                        rs.getFloat("2018"),
                        rs.getFloat("2019"));
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
