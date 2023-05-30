//Enunciado del ejercicio:
    //Crea los siguientes archivos JS:
        //- factorial-for.js -> Este archivo debe calcular el factorial de 10 utilizando un solo bucle for
        //- factorial-while.js -> Este archivo debe calcular el factorial de 10 utilizando un bucle while
        //- factorial-break.js -> Este archivo debe calcular el factorial de 10 utilizando un bucle while, una bifurcación if y una sentencia break
//////////////////////////////////////////////////////////////////////////////////////////////////////////        

//Factorial de 10 utilizando un bucle whil1e, una bifurcación if y una sentencia break
let texto = "El factorial de 10 es: "
let f = 10;
i = f-1;

while(f){
    f = f * i;
    i--;
    if (i <= 1) break;

}
console.log(`${texto}${f}`);