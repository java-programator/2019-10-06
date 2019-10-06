package pl.altkom.karty;

import java.util.*;

enum KolorKarty {
    KIER, KARO, PIK, TREFL;
}

enum FiguraKarty {
    K2, K3, K4, K5, K6, K7, K8, K9, K10, W, D, K, A;
}

class Karta {
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
}

public class TasowanieKart {
    public static void main(String[] args) {
        List<Karta> talia = new ArrayList<>();
        for (KolorKarty kolor : KolorKarty.values()){
            for (FiguraKarty figura : FiguraKarty.values()){
                Karta karta = new Karta(kolor, figura);
                talia.add(karta);
            }
        }

        Collections.shuffle(talia);

        for (Karta karta: talia) {
            System.out.println(karta);
        }

        List<String> players = Arrays.asList("Janek", "Franek", "Romek", "Tomek");

        Map<String, Set<Karta>> rozdanie = new HashMap<>();
        for (String player : players){
            rozdanie.put(player, new TreeSet<>());
        }








//        KolorKarty k = KolorKarty.KARO;
//        System.out.println(k.name());
//        System.out.println(k.ordinal());
//        System.out.println(k.compareTo(KolorKarty.PIK));
//        System.out.println(k.compareTo(KolorKarty.KIER));
//        System.out.println(Arrays.toString(KolorKarty.values()));
//        System.out.println(KolorKarty.valueOf("PIK"));
    }
}
