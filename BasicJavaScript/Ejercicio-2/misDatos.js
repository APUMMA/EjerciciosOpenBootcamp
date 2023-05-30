/*
Crea un nuevo archivo JS que contenga una lista con los siguientes elementos:
    - Tu nombre (string)
    - Tu edad (number)
    - ¿Eres desarrollador? (boolean)
    - Tu fecha de nacimiento (Date)
    - Tu libro favorito (Objeto con propiedades: titulo, autor, fecha, url)
*/

//Mi solución al ejercicio de la unidad 2 del curso JavaScript Básico.

const misDatos = {
    Nombre: "Angel",
    Edad: 46 + " años",
    Desarrollador: true,
    fchNacimiento: new Date(1976,9,12),
    libroFavorito: {
        Titulo: "¡Disfrute de la vida para siempre!",
        Autor: "Los Testigos de Jehová",
        Fecha: 2021,
        URL: "https://www.jw.org/es/biblioteca/libros/disfrute-vida-para-siempre/",
    }
}

console.log(misDatos);