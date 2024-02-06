package calendar;

import java.time.LocalDate;
import java.util.Arrays;

public class Calendar {
    private static final String THREE_SPACES = "   ";
    private static final String TWO_SPACES = "  ";
    private static final String ONE_SPACE = " ";
    private static final int DAYS_IN_WEEK = 7;
    private static final int NUMBER_OFLINES = 8;

    public static String createCalendar(LocalDate date) {
        String[][] calendar = new String[NUMBER_OFLINES][DAYS_IN_WEEK];
        for (var i = 0; i < DAYS_IN_WEEK; i++) {
            calendar[0] = new String[]{
                WeekDaysShort.MON.name(),
                WeekDaysShort.TUE.name(),
                WeekDaysShort.WED.name(), 
                WeekDaysShort.THU.name(), 
                WeekDaysShort.FRI.name(), 
                WeekDaysShort.SAT.name(), 
                WeekDaysShort.SUN.name()
            };
        }

        
        int currentDayOfWeek = switch (LocalDate.of(date.getYear(), date.getMonthValue(), 1).getDayOfWeek()) {
            case MONDAY -> 0;
            case TUESDAY -> 1;
            case WEDNESDAY -> 2;
            case THURSDAY -> 3;
            case FRIDAY -> 4;
            case SATURDAY -> 5;
            case SUNDAY -> 6;
        };

        
        for (var i = 0; i < currentDayOfWeek; i++) {
            calendar[2][i] = THREE_SPACES;
        }

        String[] calendarLines = new String[NUMBER_OFLINES];
        calendarLines[0] = date.getMonth().toString();
        calendarLines[1] = String.join(ONE_SPACE, calendar[0]);
        
        int currentWeek = 2;
        int monthLength = date.lengthOfMonth();
        for (var currentDay = 1; currentDay <= monthLength; currentDay++) {
            calendar[currentWeek][currentDayOfWeek] = (currentDay < 10 ? TWO_SPACES : ONE_SPACE) + String.valueOf(currentDay);
            
            if (currentDayOfWeek == 6) {
                calendarLines[currentWeek] = String.join(ONE_SPACE, calendar[currentWeek]);
                currentDayOfWeek = 0;
                currentWeek++;
                continue;
            } else  if (currentDay == monthLength && currentDayOfWeek < 6) {
                currentDayOfWeek++;
                for (var i = currentDayOfWeek; i <= 6; i++) {
                    calendar[currentWeek][i] = THREE_SPACES;
                }
                calendarLines[currentWeek] = String.join(ONE_SPACE, calendar[currentWeek]);
                continue;
            }

            currentDayOfWeek++;
        }

        int calendarLength = calendarLines.length;

        for (var line = 0; line < calendarLines.length; line++) {
            if (calendarLines[line] == null) {
                calendarLength = line;
                break;
            }
        }

        String dayOfMonth = String.valueOf(date.getDayOfMonth());
        String currentDay = String.format("  %s ", dayOfMonth);
        String currentDayMarked = String.format(" *%s ", dayOfMonth);

        return String.join("\n", Arrays.copyOf(calendarLines, calendarLength)).replace(currentDay, currentDayMarked);
    }

    private enum WeekDaysShort {
        MON, TUE, WED, THU, FRI, SAT, SUN
    }
}
