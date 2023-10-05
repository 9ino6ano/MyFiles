/*
Type-Conversion = change the data type of a value to another
(strings to numbers etc)
*/

let age = window.prompt('How old are you?');
console.log(typeof age);
age = Number(age);
age += 1;
console.log('Happy birthday!! You are ', age, " years old");//we we accept user input , from a user its of str type
//age = Number(age); = this concat , changes a string number to int number
//This gets a data type of a variable, console.log(typeof age);
let x,y,z;
x = Number('3.14');//if you convert anything that isn't a number results NaN - Not A Number
console.log(x, typeof x);
y = String(3.14);
console.log(y, typeof y);
z = Boolean('nino');//boolean if you pass ("") results false, but if you type anything ("xyz") - true
console.log(z, typeof z);