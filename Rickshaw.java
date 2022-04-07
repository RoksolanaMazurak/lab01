package com.transport.without_engine.impl;

import com.transport.without_engine.WithoutEngine;

public class Rickshaw extends WithoutEngine {
    final String TYPE_TRANSPORT = "rickshaw";
    private String type_of_rickshaw;
    private String visor;

    public Rickshaw() {};

    public Rickshaw(String name, float speed, float weight, String type_of_city_transport, float length,
                    String existence_of_pedal, String cabin, String type_of_rickshaw, String visor) {
        super(name, speed, weight, type_of_city_transport, length, existence_of_pedal, cabin);
        this.type_of_rickshaw = type_of_rickshaw;
        this.visor = visor;
    }

    @Override
    public String toString() { //function returns information about taxi
        return "Name of transport: " + name + "," + " speed of transport: " + speed + "," + " weight: " + weight + ","
                + " type of city transport: " + type_of_city_transport + "," + " length: " + length + ","
                + " existence of pedals: " + pedal_exist + "," + " cabin: " + cabin + "," +
                " type of rickshaw: " + type_of_rickshaw + "," + " visor: " + visor + ".";
    }
    public void Ride() {
        System.out.println("Riding the " + TYPE_TRANSPORT + "!");
    }
    public void Go() {
        System.out.println("The " + TYPE_TRANSPORT + " is going!");
    }
}
