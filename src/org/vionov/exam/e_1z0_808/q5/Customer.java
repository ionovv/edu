package org.vionov.exam.e_1z0_808.q5;

public class Customer {
    ElectricAccount acct = new ElectricAccount();

    public void useElectrcity (double kWh){
        acct.addKWH(kWh);
    }
}
