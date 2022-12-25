package Lesson03Git;

public class Task7G {
    public static void main(String[] args) {
        int year = 1995;
        boolean leapYear = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0 );
        if (leapYear == true) {
            System.out.println(year + " is leap year!");
        } else {
            System.out.println(year + " is not leap year!");
        }
    }
}
