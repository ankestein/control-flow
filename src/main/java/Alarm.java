public class Alarm {
    public static String checkLargerThirty(int people, String alarmLevel) {

        int peopleLimit;
        switch (alarmLevel) {
            case "gelb":
                peopleLimit = 30;
                break;
            case "grün":
                peopleLimit = 60;
                break;
            case "rot":
                peopleLimit = 0;
                break;
            default:
                return "Alarm level unknown.";
        }


        if (people > peopleLimit) {
            return "Zu viele Personen";
        }
        return "Maximale Personenzahl nicht überschritten";
        }
    }


