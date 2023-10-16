public class Ascii_Art
{
    public static final int Size = 5;
    public static void main(String[] args)
    {
        for(int line = 1; line <= Size; line++)
        {
            System.out.print("|");
            // Print spaces
            for(int i = 1; i <= -2 * line + 2 * Size; i++)
                System.out.print(" ");

            System.out.print("<>");
            // Print dots
            for(int j = 0; j < 4 * line - 4; j++){
                System.out.print(".");
            }

            System.out.print("<>");
            // Print spaces
            for(int i = 1; i <= -2 * line + 2 * Size; i++)
                System.out.print(" ");

            System.out.println("|");
            // go to newline
        }
    }
}