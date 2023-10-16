public class PrintDesign
{
    public static void main(String[] args)
    {
        printD();
    }
    public static void printD()
    {
        for(int line = 1; line <= 5; line++)
        {
            for(int i = 1; i <= (-1*line+6); i++) // Print "-"
                System.out.print("-");
            for(int i = 1; i <= (2*line-1); i++) // Print numbers
                System.out.print(2*line-1);
            for(int i = 1; i <= (-1*line+6); i++) // Print "-"
                System.out.print("-");
            System.out.println();
        }
    }
}

/*
 * y = -1 * line + 6
 * line | # of "-" | -1*line|
 * --------------------------
 *   1  |   5  -1  |  -1 + 6|  So it can equal to the # of "-"
 *   2  |   4  -1  |  -2 + 6|
 *   3  |   3  -1  |  -3 + 6|
 *   4  |   2  -1  |  -4 + 6|
 *   5  |   1  -1  |  -5 + 6|
 */