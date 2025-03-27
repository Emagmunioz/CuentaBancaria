package dev.cuenta;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
public class AccoutTest {

 @Test
    public void whenCreateAccount_thenInitialBalanceIsSet() {
        Account account = new Account(1000f, 0.05f) {};
        assertThat(account.getBalance(), is(1000f));
    }
}
