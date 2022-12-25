package Lesson03Git;

public class Task6G {
    private static final int BONUS_POINT = 500;
    private static final int KILL_POINT = 100;
    public static void main(String[] args) {
        int tanksKilledFirstPlayer = 2;
        int tanksKilledSecondPlayer = 4;
        int result1 = KILL_POINT * tanksKilledFirstPlayer;
        int result2 = KILL_POINT * tanksKilledSecondPlayer;
        if (result1 > result2) {
            System.out.println("Player 1: " + (result1 + BONUS_POINT) + ". Player 2: " + result2 + ".");
        } else if (result1 < result2) {
            System.out.println("Player 1: " + result1 + ". Player 2: " + (result2 + BONUS_POINT) + ".");
        } else {
            System.out.println("Player 1: " + result1 + ". Player 2: " + result2 + ".");
        }
    }
}
