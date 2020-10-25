public class PerCapitaGDP {

    public String countryName, countryCode;
    public int year;
    public double gdp;

    public PerCapitaGDP(String countryName, String countryCode, int year, double gdp) {
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getGdp() {
        return gdp;
    }

    public void setGdp(double gdp) {
        this.gdp = gdp;
    }
}
