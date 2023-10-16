/* Shaya Ahmed
 * CP500
 * PA2
*/
public class PA2
{
    public static void main(String[] args)
    {
        int n = 6;        // number of rows
        for(int i=1; i<=n; ++i)    // outter loop starts i = 1 and increments by 1
        {
            for(int j=1; j<=n; j++)   // Inner loop7
            {
                if(i == j)    // if i == j, then do the statements inside the if statement
                {
                    System.out.print(i);  // This will print out what the current i is
                }else         // if i != j, then it the else statement will be executed
                {
                    System.out.print("*"); 
                }
            }
            System.out.println();
        }
    }
}
