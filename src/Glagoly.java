import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Glagoly {
    private static List<String> glagoly = new ArrayList<>() {{
        add("andare to go");
        add("vado i go");
        add("vai you go");
        add("va he goes");
//        add("va she go");
        add("andiamo we go");
        add("bere to drink");
        add("bevo i drink");
        add("bevi you drink");
        add("cantare to sing");
        add("cercare to look for");
        add("cerco i look for");
        add("cerchiamo we look for");
        add("comparare to buy");
        add("compro i buy");
        add("compri you buy");
        add("compra he buys");
//        add("compra she buy");
        add("compriamo we buy");
        add("cuciniare to cook");
        add("cucino i cook");
        add("cucini you cook");
        add("cucina he cooks");
//        add("cucina she cook");
        add("cuciniamo we cook");
        add("fare to do");
        add("facio i do");
        add("festeggiare to celebrate");
        add("festeggio i celebrate");
        add("festeggi you celebrate");
        add("festeggia he celebrates");
//        add("festeggia she celebrate");
        add("festeggiamo we celebrate");
        add("guardare to watch");
        add("lavorare to work");
        add("lavoro i work");
        add("lavori you work");
        add("lavora he works");
//        add("lavora she work");
        add("lavoriamo we work");
        add("mangiare to eat");
        add("mangio i eat");
        add("mangi you eat");
        add("mangia he eats");
//        add("mangia she eat");
        add("mangiamo we eat");
        add("nuotare to swim");
        add("pagare to pay");
        add("pago i pay");
        add("paghi you pay");
        add("paga he pays");
//        add("paga she pay");
        add("paghiamo we pay");
        add("passegiare to walk");
        add("stare to stay");
        add("stiamo we stay");
        add("studiare to study");
        add("studio i study");
        add("studi you study");
        add("studia he studies");
//        add("studia she study");
        add("studiamo we study");
        add("uscire to go out");
        add("vedere to see");
        add("vedo i see");
        add("vedi you see");
        add("viaggiare to travel");
        add("viaggiamo i travel");
        add("visitare to visit");
        add("volere to want");
        add("vorrei i would like");
        add("vorresti you would like");
        add("vorrebbe he would like");
//        add("vorrebbe she would like");
        add("vorremmo we would like");
        add("passiamo we spend");
        add("prendere to take");
        add("prendo i take");
        add("prendi you take");
        add("voglio i want");
        add("vuoi you want");
        add("vuole he wants");
        add("vivere to live");
        add("vivo i live");
        add("vivi you live");
        add("sentire to hear");
        add("sento i hear");
        add("senti you hear");
        add("sente he hears");
        add("sentiamo we hear");
        add("dormire to sleep");
        add("dormo i sleep");
        add("dormi you sleep");
        add("dorme he sleeps");
        add("dormiamo we sleep");
        add("cliccare to click");
        add("vive to live");
    }};
    private int number;

    public static int getWordSize() {
        return glagoly.size();
    }

    public static String[] getRandomWord() {
        int n = (int) (Math.random() * glagoly.size());
        return glagoly.get(n).split(" ");
    }

    public static List<String> getGlagoly() {
        return glagoly;
    }

    public static boolean compareOfWord(String[] textWord, String[] textUser) {
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

//    public static

}
