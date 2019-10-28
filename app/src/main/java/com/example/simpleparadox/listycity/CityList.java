package com.example.simpleparadox.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }


    /**
     * When given a city, return whether or not it belongs in the list
     * @param city
     * is this city in
     * @return
     * boolean if city in list
     */
    public boolean hasCity(City city){
        return cities.contains(city);
    }

    /**
     * Check if a city is present in the list.
     * @param city
     * @throws Exception
     * If it does then remove it from the list, if not then throw an exception
     */
    public void deleteCity(City city) throws Exception {
        if(this.hasCity(city)){
            this.cities.remove(city);
        }else{
            throw new Exception("Couldn't delete city");
        }
    }


    /**
     * Return how many cities are in the list
     * @return
     * Return how many cities are in the list
     */
    public int countCities(){
        return this.cities.size();
    }

}