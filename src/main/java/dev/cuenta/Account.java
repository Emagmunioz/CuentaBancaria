package dev.cuenta;

public abstract class Account {
    protected float balance;
    
    public Account(float balance, float annualRate) {
        this.balance = balance;
    }
    
    public float getBalance() {
        return balance;
    }

@Test
public void whenCreateAccount_thenAnnualRateIsSet() {
    Account account = new Account(1000f, 0.05f) {};
    assertThat(account.getAnnualRate(), is(0.05f));
}
}
