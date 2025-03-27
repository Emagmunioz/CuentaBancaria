package dev.cuenta;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
public class SavingsAccountTest {

 @Test
    public void whenBalanceAboveMinimum_thenAccountIsActive() {
        SavingsAccount account = new SavingsAccount(10000f, 0.05f);
        assertThat(account.isActive(), is(true));
    }

@Test
public void whenDepositInActiveAccount_thenBalanceIncreases() {
    SavingsAccount account = new SavingsAccount(10000f, 0.05f);
    account.deposit(500f);
    assertThat(account.getBalance(), is(10500f));
} 

@Test
public void whenDepositInInactiveAccount_thenNoChange() {
    SavingsAccount account = new SavingsAccount(9999f, 0.05f);
    account.deposit(500f);
    assertThat(account.getBalance(), is(9999f));
}  
@Test
public void whenWithdrawFromActiveAccount_thenBalanceDecreases() {
    SavingsAccount account = new SavingsAccount(10000f, 0.05f);
    account.withdraw(2000f);
    assertThat(account.getBalance(), is(8000f));
}
}
