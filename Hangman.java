import java.util.*;
import java.lang.*;
//import doodlepad.*;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class Hangman
{
    Scanner scan = new Scanner(System.in);
    String[] parts = {"Head", "Right Arm", "Left Arm", "Left Leg", "Right Leg"};
    String[] words = {"Water", "Proxy", "Words", "Spite", "Douma"};
    String[] temp = new String[5];
    ArrayList<String> humanParts = new ArrayList<String>(Arrays.asList(parts));
    String term;
    String process;
    String hint;
    public Hangman(int initRandom)
    {
        //hint = Math.random();
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
        try {
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              System.out.println(data);
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
        //Hangman h1 = new Hangman(); 
        //h1.answer();
        //h1.guess();
    }
    
}
