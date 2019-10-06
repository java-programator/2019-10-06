package pl.altkom.LiczenieLiter;

import java.util.*;

public class SortNumbers {
    // znajd 10 liczb z przedziału 0-100
    // wsadz w List
    // posortuje je rosnąco

    public static void main(String[] args) {
        // jeśli w Randomie dam 0, to liczby zawsze będą takie same !!!
        Random rand = new Random(0);
        List<Integer> numberList = new ArrayList<>();

        // ===>>> zrobić, żeby liczby się nie powtarzały <<<===
        for(int i=0; i<10; i++){
            int number = rand.nextInt(100) + 1;
            if(!numberList.contains(number)){
                numberList.add(number);
            }
        }

        //System.out.println("Rozmiar listy = " + numberList.size());
        for(int j : numberList){
            System.out.print(j + ", ");
        }

        System.out.println();
        System.out.println("===============================");

        // ===>>> nie działa mi, zrobić w domu <<<===
        for(int j=0; j<numberList.size()-1; j++){
            int min = numberList.get(j);
            int index = j;
            for(int i=j+1; i<numberList.size(); i++){
                int nextElement = numberList.get(i);
                if(min >= nextElement){
                    min = nextElement;
                    index = j;
                }
            }
            numberList.set(index, numberList.get(j));
            numberList.set(j, min);
        }
        for(int j : numberList){
            System.out.print(j + ", ");
        }

        System.out.println();
        System.out.println("===============================");
        Collections.sort(numberList);
        //System.out.println("Najmniejsza wartość = " + min);
        for(int j : numberList){
            System.out.print(j + ", ");
        }
    }
}
