//a function for callback

//let total = sum(2,3);
//displayConsole(total);
//displayDOM(total);
/*
function sum(x,y){
    return x + y;
}
*/
//ENSURES A FUNCTION WONT RUN UNTIL A TASK IS COMPLETE
//this avoids potential errors , when a function loads or a waits for another function
sum(2,3,displayDOM);

function sum(x,y, callback){
    let result = x + y;
    callback(result);
}

function displayConsole(output){
    console.log(output);
}
//DOESNT WORK FOR SOME REASON
function displayDOM(out){
document.getElementById('mylabel').innerHTML = out;
}
