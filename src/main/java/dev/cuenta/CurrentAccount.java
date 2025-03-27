package dev.cuenta;

public class CurrentAccount extends Account {
    private float overdraft;
    
    public CurrentAccount(float balance, float annualRate) {
        super(balance, annualRate);
        this.overdraft = 0f;
    }
    
    public float getOverdraft() {
        return overdraft;
    }
   
@Override
public void withdraw(float amount) {
    if (amount <= getBalance()) {
        super.withdraw(amount);
    } else {
        overdraft += amount - getBalance();
        setBalance(0);
        setNumberOfWithdrawals(getNumberOfWithdrawals() + 1);
    }
    
}
}
