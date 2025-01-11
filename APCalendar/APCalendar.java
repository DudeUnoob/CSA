package APCalendar;

public class APCalendar {
    private static boolean isLeapYear(int year) {
        return true;
    }

    public static int numberOfLeapYears(int year1, int year2) {
        int count = 0;                          
        for (int i = year1; i <= year2; i++) { 
            if (isLeapYear(i)) {                
                count++;                         
            }
        }
        return count;                           
    }

    private static int firstDayOfYear(int year) {
        return 0;
    }

    private static int dayOfYear(int month, int day, int year) {
        return 0;
    }

    public static int dayOfWeek(int month, int day, int year) {
        int dayToStart = firstDayOfYear(year);
        int nthDay = dayOfYear(month, day, year);
        int finalDay = (startDay + nthDay - 1) % 7;
        return finalDay;
    }
}
