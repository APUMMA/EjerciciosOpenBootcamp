/*
Crea una clase Persona con las siguientes variables:
    > La edad
    > El nombre
    > El teléfono
    > Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.
    > Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
    > Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.
*/

public class Ejercicio9 {

    public static void main(String[] args) {

        // Instancia del objeto cliente
        Cliente cliente = new Cliente();

        cliente.setEdad(24);
        cliente.setTelefono(4277022);
        cliente.setNombre("Williams");
        cliente.setCredito(5000);

        System.out.println("Datos del cliente");
        System.out.println("Su edad es: " + cliente.getEdad() + " años");
        System.out.println("Su nombre es: " + cliente.getNombre());
        System.out.println("Su número telefónico es: " + cliente.getTelefono());
        System.out.println("Su crédito es: " + cliente.getCredito());

        System.out.println();

        //////////////////////////////////////////////////////////////////////////////////////////////
        // Instancia del objeto trabajador
        Trabajador trabajador = new Trabajador(1533000);

        trabajador.setEdad(30);
        trabajador.setTelefono(2370762);
        trabajador.setNombre("Samanta");
        // trabajador.setSalario(1523000);

        System.out.println("Datos del trabajador");
        System.out.println("Su edad es: " + trabajador.getEdad() + " años");
        System.out.println("Su nombre es: " + trabajador.getNombre());
        System.out.println("Su número telefónico es: " + trabajador.getTelefono());
        System.out.println("Su salario es: " + trabajador.salario);

    }
}
        
//////////////////////////////////////////////////////////////////////////////////////////////////////
// Declaración de la clase Persona con las siguientes variables:
class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public Persona() {

    }
    //////////////////////////////////////////////////////////////////////////////////////////////////
    // Declaración de métodos getter
    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }
        
    //////////////////////////////////////////////////////////////////////////////////////////////////
    // Declaración de métodos setter
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

}

//////////////////////////////////////////////////////////////////////////////////////////////////////
// Declaración de la clase Cliente hereda de la clase persona
class Cliente extends Persona {
    private int credito;

    // Declaración de métodos get y set
    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

}

//////////////////////////////////////////////////////////////////////////////////////////////////////
// Declaración de la clase Trabajador hereda de la clase persona
class Trabajador extends Persona {
    int salario;

    public Trabajador(int salario) {
        this.salario = salario;
    }
    /*
    // Declaración de métodos get y set
        public int getSalario() {
        return salario;
        }
    
     * public void setSalario(int salario) {
     * this.salario = salario;
     * }
     */

}
