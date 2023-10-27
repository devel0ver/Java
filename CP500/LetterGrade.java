import java.util.Scanner;
public class LetterGrade
{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        char letter;
        double score;

        System.out.print("Please enter your score: ");
        score = console.nextDouble();
        if(score >= 90)
            letter = 'A';
        else if (score >= 80)
            letter = 'B';
        else if (score >= 70)
            letter = 'C';
        else if (score >= 60)
            letter = 'D';
        else
            letter = 'F';
        System.out.println("You got a " + letter);
    }
}