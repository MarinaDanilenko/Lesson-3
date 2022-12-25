package Lesson03Git;

public class Task10G {
    public static void main(String[] args) {
        int firstFuelReserves = 100;
        int secondFuelReserves = 50;
        int thirdFuelReserves = 70;
        if (firstFuelReserves < secondFuelReserves && firstFuelReserves < thirdFuelReserves) {
            System.out.println(" First fuel station.");
        } else if (secondFuelReserves < firstFuelReserves && secondFuelReserves < thirdFuelReserves) {
            System.out.println(" Second fuel station.");
        } else if (thirdFuelReserves < firstFuelReserves && thirdFuelReserves < secondFuelReserves) {
            System.out.println(" Third fuel station.");
        } else {
            System.out.println(" First fuel station.");
        }
    }
}
