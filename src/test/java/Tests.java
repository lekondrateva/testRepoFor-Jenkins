import org.example.Operations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class Tests {

    @Test
    public void firstTest () {
        Assertions.assertEquals(3, Operations.sum(1,2));
    }

    @Test
    public void secondTest () {
        Assertions.assertEquals(2, Operations.sum(1,2));
    }
}
