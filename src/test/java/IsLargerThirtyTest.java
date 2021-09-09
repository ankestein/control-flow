import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsLargerThirtyTest {

    @Test
    public void testLargerThirty() {
        //given
        int people = 35;

        //when
        String result = IsLargerThirty.checkLargerThirty(people);

        //then
        Assertions.assertEquals("Zu viele Personen", result);
    }

    @Test
    public void testSmallerThirty() {
        //given
        int people = 20;

        //when
        String result = IsLargerThirty.checkLargerThirty(people);

        //then
        Assertions.assertEquals("Maximale Personenzahl nicht überschritten", result);
    }



}
