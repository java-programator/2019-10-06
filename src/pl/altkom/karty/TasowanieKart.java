package pl.altkom.karty;

import java.util.*;
import java.util.jar.JarOutputStream;

enum KolorKarty{
    KIER, KARO, PIK, TREFL;
}

enum FiguraKarty{
    K2, K3, K4, K5, K6, K7, K8, K9, K10, W, D, K, A;
}

class Karta implements Comparable<Karta>{
    private final KolorKarty kolor;
    private final FiguraKarty figura;

    public Karta(KolorKarty kolor, FiguraKarty figura) {
        this.kolor = kolor;
        this.figura = figura;
    }

    @Override
    public String toString() {
        return "Karta{" +
                "kolor=" + kolor +
                ", figura=" + figura +
                '}';
    }

    @Override
    public int compareTo(Karta k) {
        int res1 = k.figura.compareTo(this.figura);
        return 0;
    }
}
public class TasowanieKart {

    public static void main(String[] args) {
        // talia 52 karty
        // potasować karty
        // rozdać je na 4 graczy

        List<Karta> talia = new ArrayList<>();

        for(KolorKarty k : KolorKarty.values()){
            for(FiguraKarty f : FiguraKarty.values()){
                Karta karta = new Karta(k, f);
                talia.add(karta);
            }
        }

        System.out.println(talia.size());

        //Collections.shuffle(talia);

        Random rand = new Random();
        for(int i=0; i<500; i++){
            //int ii = rand.nextInt(talia.size());
            //int i2 = rand.nextInt(talia.size());

            for(int j=0; j<talia.size(); j++){
                Karta pierwsza = talia.get(j);
                int index = rand.nextInt(talia.size());
                Karta temp = talia.get(j);
                talia.set(j, talia.get(index));
                talia.set(index, temp);
            }
        }

        for(Karta k : talia){
            System.out.println(k);
        }

        // mape, gdzie
        Map<String, Set<Karta>> game = new HashMap<>();

        List<String> players = Arrays.asList("Janek", "Franek", "Romek", "Marian");

        // wybieram dla gracza karty i je usuwam z talii
        for(String player : players){
            Set<Karta> playerCards = new TreeSet<>();
            game.put(player, playerCards);
            for(int i=0; i<talia.size()/4; i++){
                playerCards.add(talia.get(i));
                talia.remove(i);
            }
        }



    }

}
