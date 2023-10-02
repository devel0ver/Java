/* Shaya Ahmed
 * CP500
 * PA2
*/
public class PA2
{
    public static void main(String[] args)
    {
        int n = 6;        // number of rows
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if(i == j)
                {
                    System.out.print(i);
                }else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
