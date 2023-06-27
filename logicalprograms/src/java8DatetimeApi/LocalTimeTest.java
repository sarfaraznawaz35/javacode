package java8DatetimeApi;

import java.time.Clock;
import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTimeTest {
    public static void main(String[] args){
        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MIDNIGHT);
        System.out.println(LocalTime.NOON);

        LocalTime localTime1 = LocalTime.from(LocalTime.now());
        System.out.println(localTime1);

        LocalTime localTime2 = LocalTime.now();
        System.out.println(localTime2);

        LocalTime localTime3 = LocalTime.now(Clock.systemDefaultZone());
        System.out.println(localTime3);

        LocalTime localTime4 = LocalTime.now(ZoneId.of("America/Chicago"));
        System.out.println(localTime4);

        LocalTime localTime5 = LocalTime.of(15, 30);
        System.out.println(localTime5);











    }
}
