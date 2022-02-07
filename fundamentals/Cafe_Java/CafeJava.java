import java.text.DecimalFormat;

public class CafeJava {
    public static void main(String[] args) {
         // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        String newTotalMessage = "Your new total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCofee = 4.50;
        double latte = 5.32;
        double cappuccino = 4.85;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println("\n" + generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        if (isReadyOrder1 == false){
            System.out.println(customer1 + pendingMessage + "\n");
        }else{
            System.out.println(customer1 + readyMessage);
            String formattedPrice = String.format("%.2f", (dripCofee + mochaPrice));
            System.out.println(displayTotalMessage + formattedPrice + "\n");
        }
        // Customer 2 : Sam 
        System.out.println(generalGreeting + customer2);
        if (isReadyOrder2 == false){
            System.out.println(customer2 + pendingMessage + "\n");
        }else{
            System.out.println(customer2 + readyMessage);
            System.out.println(displayTotalMessage + (latte + latte) + "\n");
        }
        // Customer 3 : Jimmy
        System.out.println(generalGreeting + customer3);
        if (isReadyOrder3 == false){
            System.out.println(customer3 + pendingMessage + "\n");
        }else{
            System.out.println(customer3 + readyMessage);
            String formattedPrice = String.format("%.2f", (latte - dripCofee));
            System.out.println(newTotalMessage + formattedPrice + "\n");
        }
        // Customer 4 : Noah
        System.out.println(generalGreeting + customer4);
        if (isReadyOrder4 == false){
            System.out.println(customer4 + pendingMessage + "\n");
        }else{
            System.out.println(customer4 + readyMessage);
            System.out.println(displayTotalMessage + cappuccino + "\n");
        }
    }
}
