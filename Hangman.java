import java.util.*;
//import doodlepad.*;

public class Hangman
{
    Scanner scan = new Scanner(System.in);
    String[] parts = {"Head", "Right Arm", "Left Arm", "Left Leg", "Right Leg"};
    ArrayList<String> humanParts = new ArrayList<String>(Arrays.asList(parts));
    String term;
    String process;
    String hint;
    public Hangman(String initHint)
    {
        hint = initHint;
    }
    public void answer() // the method that gets the word itself
    {
        System.out.println("What would like the answer to be for this hangman, based off the hint being " + hint + "?");
        term = scan.nextLine();
    }

    public void guess()
    {
        System.out.println("What letter would you like to guess? : ");
        String letter = (scan.nextLine());
        letter.toLowerCase();
        //char guess = letter.charAt(0);
        for(int i = 0; i < term.length(); i++ )
        {
            if(letter.substring(i,i+1).equals(term.substring(i, i+1)))
            {
                System.out.println(process.substring(i,i+1));
            }
            else
            {
                humanParts.remove(0);
            }
        }
    }
    public static void main(String[] args)
    {
        Hangman h1 = new Hangman("Fast Food"); 
        h1.answer();
        h1.guess();
    }
    
}
