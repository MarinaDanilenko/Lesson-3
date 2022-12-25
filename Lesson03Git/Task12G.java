package Lesson03Git;

public class Task12G {
    public static void main(String[] args) {
        int day = 12;
        int month = 12;
        if ((day <= 21 && month <= 3) || (day <= 20 && month <= 4)) {
            System.out.println("Zodiak sign - Ram.");
        } else if ((day <= 23 && month <= 7) || (day <= 22 && month <= 8)) {
            System.out.println("Zodiak sign - Lion.");
        } else if ((day <= 23 && month <= 11) || (day <= 21 && month <= 12)) {
            System.out.println("Zodiak sign - Archer.");
        }
    }
}
