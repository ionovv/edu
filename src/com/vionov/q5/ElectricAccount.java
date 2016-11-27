package com.vionov.q5;

public class ElectricAccount {
    private double kWh;
    private double rate = 0.07;
    private double bill;

    void addKWH(double kWh) {
        this.kWh += kWh;
        this.bill = this.kWh * this.rate;
    }
}
