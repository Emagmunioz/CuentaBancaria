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
}
