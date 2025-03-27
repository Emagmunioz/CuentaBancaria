package dev.cuenta;

public abstract class Account {
    protected float balance;
    protected float annualRate;
    protected int numberOfDeposits;
    protected int numberOfWithdrawals;
    protected float monthlyFee;

    public void setMonthlyFee(float fee) {
        this.monthlyFee = fee;
    }
   
public void withdraw(float amount) {
    if (amount <= balance) {
        balance -= amount;
        numberOfWithdrawals++;
    }
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

    public void calculateInterest() {

        float monthlyRate = annualRate / 12;
        balance += balance * monthlyRate;
}

    
    
    public float getBalance() {
        return balance;
    }
    
    public float getAnnualRate() {
        return annualRate;
    }
    public void monthlyStatement() {
        balance -= monthlyFee;
        calculateInterest();
        monthlyFee = 0;
        numberOfDeposits = 0;
        numberOfWithdrawals = 0;
    }
    public String print() {
        return String.format("Balance: %.1f%nAnnual Rate: %.1f%%", 
            balance, annualRate * 100);
    }

    protected abstract void setBalance(float f);
    
}