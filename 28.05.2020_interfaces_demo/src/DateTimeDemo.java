import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class DateTimeDemo {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDate date = LocalDate.of(2020, 05, 30);
        System.out.println(date);

        LocalDate minus = date.minus(1, ChronoUnit.YEARS);
        System.out.println(minus);

        String formattedDate = date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.forLanguageTag("ru")));
        System.out.println(formattedDate);

    }

}
