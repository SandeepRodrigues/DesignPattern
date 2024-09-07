package DesignPattern.Structural.AdapterPattern;

import DesignPattern.Structural.AdapterPattern.Adapter.BankAPIFactory;
import DesignPattern.Structural.AdapterPattern.Adapter.IBankAPI;

public class AdapterMain {
    public static void main(String[] args) {
        PhonePe p = new PhonePe();
        IBankAPI bankAPI = BankAPIFactory.getBankAPIByName("ICICIBank");
        p.setBankAPI(bankAPI);
        p.checkBalance();
        p.transferMoney("101", "201", 56.09);
    }
}
