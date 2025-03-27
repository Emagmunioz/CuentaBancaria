package dev.cuenta;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
public class AccountTest {

 @Test
    public void whenCreateAccount_thenInitialBalanceIsSet() {
        Account account = new Account(1000f, 0.05f) {};
        assertThat(account.getBalance(), is(1000f));
    }
    @Test
public void whenCreateAccount_thenAnnualRateIsSet() {
    Account account = new Account(1000f, 0.05f) {};
    assertThat(account.getAnnualRate(), is(0.05f));
}
@Test
public void whenDepositAmount_thenBalanceIncreases() {
    Account account = new Account(1000f, 0.05f) {};
    account.deposit(500f);
    assertThat(account.getBalance(), is(1500f));
}
}
