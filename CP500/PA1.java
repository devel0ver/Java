/* Shaya Ahmed
 * CP500
 * PA1
 */
public class PA1
{
    public static void main(String[] args)
    {
        head();
        body();
        US();
        body();
        head();
    }
    public static void head()
    {
        System.out.println("\t/\\ \t /\\");
        System.out.println("       /  \\     /  \\");
        System.out.println("      /    \\   /    \\");
    }
    public static void body()
    {
        System.out.println("     +------+ +------+");
        System.out.println("     |      | |      |");
        System.out.println("     |      | |      |");
        System.out.println("     +------+ +------+");
    }
    public static void US()
    {
        System.out.println("     +------+ +------+");
        System.out.println("     |United| |United|");
        System.out.println("     |States| |States|");
        System.out.println("     +------+ +------+");
    }
}