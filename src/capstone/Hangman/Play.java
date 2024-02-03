package capstone.Hangman;

import java.util.Scanner;

public class Play {

    private static String userInput;
    private static int round;

    public int getRound(){
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public static String getUserInput() {
        return userInput;
    }

    public void setUserInput(String userInput) {
        Scanner guess = new Scanner(System.in);
        this.userInput = guess.nextLine();
    }


}
