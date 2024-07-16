/*
DOM - Document Object Model = API USED FOR CHANGING CONTENT OF PAGE
    - an interface for changing the content of a page
    - representation of the HTML TAG docx.
*/
console.log('1. The DOM ');
/*
console.dir(document);
console.log(document.URL);
console.log(document.title);
//document.title = 'dadfdfdfa';
//document.location = 'https://dfddfdfa';
//this allows you to change any html element with js
document.body.style.backgroundColor = 'skyblue';
document.getElementById('myDiv').innerHTML = "9ino6ano";
*/
console.log('2. Select elements in a webpage');
/*
let element = document.getElementById('mylabel');

element.style.backgroundColor = 'cyan';
*/
//select all radio buttons from the html and change their color
//store the elements in an array
/*
let fruits = document.getElementsByName('fruits');
fruits.forEach(fruit => {
    if(fruit.checked){
        console.log(fruit.value);
    }
})
let veggies = document.getElementsByTagName('li');
veggies[3].style.backgroundColor = "lightgreen";

let desserts = document.getElementsByClassName('desserts');
desserts[2].style.backgroundColor = "red";
//let element = document.querySelector('.desserts'); for accessing a class name, also use elements. querySelector([for])
//let element2 = document.querySelector('mylabel');
//element2.style.backgroundColor = "skyblue";
*/
/*
let ele = document.querySelectorAll('li');
ele.forEach(element => {
    element.style.backgroundColor = 'yellow';
})
let elex = document.querySelectorAll('[for]');
elex.forEach(element => {
    element.style.backgroundColor = 'lightgreen';
})
let eleme = document.querySelectorAll('.desserts');
eleme.forEach(element => {
    element.style.backgroundColor = 'orange';
})
*/
console.log('3. The relationship of elements');
//.1 - firstElementChild
//let element = document.body;
//let child = element.firstElementChild;
//child.style.backgroundColor = 'orange';
//.2 - lastElementChild
//let el = document.body;
//let chi = el.lastElementChild;
//console.log(chi);
//chi.style.backgroundColor = 'yellow';
//.3 - parentElement
//let element = document.querySelector('#vegetables');
//let parent = element.parentElement;
//console.log(parent);
//parent.style.backgroundColor = 'lightgreen';
//.4 - nextElementSibling
//let element = document.querySelector('#fruits');
//let sibling = element.nextElementSibling;
//console.log(sibling);
//sibling.style.backgroundColor = 'orange';
//.5 - previousElementSibling
//let element = document.querySelector('#dairy');
//let sibling = element.previousElementSibling;
//console.log(sibling);
//sibling.style.backgroundColor = 'orange';
//.6 - children[]
//let element = document.querySelector('#dairy');
//let child = element.children[3];
//console.log(child);
//child.style.backgroundColor = 'skyblue';
// 7 - Array.from(.children)
let element = document.querySelector('#vegetables');
let children = Array.from(element.children);
console.log(children);
children.forEach(child => child.style.backgroundColor = 'magenta');

//child.style.backgroundColor = 'skyblue';