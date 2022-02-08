import java.util.ArrayList;

public class CafeUtil {
    public int getStreakGoal(int numWeeks){
        int num = 0;
        for(int i = 0; i < numWeeks+1; i++){
            num += i;
        }
        return num;
    }
    public double getOrderTotal(double[] prices){
        double total = 0;
        for (int i = 0; i<prices.length; i++){
            total += prices[i];
        }
        return total;
    }
    public void displayMenu(ArrayList<String> menuItems){
        for (int i = 0; i<menuItems.size(); i++){
            System.out.println(String.format("%s %s", i, menuItems.get(i)));
        }
    }
    public void addCustomer(ArrayList<String> customers){
        String userName = System.console().readLine();
        System.out.println(String.format("Hello, %s. There are %s people ahead of you.", userName, customers.size()));
        customers.add(userName);
        System.out.println(customers);
    }
}
