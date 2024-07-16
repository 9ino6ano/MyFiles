//the for each element in the array mentod
console.log('The array.forEach()')
/*

let students = ['andy','bill','chris','daniel','enoch'];
students.forEach(capitalize);//this will call the function
students.forEach(print);
function capitalize(element, index, array){
    array[index] = element[0].toUpperCase() + element.substring(1);
}
console.log(students[0]);
function print(element){
    console.log(element);
}*/
//The array.map function
console.log('The array.map() function ')
let numbers = [1,2,3,4,5];
let squares = numbers.map(square);
let cubes   = numbers.map(cube);
console.log('Squared:')
squares.forEach(print);
console.log('Cubed:')
cubes.forEach(print);
//each number of my array was squared
function square(element){//this is a parameter
    return Math.pow(element,2);
}
function print(element){
    console.log(element);
}
function cube(element){
    return Math.pow(element,3);
}
/*
The array filter method = creates a new array with all elements
that pass the test provided by a function
*/
console.log('The Array.Filter() Method');
let ages = [18,16,21,17,19,20];
let adults = ages.filter(checkAge);

adults.forEach(print);

function checkAge(element){
    return element >= 18;
}
function print(element){
    console.log(element);
}
/*
The array.reduce() = reduces an array to a single value
*/
console.log('The array.reduce() function');
let prices = [5,10,15,20,25,30];
let total = prices.reduce(checkOut);
console.log(`The total is: R${total}`);

//create a reduce check function
function checkOut(total, element){
    return total + element;
}
//sorting an array of numbers in asc/desc
let grades = [10,80,45,68,74];
console.log('Descending Order');
grades = grades.sort(descendingSort);
grades.forEach(print);
console.log('Ascending Order');
grades = grades.sort(ascendingSort);
grades.forEach(print);

function descendingSort(x,y){
    return y - x ;
}
function ascendingSort(x,y){
    return x - y;
}
function print(element){
    console.log(element);
}