package Lesson03Git;

public class Task9G {
    public static void main(String[] args) {
        int numberFloors = 9;
        int numberApartmentsPerFloor = 4;
        int apartmentNumber = 73;
        double numberApartmentsInPorch = numberApartmentsPerFloor * numberFloors;
        if (apartmentNumber <= numberApartmentsInPorch) {
            System.out.println("Porch number - 1.");
        } else if (apartmentNumber <= numberApartmentsInPorch * 2) {
            System.out.println("Porch number - 2.");
        } else if (apartmentNumber <= numberApartmentsInPorch * 3) {
            System.out.println("Porch number - 3.");
        }
    }
}
