/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

/*
 * The Java 8 Date/Time API consists of package java.time and its subpackages.
 * We will cover packages and imports in Session 7.
 * For the purposes of this lab, we give you a few wildcarded imports,
 * so you can use the classes in these packages without having to worry about importing them.
 */
import java.text.DateFormat;
import java.time.*;
import java.time.format.*;

class DateTimeTest {

    /**
     * main() calls each of the test methods in turn (currently commented out).
     * To run one test method at a time, uncomment the call to the one you want to execute.
     */
    public static void main(String[] args) {
         testNow();
         testCreate();
         testParse();
         testFormat();
    }

    /**
     * TASK: create current date, time, and date-time via now() and then print them.
     */
    public static void testNow() {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
    }

    /**
     * TASK: implement the TODOs and print your results.
     */
    public static void testCreate() {
        System.out.println(DayOfWeek.from(LocalDate.of(1988, 07, 21)));
        System.out.println(LocalDateTime.of(1969, 07, 20, 15, 18));

    }

    /**
     * TASK: implement the TODOs and print your results.
     */
    public static void testParse() {
        // TODO: create your birthday by parsing a text representation in standard format ("yyyy-MM-dd").
        System.out.println(LocalDate.parse("1988-07-21"));
        // OPTIONAL: now create it by parsing text in the form "2/6/2014" (this is Feb 6, not Jun 2).
        LocalDate.parse("07/21/1988", DateTimeFormatter.ofPattern("M/d/yyyy"));
    }

    /**
     * TASK: create formatted display strings for the date below, in the specified formats.
     */
    public static void testFormat() {
        LocalDate hastings = LocalDate.of(1066, 10, 14);
        DateTimeFormatter usDateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
        System.out.println(usDateFormat.format(LocalDate.of(1066, 10, 14)));
        DateTimeFormatter intlFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(intlFormat.format(LocalDate.of(1066, 10, 14)));

        // OPTIONAL: October 14, 1066
        DateTimeFormatter longFormat = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        System.out.println(longFormat.format(hastings));
    }
}