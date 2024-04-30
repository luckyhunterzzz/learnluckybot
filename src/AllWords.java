import java.util.ArrayList;
import java.util.List;

public class AllWords {

    private static List<String> allWords = new ArrayList<>() {{
        addAll(Glagoly.getGlagoly());
        addAll(Sushes.getSushes());
        addAll(Narech.getNarech());
        addAll(Phrases.getPhrases());
        addAll(Mestoim.getMestoim());
    }};
    private int number;



    public static int getWordSize() {
        return allWords.size();
    }

    public static String[] getRandomWord() {
        int n = (int) (Math.random() * allWords.size());
        return allWords.get(n).split(" ");
    }

    public static boolean compareOfWord(String[] textWord, String[] textUser) {
        if (textWord.length == 2
                && textWord[1].equalsIgnoreCase(textUser[0])) {
            return true;
        }
        if (textWord.length == 3) {
            if (textWord[1].equalsIgnoreCase(textUser[0]) && textWord[2].equalsIgnoreCase(textUser[1])) {
                return true;
            }
        }
        if (textWord.length == 4) {
            if (textWord[1].equalsIgnoreCase(textUser[0])
                    && textWord[2].equalsIgnoreCase(textUser[1])
                    && textWord[3].equalsIgnoreCase(textUser[2])) {
                return true;
            }
        }
        return false;
    }

}
