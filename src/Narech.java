import java.util.ArrayList;
import java.util.List;

public class Narech {
    private static List<String> narech = new ArrayList<>() {{
        add("alto tall");
        add("anche also");
        add("bene well");
        add("bianco white");
        add("c'e There is");
        add("caldo hot");
        add("ci_sono There are");
        add("con with");
        add("costa it costs");
        add("costano they cost");
        add("di_solito usually");
        add("facile easy");
        add("famoso famous");
        add("forse maybe");
        add("invece instead");
        add("nostra our");
        add("li there");
        add("libero free");
        add("molti many");
        add("molto very");
        add("nero black");
        add("ogni every");
        add("per for");
        add("perche because");
        add("piccolo small");
        add("prossimo next");
        add("quando when");
        add("qui here");
        add("rosso red");
        add("sempre always");
        add("spesso often");
        add("timido shy");
        add("divertente fun");
        add("purtroppo unfortunately");
        add("noioso boring");
        add("bello beautiful");
        add("dopo then");
        add("strano strange");
        add("troppo too");
        add("spaventoso frightening");
        add("altro other");
        add("subito immediately");
        add("importante important");
        }};
    private int number;

    public static int getWordSize() {
        return narech.size();
    }

    public static String[] getRandomWord() {
        int n = (int) (Math.random() * narech.size());
        return narech.get(n).split(" ");
    }
    public static List<String> getNarech() {
        return narech;
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
