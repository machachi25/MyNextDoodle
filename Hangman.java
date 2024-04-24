import java.util.*;
import java.lang.*;
import doodlepad.*;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class Hangman
{
    static String letter;
    Scanner scan = new Scanner(System.in);
    String[] parts = {"Head", "Right Arm", "Left Arm", "Left Leg", "Right Leg"};
    static String[] words = {"Tiger", "Penguin", "Chipmunk", "Gazelle", "Capybara", "Skunk"};
    String[] temp = new String[6];
    static String answer;
    ArrayList<String> humanParts = new ArrayList<String>(Arrays.asList(parts));
    String term;

    String process;
    String hint;
    public Hangman(int initRandom)
    {
        //hint = Math.random();
    }
    public String answer() // the method that gets the word itself
    {
        int randIndex = (int)(Math.random() * 6);
        answer = words[randIndex];
        return answer;
    }

    public String guess()
    {
        String placeholders = "";
        String empty = "";
        for(int i = 0; i < answer.length(); i++)
        {
            placeholders += "_";
        }
        System.out.print(placeholders);
        //System.out.println("What letter would you like to guess? : ");
        //String letter = (scan.nextLine());
        //letter.toLowerCase();
        //char guess = letter.charAt(0);
        return empty;
    }

    public void attempt()
    {
        System.out.println("What letter would you like to guess");
        letter = scan.nextLine();
        for(int g = 0; g < placeholders.length(); g++)
        {
            if(letter.equals(answer.substring(g, g+1)))
            {
                placeholders.substring(g, g+1) = letter;
            }
            System.out.println(placeholders)
        }
    }
    
    
}
