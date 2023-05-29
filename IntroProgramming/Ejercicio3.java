public class Ejercicio3 {

    public static void main(String[] args) {

        //Llamado a la función suma.
        System.out.println("El resultado de la suma es ");
        suma(13, 28, 49);

        /////////////////////////////////////////////////////////////////////////
        //Instancia del objeto de la clase Coche.
        Coche miCoche = new Coche();

        miCoche.adPuertas();
        miCoche.adPuertas();
        
        System.out.println("Este coche tiene " + miCoche.puertas + " puertas");

    }
    //Declaración de la función suma.
    public static void suma(int a, int b, int c) {
        int result;
        result = a + b + c;
        System.out.println(result);
    }
    
}

//Declaración de la clase Coche.
class Coche {

    int puertas = 2;

    public void adPuertas() {
        this.puertas++;
    }

}
