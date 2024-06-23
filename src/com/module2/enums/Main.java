package com.module2.enums;

import com.module2.enums.model.Car;
import static com.module2.enums.model.Car.TrafficLight.*;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Nissan", 2020);
        car.drive(YELLOW);
    }

}
