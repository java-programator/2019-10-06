package pl.altkom.liczenie;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class SlowaWKsiazce {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(
                new FileInputStream(
                        "/home/student/Pobrane/wesele.txt"));
        Set<String> slowa = new HashSet<>();
        while (sc.hasNext()) {
            String slowo = sc.next().toLowerCase();
            slowa.add(slowo);
        }
        System.out.println(slowa.size());

    }
}

