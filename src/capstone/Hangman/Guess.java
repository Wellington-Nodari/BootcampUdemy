package capstone.Hangman;

import java.util.ArrayList;

public class Guess extends Words{
    @Override
    public String getsWord() {
        return super.getsWord();
    }

    ArrayList<Character> letterList;
    private char userGuess;
    private ArrayList<String> guesses;

    public char getUserGuess() {
        return userGuess;
    }

    public void setUserGuess(char userGuess) {
        this.userGuess = userGuess;
    }

    public ArrayList<String> getGuesses() {
        return guesses;
    }

    public void setGuesses(String guesses) {
        this.guesses.add(guesses);
    }

    public ArrayList<String> missedGuess() {
        letterList = new ArrayList<>();
        guesses = new ArrayList<>();

        try {
            for (char letter : getsWord().toCharArray()) {
                letterList.add(letter);
            }

            for (char letter : letterList) {
                if (letter != userGuess) {
                    String myString = Character.toString(userGuess);
                    setGuesses(myString);
                }
            }
        } catch (NullPointerException exception) {
            System.out.println("Shiiiit!");
            }
        return guesses;
    }

}
