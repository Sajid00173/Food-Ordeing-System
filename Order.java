package OrderingSystem;
public class Order extends FoodOrdering {
    public static void Order() {

        System.out.print("\nWhich one you want to buy: ");

        choose = input.nextInt();
        if(choose==1){
            System.out.println("\nYou choose Burger");
            System.out.print("How many Burger you want: ");

            quantity = input.nextInt();
            total = total + (quantity*80);

            System.out.println("\nYou want to buy again?");
            System.out.println("Press Y for yes or N for no");

            again = input.next();
            if(again.equalsIgnoreCase("Y")){
                Order();
            }
            else{
                System.out.println("\nTotal Price: " + total);
                System.out.println("\nPlease pay the bill first.");
            }
        }
        else if (choose==2) {

            System.out.println("\nYou choose Chicken Roll");
            System.out.print("How many Rolls you want: ");

            quantity = input.nextInt();
            total = total + (quantity*40);

            System.out.println("\nYou want to buy again?");
            System.out.println("Press Y for yes or N for no");

            again = input.next();
            if(again.equalsIgnoreCase("Y")){
                Order();
            }
            else{
                System.out.println("\nTotal Price: " + total);
                System.out.println("\nPlease pay the bill first.");
            }
        }
        else if (choose==3) {
            System.out.println("\nYou choose Wings");
            System.out.print("How many Wings you want: ");

            quantity = input.nextInt();
            total = total + (quantity*40);

            System.out.println("\nYou want to buy again?");
            System.out.println("Press Y for yes or N for no");

            again = input.next();
            if(again.equalsIgnoreCase("Y")){
                Order();
            }
            else{
                System.out.println("\nTotal Price: " + total);
                System.out.println("\nPlease pay the bill first.");
            }
        }
        else if (choose==4) {
            System.out.println("\nYou choose Pudding");
            System.out.print("How many Puddings you want: ");

            quantity = input.nextInt();
            total = total + (quantity*40);

            System.out.println("\nYou want to buy again?");
            System.out.println("Press Y for yes or N for no");

            again = input.next();
            if(again.equalsIgnoreCase("Y")){
                Order();
            }
            else{
                System.out.println("\nTotal Price: " + total);
                System.out.println("\nPlease pay the bill first.");
            }
        }
        else if(choose==5){
            System.exit(0);
        }
        else {
            System.out.println("Choose 1 to 5 only!");
            Order();
        }

        System.out.println("Paid: ");
        paid = input.nextInt();
        if(paid <= total)
        {
            System.out.println("Please pay the bill first. ");
        }
        else if (paid == total)
        {
            System.out.println("Thank you!\n Your TokenNo is 1 ");
        }
        else if (paid >= total)
        {
            System.out.println("Thank you!\n");
            double exchange = paid - total;
            System.out.println("Your exchange: \n" + exchange);
        }
    }
    public static void main(String[] args) {
        menu();
        Order();
    }
}
