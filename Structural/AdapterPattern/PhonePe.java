package DesignPattern.Structural.AdapterPattern;

import DesignPattern.Structural.AdapterPattern.Adapter.IBankAPI;

public class PhonePe {

    IBankAPI bankAPI;

    public void setBankAPI(IBankAPI bankAPI) {
        this.bankAPI = bankAPI;
    }

    public void transferMoney(String from, String to, double amount) {
        this.bankAPI.transferMoney(from, to, amount);
    }

    public void checkBalance() {
        this.bankAPI.checkBalance();
    }
}
