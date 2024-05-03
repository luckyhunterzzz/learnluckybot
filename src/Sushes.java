import java.util.ArrayList;
import java.util.List;

public class Sushes {
    private static List<String> sushes = new ArrayList<>() {{
        add("acqua water");
        add("amico friend");
        add("anno year");
        add("aperitivo aperitif");
        add("appartamento apartment");
        add("bagno restroom");
        add("bambino child");
        add("bambini children");
        add("banca bank");
        add("biglietto ticket");
        add("camicia shirt");
        add("cane dog");
        add("сarne meat");
        add("casa home");
        add("castello castle");
        add("ciao hi");
        add("cibo food");
        add("cioccolato chocolate");
        add("compleanno birthday");
        add("concerto concert");
        add("conto check");
        add("domani tomorrow");
        add("estate summer");
        add("famiglia family");
        add("farmacia pharmacy");
        add("festa holiday");
        add("figlia daughter");
        add("figlio son");
        add("fuochi_d'artificio Fireworks");
        add("gatto cat");
        add("giardino garden");
        add("inglese english");
        add("latte milk");
        add("lavoro work");
        add("letto bed");
        add("fratello brother");
        add("salve hello");
        add("regalo gift");
        add("pollo chicken");
        add("pesce fish");
        add("parco park");
        add("pantaloni pants");
        add("pannetone pannetone");
        add("pane bread");
        add("padre father");
        add("ora now");
        add("oggi today");
        add("negozio store");
        add("museo museum");
        add("moglie wife");
        add("mobili furniture");
        add("mese month");
        add("marito husband");
        add("maglione sweater");
        add("madre mother");
        add("scontrino reciept");
        add("gli_scontrini reciepts");
        add("scusa excuse me");
        add("scusate excuse me");
        add("sera evening");
        add("settimana week");
        add("sito website");
        add("sorella sister");
        add("spagnolo spanish");
        add("spiaggia beach");
        add("stanza room");
        add("stasera tonight");
        add("tavolo table");
        add("tedesco german");
        add("uova eggs");
        add("vicino neighbor");
        add("zaino backpack");
        add("gli_zaini backpacks");
        add("malato sick");
        add("cuoca cook");
        add("qualcosa anything");
        add("soggiorno living room");
        add("stivali boots");
        add("fine_settimana weekend");
        add("donna woman");
        add("rumore noise");
        add("grido scream");
        add("voce voice");
        add("notte night");
        add("fantasma ghost");
        add("paura fear");
        add("aiuto help");
        add("giorno day");
        add("uomo man");

    }};
    private int number;

    public static int getWordSize() {
        return sushes.size();
    }

    public static String[] getRandomWord() {
        int n = (int) (Math.random() * sushes.size());
        return sushes.get(n).split(" ");
    }
    public static List<String> getSushes() {
        return sushes;
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
