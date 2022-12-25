package Lesson03Git;

public class Task3G {
    public static void main(String[] args) {
        int currentHealthPoint = 10;
        int maxHealthPoint = 100;
        if (currentHealthPoint < 25) {
            System.out.println("RED");
        } else if (currentHealthPoint < 50) {
            System.out.println("ORANGE");
        } else if (currentHealthPoint < 75) {
            System.out.println("YELLOW");
        } else if (currentHealthPoint <= 100) {
            System.out.println("GREEN");
        }
    }
}
