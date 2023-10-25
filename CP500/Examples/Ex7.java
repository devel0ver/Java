import java.util.Scanner;
public class Ex7
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int input, total;
        System.out.print("Please enter a POSITIVE integer: ");
        input = console.nextInt();
        total = sumTo(input);
        System.out.printf("The sum of integers from 1 to %s is %s\n", input, total);
    }
    public static int sumTo(int positiveNum)
    {
        int sum = 0;
        for(int i = 1; i <= positiveNum; i++)
        {
            sum += i;
        }
        return sum;
    }
}