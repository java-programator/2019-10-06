package pl.altkom.karty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

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
        Random r = new Random();


        KolorKarty k = KolorKarty.KARO;
        System.out.println(k.name());
        System.out.println(k.ordinal());
        System.out.println(k.compareTo(KolorKarty.PIK));
        System.out.println(k.compareTo(KolorKarty.KIER));
        System.out.println(Arrays.toString(KolorKarty.values()));
        System.out.println(KolorKarty.valueOf("PIK"));

        List<Karta> talia = new ArrayList<>();

        for (KolorKarty kolor : KolorKarty.values()) {
            for (FiguraKarty figura : FiguraKarty.values()) {
                Karta karta = new Karta(kolor, figura);
                talia.add(karta);
            }
        }

        for (int i = 0; i < 1000; i++) {
            int i1 = r.nextInt(talia.size());
            int i2 = r.nextInt(talia.size());

            Karta temp = talia.get(i1);
            talia.set(i1, talia.get(i2));
            talia.set(i2, temp);

        }

        for (Karta karta : talia) {
            System.out.println(karta);
        }

    }
}
