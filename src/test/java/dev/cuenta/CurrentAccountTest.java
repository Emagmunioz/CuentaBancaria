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

}
