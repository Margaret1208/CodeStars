package Day4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Locale;

public class Cale {
    public static void main(String[] args) {
        String Start = "2023-09-01";
        String End = "2023-10-01";

        LocalDate startDate = LocalDate.parse(Start);
        LocalDate endDate = LocalDate.parse(End);

        Long time  ;
        Long range = ChronoUnit.DAYS.between(startDate,endDate);
        System.out.println(range);

        int cal = Calendar.SATURDAY;
//        cal.set();
//        DateFormat formatter = new SimpleDateFormat("EEEE", Locale.getDefault());
//        System.out.println(formatter.format(cal.getTime()));
    }
}