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
        super.setBalance(0);
        super.setNumberOfWithdrawals(super.getNumberOfWithdrawals() + 1);
    }
}

@Override
public void deposit(float amount) {
    if (overdraft > 0) {
        if (amount <= overdraft) {
            overdraft -= amount;
        } else {
            setBalance(amount - overdraft);
            overdraft = 0;
            setNumberOfDeposits(getNumberOfDeposits() + 1);
                    }
                } else {
                    super.deposit(amount);
                }
            }
            
            private void setNumberOfDeposits(int i) {
               
                throw new UnsupportedOperationException("Unimplemented method 'setNumberOfDeposits'");
            }

}

