package dev.cuenta;

public class SavingsAccount extends Account{
    private boolean active;
    
    public SavingsAccount(float balance, float annualRate) {
        super(balance, annualRate);
        this.active = balance >= 10000;
    }
    public boolean isActive() {
        return active;
    }

}
