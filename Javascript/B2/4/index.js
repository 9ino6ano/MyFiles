//function expressions
/*
sayHello();

const greeting = function(){
    console.log('Yasho, Sharp!!')
}
greeting();
function sayHello(){
    console.log('Hello User!!!');
}
*/
//let count = 0;
/*
function increaseCount(){
    count+=1;
    document.getElementById('mylabel').innerHTML = count;
}
function decreaseCount(){
    count-=1;
    document.getElementById('mylabel').innerHTML = count;
}

//function expression
document.getElementById('increaseBtn').onclick = function(){
    count+=1;
    document.getElementById('mylabel').innerHTML = count;
}
document.getElementById('decreaseBtn').onclick = function(){
    count-=1;
    document.getElementById('mylabel').innerHTML = count;
}*/

//arrow function = compact alternative to a tradional function
const greeting = function(username){
    console.log(`Hello ${username}`);
}

greeting('stouter');
//converting to an arrow function
//N*B* You do not need curly braces{} if your function uses more than 1 statement
const greeting2 = (username) => console.log(`Hello ${username}`);
greeting2('panzo');
//using two elements with the arrow function
const percent = (x,y) => x / y * 100; //the arrow function
console.log(`${percent(45,50)}%`);
//e.g the grades sorting array from before
console.log('The Ascending/Descending Sort Program Using Arrow-Function')
let grades = [100,80,60,40,20,10];
grades.sort(descending);//put the method inside the () for function expression
grades.forEach(print);//put the print method inside ()
grades.sort(ascending);//put asc method inside ()
grades.forEach(print);
//for arrow function
console.log('Changing the function expression into a arrow-function')
grades.sort((x,y) => y - x);
grades.forEach((element) => console.log(element));
function descending(x,y){
    return y - x;
}
function ascending(x,y){
    return x - y;
}
function print(element){
    console.log(element);
}