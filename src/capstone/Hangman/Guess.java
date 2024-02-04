package capstone.Hangman;

import java.util.ArrayList;

public class Guess extends Words{

    static ArrayList<Character> letterList = new ArrayList<>();
    private static char userGuess;
    static StringBuilder findingWord;

    static ArrayList<String> rGuesses = new ArrayList<>();
    static ArrayList<String> wGuesses = new ArrayList<>();

    public static char getUserGuess() {
        return userGuess;
    }

    public void setUserGuess(char userGuess) {
        this.userGuess = userGuess;
    }

    public static ArrayList<String> getWGuesses() {
        return wGuesses;
    }

    public static void setWGuesses(String wGuesses) {
        Guess.wGuesses.add(wGuesses);
    }

    public static ArrayList<String> getRGuesses() {
        return rGuesses;
    }

    public static void setRGuesses(String rGuesses) {
        Guess.rGuesses.add(rGuesses);
    }

    public static ArrayList<Character> getWordInList() {
        for (char i : getsWord().toCharArray()) {
        letterList.add(i);
        }
        return letterList;
    }

    public static boolean triedGuess() {
        findingWord = Words.placeholders();

        if (getsWord().contains(String.valueOf(userGuess))) {
            for (int i = 0; i < getsWord().length(); i++) {
                if (getsWord().charAt(i) == userGuess) {
                    findingWord.setCharAt(i, userGuess);
                    setRGuesses(String.valueOf(userGuess));
                    return true;
                }
            }
        } setWGuesses(String.valueOf(userGuess));
          return false;
    }
}
