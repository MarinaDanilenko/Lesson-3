package Lesson03Git;

public class Task2G {
    public static void main(String[] args) {
        int hour = 16;
        if (hour >= 6 && hour <= 11) {
            System.out.println("Good morning!");
        } else if (hour >= 12 && hour <= 17) {
            System.out.println("Good day!");
        } else if (hour >= 18 && hour <= 23) {
            System.out.println("Good evening!");
        } else if (hour >= 0 && hour <= 5) {
            System.out.println("Good night!");
        } else {
            System.out.println("Invalid hour!");
            }
    }
}


