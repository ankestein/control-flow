import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AlarmParamTest {

    @ParameterizedTest
    @CsvSource({
            "rot, 30, Zu viele Personen",
            "rot, 0, Maximale Personenzahl nicht überschritten",
            "gelb, 31, Zu viele Personen",
            "gelb, 29, Maximale Personenzahl nicht überschritten",
            "grün, 61, Zu viele Personen",
            "grün, 59, Maximale Personenzahl nicht überschritten",
            "blau, 5, Alarm level unknown."
    })
public void checkAloowedNumberOfPeople(String alarmLevel, int people, String expected) {
        //When
        String actual = Alarm.checkLimit(people, alarmLevel);
        //Then
        Assertions.assertEquals(expected, actual);
    }
}
