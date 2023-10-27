import java.util.Scanner;
public class Even_Odd
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int input;
        System.out.print("Please enter an integer: ");
        input = console.nextInt();
        if(input%2 == 0)
            System.out.println(input + " is even");
        else
            System.out.println(input + " is odd");
    }
}