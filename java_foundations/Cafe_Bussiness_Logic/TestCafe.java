import java.util.ArrayList;

public class TestCafe {
    public static void main(String[] args) {
        CafeUtil admin = new CafeUtil();

        int purchases = 10;
        int sum = admin.getStreakGoal(purchases);
        System.out.println("\n--------- Streak Goal Test --------");
        System.out.println(String.format("Purchases needed by week %s: %s\n", purchases, sum));

        double[] prices = {21.05, 15.60};
        double totalPrice = admin.getOrderTotal(prices);
        System.out.println("-------- Order Total Test--------");
        System.out.println(String.format("Your total is: %s\n", totalPrice));


        System.out.println("-------- Display Menu Items ----------");
        ArrayList<String> items = new ArrayList<String>();
        items.add("Drip Coffee");
        items.add("Latte");
        items.add("Cappuccino");
        items.add("Mocha");
        admin.displayMenu(items);

        System.out.println("--------- Add Customer Test -----------");
        ArrayList<String> usernames = new ArrayList<String>();
        for (int i = 0; i < 4; i++) {
            System.out.println("Please enter your name: ");
            admin.addCustomer(usernames);
            System.out.println("\n");
        }
    }
}
