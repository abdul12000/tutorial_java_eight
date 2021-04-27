package java8_pacakge.lambda_package;

import org.junit.Test;

import java.sql.Timestamp;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimePracticeJava8 {
//    @Test
    public void datePractice(){
        //to get local date in a "YYYY/MM/DD" format
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        LocalDate localdate = LocalDate.now();
        System.out.println("local date is : " + dtf.format(localdate));
    }

//    @Test
    public void timePractice(){
        //to get local time in a "HH:mm:ss" format
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime localtime = LocalTime.now();
        System.out.println("local time is : " + dtf.format(localtime));

        Instant now = Instant.now();
        System.out.println("Testing Instant : " + now);

    }

//    @Test
    public void timePractice2(){
        //to print timestamp
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println("Timestamp is :" + timestamp);
    }

//    @Test
    //Period
    public void localDateAndPeriod(){
        //Period - To calculate the difference between 2 LocalDates
      LocalDate from = LocalDate.of(2010, 5, 4);
        LocalDate to = LocalDate.of(2020, 10, 9);
        Period period = Period.between(from, to);
        System.out.print(period.getYears() + " Years,");
        System.out.print(period.getMonths() + " Months,");
        System.out.print(period.getDays() + " Days,");
    }

    @Test
    //duration
    public void localTimeAndDuration(){
        //Period - To calculate the difference between 2 LocalTimes
        LocalDateTime from = LocalDateTime.of(2010, 5, 4,10, 20, 55);
        LocalDateTime to = LocalDateTime.of(2020, 10, 9, 10, 20, 1);
        Duration duration = Duration.between(from, to);
        System.out.print(duration.toDays() + " Days,");
        System.out.print(duration.toHours() + " Hours,");
        System.out.print(duration.toMinutes() + " Minutes,");
        System.out.print(duration.toSeconds() + " Seconds");
    }
}
