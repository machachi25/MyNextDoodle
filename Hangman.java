// Import the Scanner class to read text files
import java.util.*;
import java.lang.*;
//import doodlepad.*;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors

public class Hangman //these are all the intance vairbales and most of them are acutally ont being used
{
    static String letter;
    Scanner scan = new Scanner(System.in);
    String[] parts = {"Head", "Right Arm", "Left Arm", "Left Leg", "Right Leg"};
    static String[] words = {"Tiger", "Penguin", "Chipmunk", "Gazelle", "Capybara", "Skunk"};
    String[] temp = new String[6];
    static String answer = words[(int) Math.random() * 6];
    ArrayList<String> humanParts = new ArrayList<String>(Arrays.asList(parts));
    String term;
    static String placeholders;
    String process;
    String hint;
    private static String asterisk = new String(new char[answer.length()]).replace("\0", "*");
	private static int count = 0;
    public Hangman()
    {
        //hint = Math.random();
        

    }
    /*public String answer() // the method that gets the word itself
    {
        int randIndex = (int)(Math.random() * 6);
        answer = words[randIndex];
        return answer;
    }*/

    /*public String guess()
    {
        placeholders = "";
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
    } */

    public static void attempt(String guess)
    {
       placeholders = "";
		for (int i = 0; i < answer.length(); i++) {
			if (answer.charAt(i) == guess.charAt(0)) {
				placeholders += guess.charAt(0);
			} else if (answer.charAt(i) != '*') {
				placeholders += answer.charAt(i);
			} else {
				placeholders += "*";
			}
		}

        if (asterisk.equals(placeholders)) {
			count++;
            hangmanImage();
		} else {
			asterisk = placeholders;
		}
		if (asterisk.equals(answer)) {
			System.out.println("Correct! You win! The word was " + answer);
		}
    }
    
    public static void hangmanImage() {
		if (count == 1) {
			System.out.println("Wrong guess, try again");
			
		}
		if (count == 2) {
			System.out.println("Wrong guess, try again");
			
		}
		if (count == 3) {
			System.out.println("Wrong guess, try again");
			
		}
		if (count == 4) {
			System.out.println("Wrong guess, try again");
			
		}
		if (count == 5) {
			System.out.println("Wrong guess, try again");
			
		}
		if (count == 6) {
			System.out.println("Wrong guess, try again");
			
		}
		if (count == 7) {
			System.out.println("GAME OVER!");
			
		}
	}

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

		while (count < 8 && asterisk.contains("*")) {
			System.out.println("Guess any letter in the word");
			System.out.println(asterisk);
			String guess = sc.next();
			attempt(guess);
    }
}
    
}
