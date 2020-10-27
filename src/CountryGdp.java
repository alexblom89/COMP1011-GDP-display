import java.sql.Array;
import java.util.ArrayList;

public class CountryGdp {

    public int gdpId;
    public String countryName, countryCode;
    public Float year2000, year2001, year2002, year2003,
                 year2004, year2005, year2006, year2007,
                 year2008, year2009, year2010, year2011,
                 year2012, year2013, year2014, year2015,
                 year2016, year2017, year2018, year2019;
//    public ArrayList<Float> yearGdp = new ArrayList<>();


    public CountryGdp(int gdpId, String countryName, String countryCode, Float year2000, Float year2001, Float year2002, Float year2003, Float year2004, Float year2005, Float year2006, Float year2007, Float year2008, Float year2009, Float year2010, Float year2011, Float year2012, Float year2013, Float year2014, Float year2015, Float year2016, Float year2017, Float year2018, Float year2019) {
        setGdpId(gdpId);
        setCountryName(countryName);
        setCountryCode(countryCode);
        setYear2000(year2000);
        setYear2001(year2001);
        setYear2002(year2002);
        setYear2003(year2003);
        setYear2004(year2004);
        setYear2005(year2005);
        setYear2006(year2006);
        setYear2007(year2007);
        setYear2008(year2008);
        setYear2009(year2009);
        setYear2010(year2010);
        setYear2011(year2011);
        setYear2012(year2012);
        setYear2013(year2013);
        setYear2014(year2014);
        setYear2015(year2015);
        setYear2016(year2016);
        setYear2017(year2017);
        setYear2018(year2018);
        setYear2019(year2019);
    }

    public int getGdpId() {
        return gdpId;
    }

    public void setGdpId(int gdpId) {
        this.gdpId = gdpId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        if(countryName instanceof String){
            this.countryName = countryName;
            if(countryName.isBlank())
                throw new IllegalArgumentException("Country Name values must be included.");
        } else
            throw new IllegalArgumentException("Country Name must be a String.");
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        if(countryCode instanceof String){
            this.countryCode = countryCode;
            if(countryCode.isBlank())
                throw new IllegalArgumentException("Country Code values must be included.");
        } else
            throw new IllegalArgumentException("Country Code must be a String.");
    }


    public Float getYear2000() {
        return year2000;
    }

    /**
     * Validate that a country's gdp per capita is not less than 0. JDBC returns null values from the database as 0,
     * however if null values are in the plotted series on a chart, the program crashes. Thus all 0 values will remain
     * as 0 and will display as such on the chart.
     * This validation is true for all following year properties.
     * @param year2000
     */
    public void setYear2000(Float year2000) {
        if(year2000 < 0)
            throw new IllegalArgumentException("The year 2000 value in the .csv file is invalid, all gdp values must be larger than 0.");
        else
            this.year2000 = year2000;
    }

    public Float getYear2001() {
        return year2001;
    }

    public void setYear2001(Float year2001) {
        if(year2001 < 0)
            throw new IllegalArgumentException("The year 2001 value in the .csv file is invalid, all gdp values must be larger than 0.");
        else
            this.year2001 = year2001;
    }

    public Float getYear2002() {
        return year2002;
    }

    public void setYear2002(Float year2002) {
        if(year2002 < 0)
            throw new IllegalArgumentException("The year 2002 value in the .csv file is invalid, all gdp values must be larger than 0.");
        else
            this.year2002 = year2002;
    }

    public Float getYear2003() {
        return year2003;
    }

    public void setYear2003(Float year2003) {
        if(year2003 < 0)
            throw new IllegalArgumentException("The year 2003 value in the .csv file is invalid, all gdp values must be larger than 0.");
        else
            this.year2003 = year2003;
    }

    public Float getYear2004() {
        return year2004;
    }

    public void setYear2004(Float year2004) {
        if(year2004 < 0)
            throw new IllegalArgumentException("The year 2004 value in the .csv file is invalid, all gdp values must be larger than 0.");
        else
            this.year2004 = year2004;
    }

    public Float getYear2005() {
        return year2005;
    }

    public void setYear2005(Float year2005) {
        if(year2005 < 0)
            throw new IllegalArgumentException("The year 2005 value in the .csv file is invalid, all gdp values must be larger than 0.");
        else
            this.year2005 = year2005;
    }

