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
@Override
public void deposit(float amount) {
    if (active) {
        super.deposit(amount);
    }
}
@Override
public void withdraw(float amount) {
    if (active && amount <= getBalance()) {
        super.withdraw(amount);
    }
}
@Override
public void monthlyStatement() {
    if (getNumberOfWithdrawals() > 4) {
        setMonthlyFee((getNumberOfWithdrawals() - 4) * 1000f);
    }
    super.monthlyStatement();
    active = getBalance() >= 10000;
}

@Override
public String print() {
    return super.print() + String.format(
        "%nActive: %b%nDeposits: %d%nWithdrawals: %d",
        active, getNumberOfDeposits(), getNumberOfWithdrawals()
    );
}

}
