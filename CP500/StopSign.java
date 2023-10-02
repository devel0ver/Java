public class StopSign
{
    public static void main(String[] args)
    {
        Egg();
        lowerEgg();
        System.out.println(" +--------+");
        
        upperEgg();
        System.out.println("|  STOP   |");
        lowerEgg();
        
        upperEgg();
        System.out.println(" +--------+");
    }
    public static void upperEgg()
    {
        System.out.println("  _______ ");
        System.out.println(" /       \\");
        System.out.println("/         \\");
    }
    public static void lowerEgg()
    {
        System.out.println("\\         /");
        System.out.println(" \\_______/");
    }
    public static void Egg()
    {
        upperEgg();
        lowerEgg();
    }
}