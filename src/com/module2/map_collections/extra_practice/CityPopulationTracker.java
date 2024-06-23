package com.module2.map_collections.extra_practice;

import java.util.HashMap;

public class CityPopulationTracker {

    private HashMap<String, City> cityPopulations;

    public CityPopulationTracker () {
        this.cityPopulations = new HashMap<>();
    }

    public City getCity(String cityName) {
//        return cityPopulations.get(name);   -> my wrong answer
        return new City(this.cityPopulations.get(cityName));
    }

    public void setCity(City o) {
        this.cityPopulations.put(o.getName(), new City(o));
    }

    public void addCity (City o) {
        this.cityPopulations.put(o.getName(), new City(o));
    }

}
