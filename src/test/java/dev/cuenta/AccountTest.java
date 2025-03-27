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
@Test
public void whenDeposit_thenDepositCounterIncreases() {
    Account account = new Account(1000f, 0.05f) {};
    account.deposit(500f);
    assertThat(account.getNumberOfDeposits(), is(1));
}
// Agregar a AccountTest.java
@Test
public void whenWithdrawAmount_thenBalanceDecreases() {
    Account account = new Account(1000f, 0.05f) {};
    account.withdraw(500f);
    assertThat(account.getBalance(), is(500f));
}

@Test
public void whenWithdrawExceedsBalance_thenNoChange() {
    Account account = new Account(1000f, 0.05f) {};
    account.withdraw(1500f);
    assertThat(account.getBalance(), is(1000f));
    assertThat(account.getNumberOfWithdrawals(), is(0));
}
@Test
public void whenCalculateInterest_thenBalanceIncreases() {
    Account account = new Account(1000f, 0.12f) {}; 
    account.calculateInterest();
    assertThat((double)account.getBalance(), closeTo(1010.0, 0.001));
}
@Test
public void whenMonthlyStatement_thenAppliesFeeAndInterest() {
    Account account = new Account(1000f, 0.12f) {};
    account.setMonthlyFee(50f);
    account.monthlyStatement();
    assertThat((double)account.getBalance(), closeTo(959.5f, 0.1f)); // 1000-50=950 + 1% interest
}

@Test
public void whenPrint_thenReturnsAccountDetails() {
    Account account = new Account(1000f, 0.05f) {};
    String result = account.print();
    assertThat(result, containsString("Balance: 1000.0"));
    assertThat(result, containsString("Annual Rate: 5.0%"));
}

}