    public Float getYear2006() {
        return year2006;
    }

    public void setYear2006(Float year2006) {
        if(year2006 < 0)
            throw new IllegalArgumentException("The year 2006 value in the .csv file is invalid, all gdp values must be larger than 0.");
        else
            this.year2006 = year2006;
    }

    public Float getYear2007() {
        return year2007;
    }

    public void setYear2007(Float year2007) {
        if(year2007 < 0)
            throw new IllegalArgumentException("The year 2007 value in the .csv file is invalid, all gdp values must be larger than 0.");
        else
            this.year2007 = year2007;
    }

    public Float getYear2008() {
        return year2008;
    }

    public void setYear2008(Float year2008) {
        if(year2008 < 0)
            throw new IllegalArgumentException("The year 2008 value in the .csv file is invalid, all gdp values must be larger than 0.");
        else
            this.year2008 = year2008;
    }

    public Float getYear2009() {
        return year2009;
    }

    public void setYear2009(Float year2009) {
        if(year2009 < 0)
            throw new IllegalArgumentException("The year 2009 value in the .csv file is invalid, all gdp values must be larger than 0.");
        else
            this.year2009 = year2009;
    }

    public Float getYear2010() {
        return year2010;
    }

    public void setYear2010(Float year2010) {
        if(year2010 < 0)
            throw new IllegalArgumentException("The year 2010 value in the .csv file is invalid, all gdp values must be larger than 0.");
        else
            this.year2010 = year2010;
    }

    public Float getYear2011() {
        return year2011;
    }

    public void setYear2011(Float year2011) {
        if(year2011 < 0)
            throw new IllegalArgumentException("The year 2011 value in the .csv file is invalid, all gdp values must be larger than 0.");
        else
            this.year2011 = year2011;
    }

    public Float getYear2012() {
        return year2012;
    }

    public void setYear2012(Float year2012) {
        if(year2012 < 0)
            throw new IllegalArgumentException("The year 2012 value in the .csv file is invalid, all gdp values must be larger than 0.");
        else
            this.year2012 = year2012;    }

    public Float getYear2013() {
        return year2013;
    }

    public void setYear2013(Float year2013) {
        if(year2013 < 0)
            throw new IllegalArgumentException("The year 2013 value in the .csv file is invalid, all gdp values must be larger than 0.");
        else
            this.year2013 = year2013;    }

    public Float getYear2014() {
        return year2014;
    }

    public void setYear2014(Float year2014) {
        if(year2014 < 0)
            throw new IllegalArgumentException("The year 2014 value in the .csv file is invalid, all gdp values must be larger than 0.");
        else
            this.year2014 = year2014;    }

    public Float getYear2015() {
        return year2015;
    }

    public void setYear2015(Float year2015) {
        if(year2015 < 0)
            throw new IllegalArgumentException("The year 2015 value in the .csv file is invalid, all gdp values must be larger than 0.");
        else
            this.year2015 = year2015;    }

    public Float getYear2016() {
        return year2016;
    }

    public void setYear2016(Float year2016) {
        if(year2016 < 0)
            throw new IllegalArgumentException("The year 2016 value in the .csv file is invalid, all gdp values must be larger than 0.");
        else
            this.year2016 = year2016;    }

    public Float getYear2017() {
        return year2017;
    }

    public void setYear2017(Float year2017) {
        if(year2017 < 0)
            throw new IllegalArgumentException("The year 2017 value in the .csv file is invalid, all gdp values must be larger than 0.");
        else
            this.year2017 = year2017;    }

    public Float getYear2018() {
        return year2018;
    }

    public void setYear2018(Float year2018) {
        if(year2018 < 0)
            throw new IllegalArgumentException("The year 2018 value in the .csv file is invalid, all gdp values must be larger than 0.");
        else
            this.year2018 = year2018;    }

    public Float getYear2019() {
        return year2019;
    }

    public void setYear2019(Float year2019) {
        if(year2019 < 0)
            throw new IllegalArgumentException("The year 2019 value in the .csv file is invalid, all gdp values must be larger than 0.");
        else
            this.year2019 = year2019;    }
}
