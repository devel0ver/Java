public class HelloWorld{
    //the entry point to our applocation is called the main method
    public static void main(String[] args){

        String name = "Lebron";

        // primitive type of "int". Primitive types contain the minimum requirements to store the variable as an integer. No other built in features are available. The benefit of this is that it takes up less memory. The down side is it has less built in functions available 
        int numberOfChampionships = 5;

        //Integer is an object type. Different 
        Integer jerseyNumber = 23;

        System.out.println("Hello world!");
        System.out.printf("How is it going %s? Your jersey number is: %s\n", name, jerseyNumber);
        // System.out.println("You have this many championships: " + numberOfChampionships );
        System.out.println("Hope the algos were more clear after the explanation!");

        if(numberOfChampionships >= 6){
            System.out.println("Oh so you think you like MIKE!");
        }else if(numberOfChampionships == 5){
            System.out.println("ALMOST LIKE MIKE!!");
        }else{
            
        }

    }
}