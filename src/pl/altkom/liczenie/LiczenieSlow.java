package pl.altkom.liczenie;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

public class LiczenieSlow {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(
                new FileInputStream(
                        "/home/student/Pobrane/wesele.txt"));
        Set<String> slowa = new HashSet<>();
        while (sc.hasNext()) {
            String slowo = sc.next().toLowerCase();
            String[] parts = slowo.split("[,./:!?;()–\\-…0123456789]");
            for (String part : parts) {
                if (part.length() > 0) {
                    slowa.add(part);
                }
            }
            // http://
            // etc.)
//            char lastChar = slowo.charAt(slowo.length() - 1);
//            if (Character.isAlphabetic(lastChar)) {
//                slowa.add(slowo);
//            } else {
//                slowa.add(slowo.substring(0, slowo.length()-1));
//            }
        }
//        System.out.println(slowa.size());
//        for (String s : slowa) {
//            System.out.println(s);
//        }
        String max = "";
        for (String tekst : slowa){
            if (tekst.length() > max.length()){
                max = tekst;
            }
        }

        System.out.println(max);
    }
}
