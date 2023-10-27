import java.util.Scanner;
public class Calculator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int choice;
        double area;

        System.out.println("Geometry Calculator");
        System.out.println("\t1. Calculate the Area of a Circle");
        System.out.println("\t2. Calculate the Area of a Rectangle");
        System.out.println("\t3. Calculate the Area of a Triangle");
        System.out.println("\t4. Quit");
        System.out.println("\tEnter your choice (1-4): ");

        choice = input.nextInt();

        if(choice == 1){
            double radius;
            System.out.print("Please enter the radius of a circle: ");
            radius = input.nextDouble();
            area = Math.PI*
        }
    }
}