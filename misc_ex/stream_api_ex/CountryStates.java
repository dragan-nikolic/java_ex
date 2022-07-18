import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public enum CountryStates {
    // US
    ALABAMA("Alabama", "AL", "HZL", "Montgomery", "36101"),
    ALASKA("Alaska", "AK", "OTT", "Juneau", "99801"),
    ARIZONA("Arizona", "AZ", "OTT", "Phoenix", "85001"),
    ARKANSAS("Arkansas", "AR", "OTT", "Little Rock", "72201"),
    CALIFORNIA("California", "CA", "OTT", "Sacramento", "94203"),
    COLORADO("Colorado", "CO", "OTT", "Denver", "80201"),
    CONNECTICUT("Connecticut", "CT", "HZL", "Harold", "06101"),
    DELAWARE("Delaware", "DE", "HZL", "Dover", "19901"),
    FLORIDA("Florida", "FL", "HZL", "Tallahassee", "32301"),
    GEORGIA("Georgia", "GA", "HZL", "Atlanta", "30301"),
    HAWAII("Hawaii", "HI", "OTT", "Honolulu", "96801"),
    IDAHO("Idaho", "ID", "OTT", "Boise", "83701"),
    ILLINOIS("Illinois", "IL", "HZL", "Springfield", "62701"),
    INDIANA("Indiana", "IN", "HZL", "Indianapolis", "46201"),
    IOWA("Iowa", "IA", "OTT", "Des Moines", "50301"),
    KANSAS("Kansas", "KS", "OTT", "Topeka", "66601"),
    KENTUCKY("Kentucky", "KY", "HZL", "Frankfort", "40601"),
    LOUISIANA("Louisiana", "LA", "OTT", "Baton Rouge", "70801"),
    MAINE("Maine", "ME" , "HZL", "Augusta", "04330"),
    MARYLAND("Maryland", "MD" , "HZL", "Annapolis", "21401"),
    MASSACHUSETTS("Massachusetts", "MA", "HZL", "Boston", "02108"),
    MICHIGAN("Michigan", "MI", "HZL", "Lansing", "48901"),
    MINNESOTA("Minnesota", "MN", "OTT", "Saint Paul", "55101"),
    MISSISSIPPI("Mississippi", "MS", "HZL", "Jackson", "39201"),
    MISSOURI("Missouri", "MO", "OTT", "Jefferson City", "65101"),
    MONTANA("Montana", "MT", "OTT", "Helena", "59601"),
    NEBRASKA("Nebraska", "NE", "OTT", "Lincoln", "68501"),
    NEVADA("Nevada", "NV", "OTT", "Carson City", "89701"),
    NEW_HAMPSHIRE("New Hampshire", "NH", "HZL", "Concord", "03301"),
    NEW_JERSEY("New Jersey", "NJ", "HZL", "Trenton", "08601"),
    NEW_MEXICO("New Mexico", "NM", "OTT", "Santa Fe", "87501"),
    NEW_YORK("New York", "NY", "HZL", "Albany", "12201"),
    NORTH_CAROLINA("North Carolina", "NC", "HZL", "Raleigh", "27601"),
    NORTH_DAKOTA("North Dakota", "ND", "OTT", "Bismarck", "58501"),
    OHIO("Ohio", "OH", "HZL", "Columbus", "43201"),
    OKLAHOMA("Oklahoma", "OK", "OTT", "Oklahoma City", "73101"),
    OREGON("Oregon", "OR", "OTT", "Salem", "97301"),
    PENNSYLVANIA("Pennsylvania", "PA", "HZL", "Harrisburg", "17101"),
    RHODE_ISLAND("Rhode Island", "RI", "HZL", "Providence", "02901"),
    SOUTH_CAROLINA("South Carolina", "SC", "HZL", "Columbia", "29201"),
    SOUTH_DAKOTA("South Dakota", "SD", "OTT", "Pierre", "57501"),
    TENNESSEE("Tennessee", "TN", "HZL", "Nashville", "37201"),
    TEXAS("Texas", "TX", "OTT", "Austin", "73301"),
    UTAH("Utah", "UT", "OTT", "Salt Lake City", "84101"),
    VERMONT("Vermont", "VT", "HZL", "Montpelier", "05601"),
    VIRGINIA("Virginia", "VA", "HZL", "Richmond", "23218"),
    WASHINGTON("Washington", "WA", "HZL", "Olympia", "98501"),
    WEST_VIRGINIA("West Virginia", "WV", "HZL", "Charleston", "25301"),
    WISCONSIN("Wisconsin", "WI", "HZL", "Madison", "53701"),
    WYOMING("Wyoming", "WY", "OTT", "Cheyenne", "82001"),

    //CA
    ALBERTA("Alberta", "AL", "", "", "", "CA"),
    BRITISH_COLUMBIA("British Columbia", "BC", "", "", "", "CA"),
    MANITOBA("Manitoba", "MB", "", "", "", "CA"),
    ONTARIO("Ontario", "ON", "", "", "", "CA");

    private String name;
    private String abbreviation;
    private String dc;
    private String capital;
    private String postalCode;
    private String country;

    CountryStates(String name, String abbreviation, String dc, String capital, String postalCode, String country) {
        this.name = name;
        this.abbreviation = abbreviation;
        this.dc = dc;
        this.capital = capital;
        this.postalCode = postalCode;
        this.country = country;
    }

    CountryStates(String name, String abbreviation, String dc, String capital, String postalCode) {
        this(name, abbreviation, dc, capital, postalCode, "US");
    }

    CountryStates(String name, String abbreviation) {
        this(name, abbreviation, "", "", "", "");
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public static CountryStates getRandomStateForCountry(String country) {
        List<CountryStates> countryStates = getStatesForCountry(country); 

        if (countryStates.isEmpty()) {
            throw new IllegalArgumentException("Unable to get random state. No states are defined for the country " + country + "!");
        }

        Random random = new Random();
        return countryStates.get(random.nextInt(countryStates.size()));
    }

    public static List<CountryStates> getStatesForCountry(String country) {
        return Arrays.stream(values()).filter(x -> x.country.equalsIgnoreCase(country)).collect(Collectors.toList());
    }

    public static CountryStates BY_NAME(String value) {
        for (CountryStates s: values()) {
            if (s.name.equals(value)) {
                return s;
            }
        }

        throw new IllegalArgumentException("Unknown state name: " + value);
    }

    public static CountryStates BY_ABBREVIATION(String value) {
        for (CountryStates s: values()) {
            if (s.abbreviation.equals(value)) {
                return s;
            }
        }

        throw new IllegalArgumentException("Unknown state abbreviation: " + value);
    }

    public static String NAME_TO_ABBREVIATION(String value) {
        return BY_NAME(value).abbreviation;
    }

    public static String ABBREVIATION_TO_NAME(String value) {
        return BY_ABBREVIATION(value).name;
    }
}
