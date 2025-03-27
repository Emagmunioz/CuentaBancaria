package dev.cuenta;

public abstract class Account {
    protected float balance;
    
    public Account(float balance, float annualRate) {
        this.balance = balance;
    }
    
    public float getBalance() {
        return balance;
    }


}
