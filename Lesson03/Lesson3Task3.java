package Lesson03;

public class Lesson3Task3 {
    public static void main(String[] args) {
        int currentHour = 25;
        if (currentHour >= 6 && currentHour <= 12) {
            System.out.println("Доброе утро!");
        } else if (currentHour > 12 && currentHour <= 18) {
            System.out.println("Добрый день!");
        } else if (currentHour > 18 && currentHour <= 24) {
            System.out.println("Добрый вечер!");
        } else if (currentHour >= 0 && currentHour < 6){
            System.out.println("Доброй ночи!");
        } else {
            System.out.println("Неверное время!");
        }
    }
}
