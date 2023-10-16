public class Example1
{
    public static void main(String[] args)
    {
        System.out.print(min(3, -2, 7));
    }
    public static int min(int x, int y, int z)
    {
        return Math.min(x, Math.min(y, z));
    }
}