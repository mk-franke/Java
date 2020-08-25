package de.telran;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

//@JsonIgnoreProperties(ignoreUnknown = true)
public class Forecast {

    private List<ConsolidatedWeather> consolidatedWeather;

    public Forecast(List<ConsolidatedWeather> consolidatedWeather) {
        this.consolidatedWeather = consolidatedWeather;
    }

    public Forecast() {

    }

    public List<ConsolidatedWeather> getConsolidatedWeather() {
        return consolidatedWeather;
    }

    public void setConsolidatedWeather(List<ConsolidatedWeather> consolidatedWeather) {
        this.consolidatedWeather = consolidatedWeather;
    }

    @Override
    public String toString() {
        return "Forecast{" +
                "consolidatedWeather=" + consolidatedWeather +
                '}';
    }

}
