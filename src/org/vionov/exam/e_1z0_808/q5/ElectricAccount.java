package org.vionov.exam.e_1z0_808.q5;

public class ElectricAccount {
    private double kWh;
    private double rate = 0.07;
    private double bill;

    void addKWH(double kWh) {
        this.kWh += kWh;
        this.bill = this.kWh * this.rate;
    }
}
