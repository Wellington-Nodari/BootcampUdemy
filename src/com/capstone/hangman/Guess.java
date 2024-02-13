package com.capstone.hangman;

import java.util.ArrayList;

public class Guess extends Words {

    static char[] letterList;
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

    public static char[] getWordInList() {
        letterList = new char[getsWord().length()];
        for (int i = 0; i < getsWord().length(); i++) {
            letterList[i] = getsWord().charAt(i);
        }
        return letterList;
    }

    public static boolean triedGuess() {
        findingWord = Words.placeholders();
        boolean result = true;

        if (getsWord().contains(String.valueOf(userGuess))) {
            if (getRGuesses().contains(String.valueOf(userGuess))) {
                System.out.println("You've already entered this letter, please try another one");
                return false;
            }
            for (int i = 0; i < getsWord().length(); i++) {
                if (getsWord().charAt(i) == userGuess) {
                    findingWord.setCharAt(i, userGuess);
                    setRGuesses(String.valueOf(userGuess));
                    result = false;
                }
            }
        } else {
            setWGuesses(String.valueOf(userGuess));
        }
        return result;
    }
}
