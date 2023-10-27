import java.util.Scanner;
public class PA4
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        String input;
        double min, cost = 0;
        System.out.print("\nPackage A: For $39.99 per month 450 minutes are provided. Additional minutes are $0.45 per minute.\n" +
                        "Package B: For $59.99 per month 900 minutes are provided. Additional minutes are $0.40 per minute.\n" +
                        "Package C: For $69.99 per month unlimited minutes provided.\n" +
                        "Please enter the package(A,B,C) you purchased: ");
        input = console.next();
        System.out.print("How many minutes were used? ");
        min = console.nextDouble();
        if (input.equals("A"))
        {
            if (min <= 450)
                cost = 39.99;
            else
                cost = 39.99 + ((min - 450) * 0.45);
        }
        else if (input.equals("B"))
        {
            if (min <= 900)
                cost = 59.99;
            else
                cost = 59.99 + ((min - 900) * 0.40);
        }
        else if (input.equals("C"))
            cost = 69.99;
        else
            System.out.println("Please enter a valid package!");
        
        System.out.println("The amount due is $" + cost);
    }
}