package pl.altkom.LiczenieLiter;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class LiczenieLiter {

    public static void uniqueLetters() throws FileNotFoundException {
        Map<Character, Integer> allLetters = new HashMap<>();
        Scanner sc = new Scanner(new FileInputStream("/home/student/Pobrane/lalka-tom-pierwszy.txt"));

        int count = 0;
        // ===>>> dokończyć <<<===
        while(sc.hasNext()){
            String line = sc.nextLine();
            //System.out.println(line);
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if(Character.isAlphabetic(c)) {
                    if(allLetters.containsKey(c)) {
                        int letterCount = allLetters.get(c);
                        allLetters.put(c, letterCount+1);
                    }else {
                        allLetters.put(c, 1);
                    }
                }
            }
        }
        List<Map.Entry<Character, Integer>> l = new ArrayList<>();
        for (Map.Entry<Character, Integer> e : allLetters.entrySet()) {
            l.add(e);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        Set<String> words = new HashSet<>();
        Scanner scan = new Scanner(new FileInputStream("/home/student/Pobrane/lalka-tom-pierwszy.txt"));

        while(scan.hasNext()) {
            String word = scan.next().toLowerCase();
            String[] parts = word.split("[,./:!?;()*–\\-…0123456789]");
            for (String part : parts) {
                if (part.length() > 0) {
                    words.add(part);
                }
            }
        }

        System.out.println(words.size());

        List<String> list = new ArrayList<>(words);
        Collections.sort(list);
        System.out.println(list);

        /*
        int count = 0;
        for(String w : words){
            if(w.length() > count){
                count =
            }
        }

         */
    }
}
