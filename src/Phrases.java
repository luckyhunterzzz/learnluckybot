import java.util.ArrayList;
import java.util.List;

public class Phrases {
    private static List<String> phrases = new ArrayList<>() {{
        add("buon_giorno good morning");
        add("buona_sera good evening");
        add("hai_ragione you are right");
        add("ho_sete i am thirsty");
        add("in_ritardo late");
        add("io_devo_fare i have to do");
        add("mi_chiamo my name is");
        add("mi_piace I like");
        add("piacere nice to meet you");

    }};
    private int number;

    public static int getWordSize() {
        return phrases.size();
    }

    public static String[] getRandomWord() {
        int n = (int) (Math.random() * phrases.size());
        return phrases.get(n).split(" ");
    }
    public static List<String> getPhrases() {
        return phrases;
    }
    public static boolean compareOfWord(String[] textWord, String[] textUser) {
        if (textWord.length == 2
                && textWord[1].equalsIgnoreCase(textUser[0])) {
            return true;
        }
        if (textWord.length == 3
                && textWord[1].equalsIgnoreCase(textUser[0])
                && textWord[2].equalsIgnoreCase(textUser[1])) {
            return true;
        }
        if (textWord.length == 4
                && textWord[1].equalsIgnoreCase(textUser[0])
                && textWord[2].equalsIgnoreCase(textUser[1])
                && textWord[3].equalsIgnoreCase(textUser[2])) {
            return true;
        }
        if (textWord.length == 5
                && textWord[1].equalsIgnoreCase(textUser[0])
                && textWord[2].equalsIgnoreCase(textUser[1])
                && textWord[3].equalsIgnoreCase(textUser[2])
                && textWord[4].equalsIgnoreCase(textUser[3])) {
            return true;
        }
        return false;
    }
}
