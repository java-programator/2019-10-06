package pl.altkom.liczenie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SortowanieLiczb {
    public static void main(String[] args) {
        Random r = new Random(0);
        List<Integer> ints = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            int randomInt = r.nextInt(100);
            ints.add(randomInt);
        }
        for (int i : ints) {
            System.out.print(i + " ");
        }
        System.out.println();

        Collections.sort(ints);

//        for (int i = 0; i < ints.size() - 1; i++) {
//            int min = ints.get(i);
//            int index = i;
//            for (int j = i+1; j < ints.size(); j++) {
//                int element = ints.get(j);
//                if (element <= min) {
//                    min = element;
//                    index = j;
//                }
//            }
//            // zamieniam element na miejscu index
//            // z elementem na miejscu i
//            ints.set(index, ints.get(i));
//            ints.set(i, min);
//        }
        System.out.println("==================================");
        for (int i : ints) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
}
