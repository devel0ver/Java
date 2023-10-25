// import java.util.Scanner;

public class Scanners
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        
        System.out.print("How old are you? ");
        String age = console.nextInt();
        System.out.printf("\nYou are %s years old\n", typeOf(age));


        // Scanner input = new Scsanner(System.in);
        // double area, radius;
        // System.out.print("Please enter the radius of a circle: ");
        // radius = input.nextDouble();
        
    }
}