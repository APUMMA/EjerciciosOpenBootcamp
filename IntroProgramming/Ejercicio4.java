/*En este ejercicio practicarás las estructuras de control, para ello deberás crear:

    > Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

    > Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle  deberá:
        - Incrementar el valor de la variable en uno cada vez que se ejecute.
        - Mostrarlo por pantalla cada vez que se ejecute.
    > Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
    > Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
    > Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año.  Dependiendo del valor de la variable estación se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.
*/

public class Ejercicio4 {

    public static void main(String[] args) {
        // Condicional if
        int numeroIf = -3;
        if (numeroIf > 0) {
            System.out.println("Este número es positivo");
        } else if (numeroIf < 0) {
            System.out.println("Este número es negativo");
        } else {
            System.out.println("Este número es cero");
        }

        /////////////////////////////////////////////////////////////////////
        // Bucle While
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("El numeroWhile ahora vale: " + numeroWhile);
        }

        /////////////////////////////////////////////////////////////////////
        // Bucle Do While
        int numeroDoWhile = 0;
        do {
            System.out.println("El numeroDoWhile ahora vale: " + numeroDoWhile);
            numeroDoWhile++;
        } while (numeroDoWhile > 3);

        /////////////////////////////////////////////////////////////////////
        // Bucle For
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("El numeroFor ahora vale: " + numeroFor);

        }
        
        /////////////////////////////////////////////////////////////////////
        // Bucle Switch
        int estacion = 2;
        switch (estacion) {
            case 1: 
                System.out.println("Esta es la estación Primavera");   break;
            
            case 2: 
                System.out.println("Esta es la estación Verano");  break;
            
            case 3: 
                System.out.println("Esta es la estación Otoño");   break;
            
            case 4: 
                System.out.println("Esta es la estación Invierno");    break;
            
            default: 
                System.out.println("Selecciona una estación ");
        }
    }
}




