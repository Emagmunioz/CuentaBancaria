package dev.cuenta;

public abstract class Account {
    protected float balance;
    protected float annualRate;
    protected int numberOfDeposits;
    protected int numberOfWithdrawals;

    public void withdraw(float amount) {
        balance -= amount;
        numberOfWithdrawals++;
    }
    
    public int getNumberOfWithdrawals() {
        return numberOfWithdrawals;
    }

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