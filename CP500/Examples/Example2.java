public class Example2
{
    public static void main(String[] args)
    {
        System.out.print(min(3, -2, 0));
    }
    public static int min(int x, int y,int z)
    {
        return Math.min(x, Math.min(y, z));
    }
}