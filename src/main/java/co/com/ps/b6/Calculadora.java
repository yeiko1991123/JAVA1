package co.com.ps.b6;

public class Calculadora {

    static double num1;
    static double num2;

    public static void sumar (){

        System.out.println(num1+num2);
    }

    public static void restar (){

        System.out.println(num1-num2);
    }

    public static void multiplicar (){

        System.out.println(num1*num2);
    }

    public static void dividir (){
        if (num2 != 0) {
            System.out.println(num1/num2);
        } else {
            System.out.println("No se puede dividir por cero.");
        }
    }
}
