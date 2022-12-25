package Lesson03Git;

public class Task8G {
    public static void main(String[] args) {
        int damage = 100;
        String typeMob = "SAINT";
        boolean hasHolyAttribute = true;
        if (typeMob.equals("UNDEAD") || typeMob.equals("ZOMBIE")) {
            System.out.println("Total damage = " + (damage * 1.5));
        } else if (typeMob.equals("SAINT")) {
            System.out.println("Total damage = " + (damage / 2));
        } else {
            System.out.println("Total damage = " + damage);
        }
    }
}
