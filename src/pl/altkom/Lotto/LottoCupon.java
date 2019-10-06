package pl.altkom.Lotto;

import java.awt.*;
import java.util.*;
import java.util.List;

class OneWindow{
    List<Integer> numbers;

    public OneWindow(){
        numbers = new ArrayList<>();
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        for(int i=0; i<49; i++){
            numbers.add(i+1);
        }
    }
}

public class LottoCupon {

    public static void main(String[] args) {
        // 6 liczb z 49
        // 8 okienek takich liczb

        Map<Integer, OneWindow> cupon = new HashMap<>();

        //OneWindow okienko = new OneWindow();

        Random rand = new Random();

        // ===>>> dokończyć w domu, nie wychodzi <<<===
        List<Set<Integer>> kupon = new ArrayList<>();
        for(int i=0; i<8; i++){
            Set<Integer> okienko = new TreeSet<>();
            while(okienko.size() < 6){
                int number = rand.nextInt(49) + 1;
                //if(!okienko.contains(number)){
                //    okienko.add(number);
                //    count++;
                //}
                okienko.add(number);
            }
            kupon.add(okienko);
        }
        for(Set<Integer> s : kupon){
            System.out.println("==================");
            for(int i : s){
                System.out.printf("%4d", i);
            }
            System.out.println();
        }

    }
}
