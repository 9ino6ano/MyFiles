//1.the while loop
//repeats a code while a condition is true
/*
always make sure , to find an way to exit a loop otherwise its an infinite loop

let user1 = "  ";//enter name to exit loop
let user2 = null;
while(user1 == " "){  //user2 == null){
    user1 = window.prompt('Enter your username.');
}
console.log('Hello, ',user1);
*/

//with the while loop we can skip some code if condition is false
//with the the do while loop , we must execute it atleast once
//2.the do while loop
//do something, then check condition, repeat only if condition is met
/*
let user = ""
do{
    user = window.prompt('Enter the name:')
}while(user == "")
console.log("Yasho, ",user);
*/

//3.the for loop
//used when you want to process multiple times
//iteration
//just like java
/*
for(let i = 30; i <= 0; i +=1){
    console.log(i);
}
console.log("Happy new years.....");
for(let count = 1; count <= 10; count+=1){
    console.log(count);
}
console.log('Done.');
*/
//4. the break or continue statements
//breaks out of a loop entirely
//continue = skips a iteraion of aloop
/*
for(let i =1; i <= 20;i++){
    if(i == 13){
        break;
    }
    console.log(i);
}
for(let i =1; i <= 20;i++){
    if(i == 13){
        continue;
    }
    console.log(i);
}
*/

//5. the nested for loops
//a loop inside another loop
/*for(let i = 0; i <= 5; i++){
    for(let j = 0; j <=10; j++)
    console.log(j);
}*/
//2creating a table , with rows + columns
//prompt user for input 

let rows = window.prompt('Enter the rows');
let columns = window.prompt('Enter the columns');
//entering a symbol to emulate a graphical table
let sym = window.prompt('Enter a symbol to use')
for(let i = 1; i <= rows; i++){
    for(let j = 1; j <= columns; j++){
        //console.log(j);
        document.getElementById('mylabel').innerHTML += sym;
    }
    document.getElementById('mylabel').innerHTML += '<br>';
}