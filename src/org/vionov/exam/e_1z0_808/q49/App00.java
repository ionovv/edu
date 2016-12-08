package org.vionov.exam.e_1z0_808.q49;

public class App00 {
}

class Vehicle {
    int x;

    Vehicle() {
        this(10);
    }

    Vehicle(int x) {
        this.x = x;
    }
}

class Car extends Vehicle {
    int y;

    Car() {
        super();
//        this(20);
    }

    Car(int y) {
        this.y = y;
    }

    public String toString() {
        return super.x + ":" + this.y;
    }
}