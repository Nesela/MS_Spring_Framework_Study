package di06.factory;

import java.time.DayOfWeek;
import java.time.LocalDate;

public abstract class WeekDay {
    public abstract String dayInfo();

    // Factory Method
    public static WeekDay getInstance() {
        DayOfWeek today = LocalDate.now().getDayOfWeek();

        return switch (today) {
            case SUNDAY -> new Sunday();
            case MONDAY -> new Monday();
            case TUESDAY -> new Tuesday();
            case WEDNESDAY -> new Wednesday();
            case THURSDAY -> new Thursday();
            case FRIDAY -> new Friday();
            case SATURDAY -> new Saturday();
        };
    }
}
