package dev.cuenta;

public abstract class Account {
    protected float balance;
    protected float annualRate;
    protected int numberOfDeposits;

    public void deposit(float amount) {
        balance += amount;
        numberOfDeposits++;
    }
    
    public int getNumberOfDeposits() {
        return numberOfDeposits;
    }

    public Account(float balance, float annualRate) {
        this.balance = balance;
        this.annualRate = annualRate;
    }
    
    public float getBalance() {
        return balance;
    }
    
    public float getAnnualRate() {
        return annualRate;
    }
}