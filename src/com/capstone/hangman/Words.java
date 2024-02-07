package com.capstone.hangman;

public class Words extends Play{
    private static String sWord;
    static StringBuilder pHolders;

    public static String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
            "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
            "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
            "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
            "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon",
            "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
            "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
            "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
            "wombat", "zebra"};

    public void setsWord(String sWord) {
        this.sWord = sWord;
    }

    public static String getsWord() {
        return sWord;
    }

    public static StringBuilder placeholders() {
        if(pHolders == null) {
            pHolders = new StringBuilder("_".repeat(getsWord().length()));
            return pHolders;
        }
        return pHolders;

    }

    public StringBuilder gettingRight() {
        StringBuilder pHolders = placeholders();
        if (sWord.contains(String.valueOf(Guess.getUserGuess()))) {
            for (int i = 0 ; i < Guess.getWordInList().length; i++) {
                int index = 0;
                if (Guess.getWordInList()[i] == Guess.getUserGuess()) {
                    index = i;
                    StringBuilder strB = new StringBuilder(pHolders);
                    strB.setCharAt(index, Guess.getUserGuess());
                    pHolders = strB;
                }
            }
        }
        return pHolders;
    }

}
