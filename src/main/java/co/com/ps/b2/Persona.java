package co.com.ps.b2;

public class Persona {

    String colorPiel;
    int edad;
    float estatura;
    String sexo;
    String nombre;
    String id;
    String telefono;

    public static void cantar (){
        System.out.println("Estoy cantando");
    }

    public void bailar (){
        System.out.println("Estoy bailando");
    }

    public int caminar (int cuadras){
        return cuadras * 100 ;
    }

}



