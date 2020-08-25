package de.telran;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;

import java.io.File;
import java.net.URL;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        Person person = mapper.readValue(new File("test.json"), Person.class);
        System.out.println(person);

        Person p1 = new Person();
        p1.setFirstName("Ivan");
        p1.setLastName("Petrov");
        p1.setAge(30);
        p1.setAddress(Arrays.asList(new Address("Berlin", "Friedrichstraße", 38),
                                    new Address("Berlin", "Leipziger Straße", 140)));
        mapper.writeValue(new File("out.json"), p1);

//        String s = mapper.readValue(new File("test.json"), String.class);
//        System.out.println(s);

        SearchResults[] searchResults = mapper.readValue(new URL("https://www.metaweather.com/api/location/search/?query=london"), SearchResults[].class);
        System.out.println(searchResults[0]);

        String woeid = searchResults[0].getWoeid();
        String urlName = "https://www.metaweather.com:443/api/location/" + woeid;

        Forecast forecast = mapper.readValue(new URL(urlName), Forecast.class);
        System.out.println(forecast.getConsolidatedWeather().get(0).getTheTemp());
        
    }

}
