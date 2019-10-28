package com.example.simpleparadox.listycity;

public class City implements Comparable<City> {
    private String city;
    private String province;
    City(String city, String province){
        this.city = city;
        this.province = province;
    }
    String getCityName(){
        return this.city;
    }
    String getProvinceName(){
        return this.province;
    }
    @Override
    public int compareTo(City city) {
        return this.city.compareTo(city.getCityName());
    }

    @Override
    public boolean equals(Object o){
        if (o.getClass() == City.class){
            if(this.compareTo((City) o) == 0){
                return true;
            }
        }
        return false;
    }

}
