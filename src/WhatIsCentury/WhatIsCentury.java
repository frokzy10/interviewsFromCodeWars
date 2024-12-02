package WhatIsCentury;
import java.time.LocalDateTime;

public class WhatIsCentury {
    public static void main(String[] args) {
        System.out.println(whatCentury(2000));
    }
    public static String whatCentury(int year) {
        int century = (year % 100 == 0) ? (year / 100) : (year / 100) + 1;

        if (century % 100 >= 11 && century % 100 <= 13) {
            return century + "th";
        }

        return switch (century % 10) {
            case 1 -> century + "st";
            case 2 -> century + "nd";
            case 3 -> century + "rd";
            default -> century + "th";
        };
    }
}
