package java8DatetimeApi;

import java.time.Clock;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateTest {
    public static void main(String[] args){

       // LocalDateDemo1();
        LocalDate localDate1 = LocalDate.now();
        System.out.println(localDate1);
        LocalDate localDate2 = LocalDate.of(2023, Month.MAY, 01);
        System.out.println(localDate2);
        System.out.println("Checking localDate1 comes after localDate2 or Not: ");
        System.out.println(localDate1.isAfter(localDate2));
        System.out.println("Checking localDate1 comes before localDate2 or Not: ");
        System.out.println(localDate1.isBefore(localDate2));
        System.out.println("Checking equality of the two dates: ");
        boolean equalityResult = localDate1.isEqual(localDate2);
        System.out.println(equalityResult);

        System.out.println("Year: " + localDate1.getYear());
        System.out.println("Month: " + localDate1.getMonthValue());
        System.out.println("Day of month: " + localDate1.getDayOfMonth());
        System.out.println("Day of Week: " + localDate1.getDayOfWeek());

        System.out.println("Adding 2 days in above date: ");
        LocalDate localDate3 = localDate2.plus(2, ChronoUnit.DAYS);
        System.out.println(localDate3);

        System.out.println("Adding 2 years in above date: ");
        LocalDate localDate4 = localDate2.plus(2, ChronoUnit.YEARS);
        System.out.println(localDate4);

    }

    private static void LocalDateDemo1() {
        LocalDate localDate1 = LocalDate.from(LocalDate.now());
        System.out.println(localDate1);

        LocalDate localDate2 = LocalDate.now();
        System.out.println(localDate2);

        LocalDate localDate3 = LocalDate.now(Clock.systemUTC());
        System.out.println(localDate3);

        LocalDate localDate4 = LocalDate.now(ZoneId.of("America/Chicago"));
        System.out.println(localDate4);

        LocalDate localDate5 = LocalDate.of(2023, Month.MAY, 02);
        System.out.println(localDate5);

        LocalDate localDate6 = LocalDate.ofEpochDay(0);
        System.out.println(localDate6);

        LocalDate localDate7 = LocalDate.ofYearDay(2021, 156);
        System.out.println(localDate7);

        LocalDate localDate8 = LocalDate.parse("2023-05-02");
        System.out.println(localDate8);

        LocalDate localDate9 = LocalDate.parse("2023-05-02", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(localDate9);
    }
}
