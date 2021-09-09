import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AlarmTest {

    @Test
    public void Alarm_yellow_Larger30_returnWarning() {
        //given
        int people = 31;
        String alarmLevel = "gelb";

        //when
        String result = Alarm.checkLimit(people, alarmLevel);

        //then
        Assertions.assertEquals("Zu viele Personen", result);
    }

    @Test
    public void Alarm_yellow_SmallerEqual30_returnOK() {
        //given
        int people = 29;
        String alarmLevel = "gelb";

        //when
        String result = Alarm.checkLimit(people, alarmLevel);

        //then
        Assertions.assertEquals("Maximale Personenzahl nicht überschritten", result);
    }

    @Test
    public void Alarm_yellow_30_returnOK(){
        //given
        int people = 30;
        String alarmLevel = "gelb";

        //when
        String result = Alarm.checkLimit(people, alarmLevel);

        //then
        Assertions.assertEquals("Maximale Personenzahl nicht überschritten", result);
    }

    @Test
    public void Alarm_green_Larger60_returnWarning() {
        //given
        int people = 61;
        String alarmLevel = "grün";

        //when
        String result = Alarm.checkLimit(people, alarmLevel);

        //then
        Assertions.assertEquals("Zu viele Personen", result);
    }

    @Test
    public void Alarm_green_SmallerEqual60_returnOK() {
        //given
        int people = 59;
        String alarmLevel = "grün";

        //when
        String result = Alarm.checkLimit(people, alarmLevel);

        //then
        Assertions.assertEquals("Maximale Personenzahl nicht überschritten", result);
    }

    @Test
    public void Alarm_green_60_returnOK(){
        //given
        int people = 60;
        String alarmLevel = "grün";

        //when
        String result = Alarm.checkLimit(people, alarmLevel);

        //then
        Assertions.assertEquals("Maximale Personenzahl nicht überschritten", result);
    }

    @Test
    public void Alarm_red_LargerZero_returnWarning() {
        //given
        int people = 1;
        String alarmLevel = "rot";

        //when
        String result = Alarm.checkLimit(people, alarmLevel);

        //then
        Assertions.assertEquals("Zu viele Personen", result);
    }

    @Test
    public void Alarm_red_Zero_returnOK(){
        //given
        int people = 0;
        String alarmLevel = "rot";

        //when
        String result = Alarm.checkLimit(people, alarmLevel);

        //then
        Assertions.assertEquals("Maximale Personenzahl nicht überschritten", result);
    }

    @Test
    public void Alarm_unknownAlarmLevel_returnUnknown(){
        //given
        int people = 31;
        String alarmLevel = "blau";

        //when
        String result = Alarm.checkLimit(people, alarmLevel);

        //then
        Assertions.assertEquals("Alarm level unknown.", result);
    }


}
