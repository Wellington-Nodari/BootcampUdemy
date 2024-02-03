package capstone.Hangman;

import java.util.Scanner;

public class Guess {
    private String userGuess;
    private String[] guesses;

    public String getUserGuess() {
        return userGuess;
    }

    public void setUserGuess(String userGuess) {
        this.userGuess = userGuess;
    }

    public String[] getGuesses() {
        return guesses;
    }

    public void setGuesses(String[] guesses) {
        this.guesses = guesses;
    }

}
