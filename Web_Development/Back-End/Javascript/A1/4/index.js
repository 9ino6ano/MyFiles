//how to accept user input
/*
1. with a window prompt
2. using an html text box
*/

//1. the easy way
//let user = window.prompt('What`s your name? ');
//console.log(user);
//2. the difficult way

let username;
document.getElementById('mybutton').onclick = function(){
    username = document.getElementById('mytext').value;
    console.log(username);
    document.getElementById('mylabel').innerHTML = 'YASHO ' + username;
}