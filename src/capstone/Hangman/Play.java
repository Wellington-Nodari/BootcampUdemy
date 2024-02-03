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

//        Guess guess = new Guess();
//        Scanner ug = new Scanner(System.in);
//        String uGuess = "";

        Play play = new Play();



        while (list.size() < 6) {

            System.out.println(gallows.printGallows());

//            System.out.println(words.getsWord());
            System.out.println("Word: " + words.placeholders());
            System.out.println("Misses: " + list);

            play.guessMethod();


//            System.out.print("Guess: ");
//            uGuess = ug.nextLine();
//            char charGuess = uGuess.charAt(0);
//            guess.setUserGuess(charGuess);
//            list.add(uGuess);
//            listSize = list.size();

//            System.out.println("List Size: " + listSize);

//            System.out.println(guess.getUserGuess());
        }


    }

    public void guessMethod() {
        Guess guess = new Guess();
        Scanner ug = new Scanner(System.in);
        String uGuess = "";

        System.out.print("Guess: ");
        uGuess = ug.nextLine();
        char charGuess = uGuess.charAt(0);
        guess.setUserGuess(charGuess);
        list.add(uGuess);
        listSize = list.size();
        System.out.println(guess.getUserGuess());

    }

    public int getSizeList() {
        return listSize;
    }
}
