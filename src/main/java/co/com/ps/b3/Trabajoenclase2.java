package co.com.ps.b3;

import java.util.Scanner;

public class Trabajoenclase2 {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("numero 1: ");
        double num1 = scanner.nextDouble();

        System.out.print("numero 2: ");
        double num2 = scanner.nextDouble();

        double suma = num1 + num2;
        double resta = num1 - num2;
        double multiplicacion = num1 * num2;

        System.out.print("Suma: " + suma + " " + "Resta: "  + resta + " " + "Multiplicacion: " + multiplicacion + " ");

        if (num2 != 0) {
            double division = num1 / num2;
            System.out.print("División: " + division);
        } else {
            System.out.print("No se puede dividir por cero.");
        }

    }
}
