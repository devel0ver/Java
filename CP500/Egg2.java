public class Egg2
{
    public static void main(String[] args)
    {
        Egg();

        Egg();
        lowerEgg();

        upperEgg();
        System.out.println("-\"-'-\"-'-\"-");
        lowerEgg();
    }
    public static void upperEgg()
    {
        System.out.println("  _______");
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
        System.out.println("-\"-'-\"-'-\"-");
    }
}