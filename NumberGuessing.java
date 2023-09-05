import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {


public  static void main(String args[]) {

    Scanner keyboard = new Scanner(System.in);
    int numGuesses = 0;
    Random rObj = new Random();
    int randomNumber = rObj.nextInt(10) + 1;
   // int randomNumber = 8;
    System.out.println(" ************************ ");
    System.out.println("Welcome to the Guessing Game");
    System.out.println(" ************************ ");
    System.out.println();
    System.out.print("Enter an int from 1 to 10: ");
    int inputNumber = keyboard.nextInt();

    numGuesses++;

    
    /****************************/
    while (inputNumber != randomNumber) {
        System.out.println();
        System.out.println("Try again...");
        System.out.print("Enter an int from 1 to 10: ");
        inputNumber = keyboard.nextInt();
        numGuesses++;
    }
    System.out.print("You win after ");
    System.out.println(numGuesses + " guesses.");
    keyboard.close();

    }
}