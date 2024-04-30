import java.util.ArrayList;
import java.util.List;

public class Mestoim {
    private static List<String> mestoim = new ArrayList<>() {{
        add("io I");
        add("io_sono I am");
        add("io_ho I have");
        add("tu You");
        add("tu_sei You are");
        add("tu_hai You have");
        add("con_te with you");
        add("lui he");
        add("lei she");
        add("lui_e he is");
        add("lei_e she is");
        add("lui_ha he has");
        add("lei_ha she has");
        add("noi we");
        add("noi_sono we are");
        add("noi_abbiamo we have");
    }};
    private int number;

    public static int getWordSize() {
        return mestoim.size();
    }

    public static String[] getRandomWord() {
        int n = (int) (Math.random() * mestoim.size());
        return mestoim.get(n).split(" ");
    }
    public static List<String> getMestoim() {
        return mestoim;
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
        return false;
    }
}
