package com.vionov.q5;

public class Customer {
    ElectricAccount acct = new ElectricAccount();

    public void useElectrcity (double kWh){
        acct.addKWH(kWh);
    }
}
