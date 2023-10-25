import java.util.Scanner;

public class SumNumber
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int low, high, sum = 0;
        System.out.print("Low? ");
        low = console.nextInt();
        System.out.print("High? ");
        high = console.nextInt();
        for(int i = low; i <= high; i++)
        {
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}