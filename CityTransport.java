package com.transport;

public abstract class CityTransport {
    protected String name;
    protected float speed;
    protected float weight;
    protected String type_of_city_transport;
    protected float length;

    public CityTransport() {
        this.name = "unknown";
        this.speed = 0;
        this.weight= 0;
        this.type_of_city_transport = "unknown";
        this.length = 0;
    }

    public CityTransport(String name, float speed, float weight, String type_of_city_transport, float length) {
        this.name = name;
        this.speed = speed;
        this.weight = weight;
        this.type_of_city_transport = type_of_city_transport;
        this.length = length;
    }
    protected abstract void Go();
}

