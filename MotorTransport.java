package com.transport.motor_transport;

import com.transport.CityTransport;

public abstract class MotorTransport extends CityTransport {
    protected String motor;
    protected String transmission;

    public MotorTransport() {}

    public MotorTransport(String name, float speed, float weight, String type_of_city_transport, float length,
               String motor, String transmission) {
        super(name, speed, weight, type_of_city_transport, length);
        this.motor = motor;
        this.transmission = transmission;
    }
    public abstract void Drive();
}
