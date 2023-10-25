import java.util.Scanner;
/*
Write a program that outputs a person's "gangsta name."
first initial
Diddy
last name (all caps)
first name
-izzle

Example Output:
Type your name, playa: Marge Simpson
Your gangsta name is "M. Diddy SIMPSON Marge-izzle"
 */
public class Ex6
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        String name, firstName, lastName;
        System.out.print("Type your name, playa: ");
        name = console.nextLine();
        int index = name.indexOf(" ");
        firstName = name.substring(0, index);
        lastName = name.substring(index+1);
        System.out.printf("Your first name is \"%s\" and last name is \"%s\"\n", firstName, lastName);
        // System.out.printf("Your first name is %s and last name is %s\n", name.split("\\s+"), name.substring(name.indexOf(" "), name.length()));
    }
}