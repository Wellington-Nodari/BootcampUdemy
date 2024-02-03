package capstone.Hangman;

import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        Gallows gallows = new Gallows();
        Words words = new Words();
        Guess userGuess = new Guess();
        Scanner ug = new Scanner(System.in);
        String uGuess;


        System.out.println(gallows.printGallows());
        System.out.println("Word: " + words.printWord());
        System.out.println("Misses: " + words.placeholders());
        System.out.print("Guess: "); uGuess = ug.nextLine();
        userGuess.setUserGuess(uGuess);

        System.out.println(userGuess.getUserGuess());

    }

}






