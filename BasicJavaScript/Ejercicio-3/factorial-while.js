//Factorial de 10 con bucle while
let texto = "El factorial de 10 es: "
let i = 1;
let num2 = 1;

while(i <= 10){
    num2 = i * num2;
    i++;
}
console.log(`${texto}${num2}`);