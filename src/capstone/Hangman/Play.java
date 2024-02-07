package capstone.Hangman;

import java.util.ArrayList;
import java.util.Scanner;

public class Play {

    static int listSize;
    static ArrayList<String> list = new ArrayList<>();

    public static void runGame() {
        Gallows gallows = new Gallows();

        Words words = new Words();
        words.setsWord(Words.words[(int) ((Math.random() * (Words.words.length) + 0))]);

        String wordVar = "";
        String misses = "";

        Play play = new Play();

        while (list.size() < 6) {
            misses = String.valueOf(Guess.getWGuesses());
            wordVar = String.valueOf(words.gettingRight());

            System.out.println("----------------");
            System.out.println("The Hangman Game");
            System.out.println("----------------");
            System.out.println("Word to guess: " + Words.getsWord());

            System.out.println(gallows.printGallows());

            System.out.println("Word: " + wordVar);
            System.out.println("Misses: " + misses);

            play.getUserInput();
//            Guess.triedGuess();
//            play.guessMethod();

        }

        System.out.println(gallows.printGallows());
        System.out.println("GAME OVER!!!!");

    }

    public void getUserInput() {
        Guess guess = new Guess();
        Scanner ug = new Scanner(System.in);
        String uGuess = "";

        System.out.print("Guess: ");
        uGuess = ug.nextLine();
        char charGuess = uGuess.charAt(0);
        guess.setUserGuess(charGuess);
        if (!Guess.triedGuess()) {
            list.add(String.valueOf(Guess.getWGuesses()));
            listSize = list.size();
        }
//        System.out.println(guess.getUserGuess());

    }

    public int getSizeList() {
        return listSize;
    }
}
