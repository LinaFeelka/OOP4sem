import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class lab12 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(1995, 03, 15);

        int age = Period.between(birthDate, today).getYears();

        LocalDate nextBirthday = birthDate.withYear(today.getYear());
        if (nextBirthday.isBefore(today) || nextBirthday.equals(today)) {
            nextBirthday = nextBirthday.plusYears(1);
        }
         long daysToBirthday = ChronoUnit.DAYS.between(today, nextBirthday);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String formToday = today.format(formatter);
        String formBirthDayDate = birthDate.format(formatter);

        System.out.println("Сегодня: " + formToday);
        System.out.println("Дата рождения: " + formBirthDayDate);
        System.out.println("Возраст: " + age + " лет");
        System.out.println("Дней до дня рождения: " + daysToBirthday);
    }
}
