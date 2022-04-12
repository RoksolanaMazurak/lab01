package com.transport.motor_transport;

import com.transport.CityTransport;

public class MotorTransport extends CityTransport {
    private String motor;
    private String transmission;

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public MotorTransport() {}

    public MotorTransport(String name, String weight, String length, int travel_price, String type_of_city_transport,
                          String motor, String transmission) {
        super(name, weight, length, travel_price, type_of_city_transport);
        this.motor = motor;
        this.transmission = transmission;
    }
    public void Drive() {
        System.out.println("Driving the motor transport!");
    };
}
