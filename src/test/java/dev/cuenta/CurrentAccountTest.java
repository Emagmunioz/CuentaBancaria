package dev.cuenta;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
public class CurrentAccountTest {
    @Test
    public void whenCreateCurrentAccount_thenOverdraftIsZero() {
        CurrentAccount account = new CurrentAccount(1000f, 0.05f);
        assertThat(account.getOverdraft(), is(0f));
    }

@Test
public void whenWithdrawBeyondBalance_thenOverdraftIncreases() {
    CurrentAccount account = new CurrentAccount(1000f, 0.05f);
    account.withdraw(1500f);
    assertThat(account.getBalance(), is(0f));
    assertThat(account.getOverdraft(), is(500f));
}

@Test
public void whenDepositWithOverdraft_thenReducesOverdraft() {
    CurrentAccount account = new CurrentAccount(1000f, 0.05f);
    account.withdraw(1500f);
    account.deposit(300f);
    assertThat(account.getOverdraft(), is(200f));
    assertThat(account.getBalance(), is(0f));
}

}
