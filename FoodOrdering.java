package OrderingSystem;

import java.util.Scanner;

public class FoodOrdering {
    public static Scanner input = new Scanner(System.in);
    public static String again;
    public static int choose, quantity=1;
    public static double total=0;
    public static void menu(){
        System.out.println("\t\t\tMenu\t\t");
        System.out.println("\t\t1. Burger         80Tk\t\t");
        System.out.println("\t\t2. Chicken Roll   40Tk\t\t");
        System.out.println("\t\t3. Wings(6p)      90Tk\t\t");
        System.out.println("\t\t4. Pudding        25Tk\t\t");
        System.out.println("\t\t5. Cancel\t\t");
        System.out.println("--------------------------------------\t\t");

    }

}
