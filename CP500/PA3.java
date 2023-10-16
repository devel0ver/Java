/* Shaya Ahmed
 * CP500
 * PA3
*/
public class PA3 
{
    public static void main(String[] args)
    {
        printSquare(1,5);
        printSquare(3, 9); 
        printSquare(0, 3);
        printSquare(5, 5);
        
    }
    public static void printSquare(int min, int max)
    {
        for(int i = min; i <= max; i++)  // Prints the number of rows
        {
            for(int l = i; l <= max; l++) // Prints the Left side of the last digit
                System.out.print(l);      // When i = 1, l prints from 1 till max. When i = 2, l prints from 2 till max
            for(int r = min; r < i; r++)  // Prints the right side of the last digit
                System.out.print(r);      // r = 1, when i = 1, so r is not less than i. i increments to 2, and r stays eqaul to 1, so it prints from 1 to 2. And it goes on till i = max.
            System.out.println();
        }
        System.out.println();
    }
}
