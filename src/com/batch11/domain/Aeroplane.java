package com.batch11.domain;

public class Aeroplane {
    private String name;
    private Integer capacity;
    private  String airline;

    public Aeroplane(String name, Integer capacity, String airline) {
        this.name = name;
        this.capacity = capacity;
        this.airline = airline;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    @Override
    public String toString() {
        return "Aeroplane{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", airline='" + airline + '\'' +
                '}';
    }
}
