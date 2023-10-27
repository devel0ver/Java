import java.util.Scanner;
public class Even_Odd
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int input;
        System.out.print("Please enter an integer: ");
        input = console.nextInt();

        if(num % 2 == 0)
            System.out.println("Divisible by 2");

        if(num % 3 == 0)
            System.out.println("Divisible by 3");
        if(num % 5 == 0)
            System.out.println("Divisible by 5");
    }
}