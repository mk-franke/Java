package de.telran;

public class SearchResults {

    private String title;
    private String location_type;
    private String woeid;
    private String latt_long;

    public String getTitle() {
        return title;
    }

    public String getLocation_type() {
        return location_type;
    }

    public String getWoeid() {
        return woeid;
    }

    public String getLatt_long() {
        return latt_long;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLocationType(String location_type) {
        this.location_type = location_type;
    }

    public void setWoeid(String woeid) {
        this.woeid = woeid;
    }

    public void setLatt_long(String latt_long) {
        this.latt_long = latt_long;
    }

    @Override
    public String toString() {
        return "SearchResults{" +
                "title='" + title + '\'' +
                ", location_type='" + location_type + '\'' +
                ", woeid='" + woeid + '\'' +
                ", latt_long='" + latt_long + '\'' +
                '}';
    }

}
