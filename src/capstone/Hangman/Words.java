package capstone.Hangman;

public class Words extends Play{
    private String sWord;

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

    public String getsWord() {
        return sWord;
    }

    public String placeholders() {
        return "_".repeat(sWord.length());

    }

//    public String gettingRight() {
//        if(Guess.us)
//
//        return null;
//    }

}
