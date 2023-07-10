package ExceptionHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//Java documentation comment
/**
* <h1>Tips: For text Wrapping in Intellij IDE</h1>
* 1) Press ⇧⌘A (on Mac) or Control+Shift+A (on Windows/Linux) to open the Find Action dialog, and search for "soft-wrap"
* or
* 2) You can enable soft wrap for the editor with ⇧⇧ (macOS), or Shift+Shift (Windows/Linux)
 *
 *
 * @author  Guddu Prajapati
 * @version 1.0
 * @since   2023-07-02
*/

public class VotingSystemValidator {

    public static void main(String[] args)  {
        try(Scanner sc = new Scanner(new File("input.txt"))){
            int age = sc.nextInt();

            try {
                validate(age);
            }catch (AgeNotValidException e){
                System.out.println("Caught the Exception");
                System.out.println("Exception occurred: " + e);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Voting Over");
    }

    static void validate(int age) throws AgeNotValidException {
        if(age < 18){
            throw new AgeNotValidException("Your age is not Valid to VOTE.");

        }
        else {
            System.out.println("Welcome to VOTE.");
        }
    }

}

class AgeNotValidException extends Exception {
    AgeNotValidException(String errorMessage){
        super(errorMessage);


    }

}
