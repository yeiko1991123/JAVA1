package co.com.ps.b2;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.nombre="";
        persona.edad=12;
        persona.id="1234";
        persona.estatura=1.78f;
       // System.out.printf("llamar caminar" + persona.caminar(3));

        Trabajoenclase tv = new Trabajoenclase();
        tv.marca="Samsung";
        tv.color="Negro";
        tv.serial=12234;
        tv.sistemaopr="Tizen";
        tv.comandovoz="SI";
        tv.wifi="SI";
        tv.resolucion= "FULLHD";
        tv.tamañopulg=32;

        tv.encender();
        tv.Funcion();
        tv.cambiarcanal();



    }
}
