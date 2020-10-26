import java.util.ArrayList;

public class CountryGdp {

    public String countryName, countryCode;
    public ArrayList<Integer> year = new ArrayList<>();
    public ArrayList<Double> gdp = new ArrayList<>();

    public CountryGdp(String countryName, String countryCode, ArrayList<Integer> year, ArrayList<Double> gdp) {
        setCountryName(countryName);
        setCountryCode(countryCode);
        setYear(year);
        setGdp(gdp);
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public ArrayList<Integer> getYear() {
        return year;
    }

    public void setYear(ArrayList<Integer> year) {
        this.year = year;
    }

    public ArrayList<Double> getGdp() {
        return gdp;
    }

    public void setGdp(ArrayList<Double> gdp) {
        this.gdp = gdp;
    }
}
