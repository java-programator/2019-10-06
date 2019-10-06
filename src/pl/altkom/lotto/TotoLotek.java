package pl.altkom.lotto;

import java.util.*;

public class TotoLotek {
    public static void main(String[] args) {
        List<Set<Integer>> kupon = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 8; i++) {
            Set<Integer> okienko = new TreeSet<>();
            while (okienko.size() < 6) {
                okienko.add(r.nextInt(49) + 1);
            }
            kupon.add(okienko);
        }
        for (Set<Integer> s : kupon) {
            System.out.println("================================");
            for (int i : s) {
                System.out.printf("%4d", i);
            }
            System.out.println();
        }
    }
}
