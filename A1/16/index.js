//Fuctions
console.log('-------Functions------');
/*
//define a code once and use it many times.
//to perform the code , you call the function name
//functions use global and local variables depending on the task
let username = 'Panikies';
let age = 25;

//calling the function
happyBirthday();
happyBirthday(username,age);//global variables
happyBirthday("9ino6ano",96);//@passing variables
startprogram();

//declaring the function for usage
function startprogram(){
    //N.Blocal variables cannot be used outside the function
    let start = 1;
    let process = true;
    happyBirthday();
}
//the happy birthday default
function happyBirthday(){
    console.log("Happy Birthday To You");
    console.log("Happy Birthday To You");
    console.log("Happy Birthday Dear______");
    console.log("Happy Birthday To You");
    console.log("You are___ Years Old.");
}
//the happy birthday overrided
//using a function with variables
function happyBirthday(username,userage){
    console.log("Happy Birthday To You");
    console.log("Happy Birthday To You");
    console.log("Happy Birthday Dear",username);
    console.log("Happy Birthday To You");
    console.log("You are",userage,"Years Old.");
}
*/
console.log('Return Functions');
//used within a function to return a value that where the function was called
let area,width,height;

//get the width and height from user
width = window.prompt('Enter a width');
height = window.prompt('Enter a height');
//call the area function and save the return to a area variable
area = getArea(width,height);
//display the functin
console.log('The height is: ',height,"& The width is:",width);
console.log("The area is ",area)
//create the function for getArea
function getArea(width,height){
    let result = width * height;
    return result;
}