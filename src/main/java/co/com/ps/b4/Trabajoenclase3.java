package co.com.ps.b4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Trabajoenclase3 {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
        List<String> palabras = new ArrayList<>();
        System.out.println("Escriba 8 palabras:");

        for (int i = 0; i < 8; i++) {
            System.out.print("Palabra " + (i + 1) + ": ");
            String palabra = scanner.nextLine();
            palabras.add(palabra);
        }

        System.out.println("Palabras con más de 4 letras:");
        for (String palabra : palabras) {
            if (palabra.length() > 4) {
                System.out.println(palabra);
            }
        }
        scanner.close();

    }
}

