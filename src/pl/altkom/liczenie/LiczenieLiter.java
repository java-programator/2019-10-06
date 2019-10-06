package pl.altkom.liczenie;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class LiczenieLiter {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(
                new FileInputStream(
                        "/home/student/Pobrane/wesele.txt"));
        Map<Character, Integer> litery = new HashMap<>();
        while (sc.hasNext()) {
            String line = sc.nextLine().toLowerCase();
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if (Character.isAlphabetic(c)) {
                    if (litery.containsKey(c)) {
                        int literyCount = litery.get(c);
                        litery.put(c, literyCount + 1);
                    } else {
                        litery.put(c, 1);
                    }
                }
            }
        }
        List<Map.Entry<Character, Integer>> l = new ArrayList<>();
        for (Map.Entry<Character, Integer> e : litery.entrySet()) {
            l.add(e);
        }

        for (int j = 0; j < l.size() - 1; j++) {
            Map.Entry<Character, Integer> max = l.get(j);
            for (int i = j+1; i < l.size(); i++) {
                Map.Entry<Character, Integer> element = l.get(i);
                if (element.getValue() > max.getValue()) {
                    max = element;
                }
            }
            System.out.println(max.getKey() + " => " + max.getValue());
            int index = l.indexOf(max);
            l.set(index, l.get(j));
            l.set(j, max);
        }
    }
}
