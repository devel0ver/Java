package orders_items;

public class TestOrders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Menu items
		Item item1 = new Item();
		item1.name = "mocha";
		item1.price = 4.57;
	    
		Item item2 = new Item();
		item2.name = "latte";
		item2.price = 3.89;
		
		Item item3 = new Item();
		item3.name = "drip coffee";
		item3.price = 2.99;
		
		Item item4 = new Item();
		item4.name = "capuccino";
		item4.price = 5.01;
		
        // Order variables -- order1, order2 etc.
		Order order1 = new Order();
		order1.name = "Cindhuri";
		
		
		Order order2 = new Order();
		order2.name = "Jimmy";
		
		Order order3 = new Order();
		order3.name = "Noah";
		
		Order order4 = new Order();
		order4.name = "Sam";
    
        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
	}

}
