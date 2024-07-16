//basic shaffling and sorting of an array 
/*
let cards = ['A','2','3','4','5','6','7','8','9','10','J','K','Q'];

shuffle(cards);//shuffle(cards[0]); this will display the top card
//cards.forEach(card => console.log(card)); //this will shuffle through all cards

//console.log(cards[0]);

function shuffle(array){
    let currentIndex = array.length;

    while(currentIndex != 0){
        let randomIndex = Math.floor(Math.random()* array.length);
        currentIndex -=1;

        let temp= array[currentIndex];
        array[currentIndex] = array[randomIndex];
        array[randomIndex] = temp;
    }
    return array;

}*/
//2.Nested functions = functions inside other functions
//                     other fuctions have access to inner functions 
// and these inner functions are hidden from outside used in closures
/*-
let user = 'Pancake';
let userInbox = 0;
console.log('Nested Functions');
login();
//display thes functions here*
//to ensure data security declare them inside the login function

function login(){
    displayUserName();//to ensure that the login function works
    displayUserInbox();//we pass inner fuctions declared outside of the it
    //although this is not secure because we can still login, by calling the functions directly.
}
function displayUserName(){
    console.log(`Welcome ${user}`);
}
function displayUserInbox(){
    console.log(`You have ${userInbox} new messages.`)
}
*/
//map - an object that holds key-value parts of any data type
const store = new Map([
    ['T-Shirt',20],
    ['Jeans',30],
    ['Scocks',10],
    ['Underwear',25]
]);
console.log('The Map Object')
store.forEach((value,key) => console.log(`${key} : R${value}`));
console.log('The shopping basket');
let shoppingCart = 0;
shoppingCart += store.get('T-Shirt');
shoppingCart += store.get('Jeans');
console.log(`Your Basket Has R${shoppingCart} Total Items.`);
console.log('Insert into the store');
store.set('Hat',40);
store.set('Belt',15);
console.log('Total items in the store.');
store.forEach((value,key) => console.log(`${key} : R${value}`));
console.log('Removing items from the shop');
store.delete('Belt');
console.log('The has method of checking, Boolean');
store.has('Belt');//the has method , check to see if the map has 
console.log(store.size);//check the total number of items in the map
store.forEach((value,key) => console.log(`${key} : R${value}`));
console.log('Check to see if belt was removed.')
store.has('Belt');
