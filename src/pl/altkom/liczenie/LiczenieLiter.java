package pl.altkom.liczenie;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LiczenieLiter {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(
                new FileInputStream(
                        "/home/student/Pobrane/lalka-tom-pierwszy.txt"));
        while (sc.hasNext()) {
            String line = sc.nextLine();
            System.out.println(line);
        }
    }
}
