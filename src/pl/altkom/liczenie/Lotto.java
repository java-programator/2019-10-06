package pl.altkom.liczenie;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Lotto {
    public static void main(String[] args) {

        Random r = new Random();

        for (int i = 0; i < 8; i++) {
            Set<Integer> kupon = new TreeSet<>();
            while (kupon.size() <= 6) {
                kupon.add(r.nextInt(49)+1);
            }
            System.out.println(kupon);
        }

    }

}
