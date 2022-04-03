package com.transport.without_engine;

import com.transport.CityTransport;

public abstract class WithoutEngine extends CityTransport {
    protected String pedal_exist ;
    protected String cabin;

    public WithoutEngine() {}

    public WithoutEngine(String name, float speed, float weight, String type_of_city_transport, float length,
                          String pedal_exist, String cabin) {
        super(name, speed, weight, type_of_city_transport, length);
        this.pedal_exist = pedal_exist;
        this.cabin = cabin;
    }
    public abstract void Ride();
}
