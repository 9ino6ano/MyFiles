/*
ternary operator = shortcut for an if/else statement
takes 3 operands C-? , T-: ,F-' '
*/

//let adult = checkAge(12);
//console.log(adult);
//checkWinner(false);
/*
function checkAge(cAge){
    if(cAge >= 18){
        return true;
    }
    else{
        return false;
    }
}
*/
//using the ternary operator
/*
function checkAge(age){
    return age >= 18 ? true : false;
}
function checkWinner(win){
    win ? console.log('You Win!!!!!!!') :console.log("You lose.");
}
*/
//variable scope - where a variable is accessible
/*
    1. let = variables are limited to a block scope ()
    2. var = variables are limited to a function(){}
    3. global variables - is declare outside any function 
    N.B* (if global, and you declare using var=  this will change the windows properties) for global use let !var
*/
//invoke the function, to test function
doSomething();

function doSomething(){
    for(var j = 1; j <= 3;j++){
       // console.log(j);//true
    }
    //console.log(j);//true
}
//console.log(j);//false
/*----------------------
for(var i=1; i <=3;i++){
    //using let = i can only be accessed inside here
    //console.log(i);
}
    //using var = i outside of declaration of () but not ouside function
    console.log(i);*/