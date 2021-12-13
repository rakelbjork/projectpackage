package e_dateandtime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateAndTime {

    public static void main(String[] args) {
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("yyyy.MM.dd hh:mm zzz");

        System.out.println("Skriv in ett datum YYYY-MM-DD");
        String date = new Scanner(System.in).nextLine();
        System.out.println("Skriv in en tid HH:MM");
        String time = new Scanner(System.in).nextLine();

        LocalDate ld = LocalDate.parse(date);
        LocalTime lt = LocalTime.parse(time);
        System.out.println("Vilken tidszon befinner du dig i?");
        System.out.println("Exempel på giltiga inputs:");
        System.out.println("Europe/Paris | Asia/Tokyo | Pacific/Midway");
        String regionLocal = new Scanner(System.in).nextLine();
        System.out.println("Vilken tidszon vill du översätta till?");
        System.out.println("Samma zoner som ovan gäller");
        String regionOther = new Scanner(System.in).nextLine();

        LocalDateTime localDateTime =  LocalDateTime.of(ld, lt);
        System.out.println("Datumet du skrev in " + localDateTime);
        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(localDateTime, ZoneId.of(regionLocal));
        ZonedDateTime zonedDateTime2 = ZonedDateTime.of(localDateTime, ZoneId.of(regionOther));
        Duration duration = Duration.between(zonedDateTime2, zonedDateTime1);
        String hourDuration = String.format("%d", duration.toHours());
        System.out.println("Skillnaden i timmar är " + hourDuration);

    }
}
