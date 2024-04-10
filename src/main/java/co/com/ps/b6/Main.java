package co.com.ps.b6;

import java.util.Scanner;

import static co.com.ps.b6.Calculadora.*;

public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            try {

                System.out.println("Ingrese el primer número:");
                num1 = scanner.nextDouble();

                System.out.println("Ingrese el segundo número:");
                num2 = scanner.nextDouble();

                System.out.println("Seleccione la operación a realizar:");
                System.out.println("1. Suma");
                System.out.println("2. Resta");
                System.out.println("3. Multiplicación");
                System.out.println("4. División");
                int opcion = scanner.nextInt();


                switch (opcion) {
                    case 1:
                        sumar();
                        break;
                    case 2:
                        restar();
                        break;
                    case 3:
                        multiplicar();
                        break;
                    case 4:
                        dividir();
                        break;
                    default:
                        System.out.println("Opción no válida.");
                        return;
                }
            }
            catch (Exception e) {
                System.out.println("Error entrada invalida");

            }
        }

}
