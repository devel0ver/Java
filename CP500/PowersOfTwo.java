import java.util.Scanner;
public class PowersOfTwo
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        int num;
        System.out.print("Please enter an integer: ");
        num = console.nextInt();
        printPowerOf2(num);
    }
    public static void printPowerOf2(int q)
    {
        int wholeNum = 1;
        for(int i = 0; i <= q; i++){
            System.out.print(wholeNum + " ");
            wholeNum = wholeNum * 2;
        }
        System.out.println();
    }
}