import java.util.*;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors

public class Clue {
    String hint;
    int id;

    public Clue(String initHint, int initID)
    {
        hint = initHint;
        id = initID;
    }

    public void readFile()
    {
        try {
            File myObj = new File("list.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              //System.out.println(data);
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }

    public void setHint(String clue)
    {
        
    }
}
