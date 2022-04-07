package com.transport;

import com.transport.motor_transport.impl.Bus;
import com.transport.motor_transport.impl.Taxi;
import com.transport.without_engine.impl.Carriage;
import com.transport.without_engine.impl.Rickshaw;

public class Main {

    public static void main(String[] args) {
        Bus bus = new Bus("bus", 60, 7, "public", 13, "diesel",
                "mechanic","school bus", 1);
        System.out.println(bus);

        Taxi taxi = new Taxi("taxi", 60, 2, "private", 4, "diesel",
                "automatic", "Lanus", "exists");
        System.out.println(taxi);

        Carriage carriage = new Carriage("carriage", 40, 1, "private", 1,
                "none", "exist", 3, "exists");
        System.out.println(carriage);

        Rickshaw rickshaw = new Rickshaw("rickshaw", 10, 1, "private", 2,
                "none", "exist", "two-wheeled", "none");
        System.out.println(rickshaw);

        System.out.println();

        bus.Drive();
        taxi.Drive();
        carriage.Ride();
        rickshaw.Ride();
        bus.Go();
        taxi.Go();
        carriage.Go();
        rickshaw.Go();
    }
}
