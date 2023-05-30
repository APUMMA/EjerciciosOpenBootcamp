/*
Para practicar la encapsulación:
    > Crear clase Persona.
    > Crear variables las privadas edad, nombre y telefono de la clase Persona.
    > Crear gets y sets de cada propiedad.
    > Crear un objeto persona en el main.
    > Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola
*/

public class Ejercicio8 {

    public static void main(String[] args) {

        // Instancia del objeto persona
        Persona persona = new Persona();

        persona.setEdad(36);
        persona.setNombre("Falkon");
        persona.setTelefono(3474429);

        System.out.println("Su edad es: " + persona.getEdad() + " años");
        System.out.println("Su nombre es: " + persona.getNombre());
        System.out.println("Su número telefónico es: " + persona.getTelefono());

    }

}

// Declaración de la clase Persona
class Persona {
    private int edad;
    private String nombre;
    private int telefono;
/*     
    // Declaración del método constructor
    public Persona() {
        this.edad = 38;
        this.nombre = "Falkon";
        this.telefono = 3474429;

    }
*/
    // Declaración de métodos Getter.
    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    // Declaración me métodos Setter.
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
