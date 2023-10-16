public class Receipt
{
    public static void main(String[] args)
    {
        double sub = 38 + 40 + 30;
        double tax = sub * .08;
        double tip = sub * .15;
        double total = sub + tax + tip;
        // Calculate total owed, assuming 8% tax / 15% tip
        System.out.printf("Subtotal: $%s\n", sub);
        System.out.printf("Tax: $%s\n", tax);
        System.out.printf("Tip: $%s\n", tip);
        System.out.printf("Total: $%s\n", total);
    }
}
