//creating an array of objects
console.log('1.Array of objects');
/*
class Car{
    constructor(model,color,year){
        this.model = model;
        this.color = color;
        this.year = year;
    }
    drive(){
        console.log(`The ${this.model} is driving....`)
    }
}
const carA = new Car('Ferari-LaFarari','Red',2020);
const carB = new Car('Lamborghini','Green',2021);
const carC = new Car('McLaren_P1','Blue',2022);
const carD = new Car('Porsche','Black',2023);

//create an array of cars
const MyCars = [carA,carB,carC,carD];
//display elements
console.log(MyCars);
console.log(MyCars[0].color);//to access property or method use [.]
console.log(MyCars[1].model);
//invoking the drive method
MyCars[0].drive();
MyCars[1].drive();
MyCars[2].drive();

// invoke the start race method
startRace(MyCars);
//creating a racing simulation, Every car will use this drive method
function startRace(MyCars){
    for(const objCar of MyCars){
        objCar.drive();
    }
}
*/
console.log('2.Anonymous array of objects');
//ANONYMOUS OBJECTS - objects without a name,not directly referenced
//less syntax needed, no need for unique access
/*
class Card{
    constructor(value, suit){
        this.value = value;
        this.suit = suit;
    }
}
//create 8 objects
/*
no need to create each object, pass the reference as a object instantiation inside the array
let card1 = new Card('A','Hearts');
let card2 = new Card('A','Spades');
let card3 = new Card('A','Diamonds');
let card4 = new Card('A','Clubs');
let card5 = new Card('2','Hearts');
let card6 = new Card('2','Spades');
let card7 = new Card('2','Diamonds');
let card8 = new Card('2','Clubs');
let deckCards = [card1,card2,card3,card4,card5,card6,card7,card8];
*/
//add the objects to a deck array, these have no name so we cant access them directly , only indirectly
/*
let deckCards = [new Card('A','Hearts'),
                 new Card('2','Spades'),
                 new Card('3','Diamonds'),
                 new Card('4','Clubs'),
                 new Card('5','Hearts'),
                 new Card('6','Spades'),
                 new Card('7','Diamonds'),
                 new Card('8','Clubs'),
                 new Card('9','Hearts'),
                 new Card('J','Spades'),
                 new Card('K','Diamonds'),
                 new Card('Q','Clubs'),
                 new Card('$','96')];
//display the deck- to access cards directly = array name or by array element
console.log(deckCards);
//console.log(card1.value,'of', card1.suit);//direct access by object name
console.log(deckCards[0],'of',deckCards[0]);//indirect access by array
console.log(deckCards[8],'of',deckCards[8]);
//display all the cards in the array 
deckCards.forEach(Card => console.log(Card.value,' of ',Card.suit));
*/
//Error Handling = exceptions
//e.g cant open file, error connecting, incorrect user inputs, typeerror
//surround these codes with a try block
console.log('3.Error Handling [Excepitons]');
/*
try{
    let x = window.prompt('Enter a Number:');
    x = Number(x);

    //user defined errors
    if(isNaN(x)) throw `${x} IS NOT A NUMBER!!!!`//E.G entering pizza instead of number error
    if(x == '') throw 'You Must Input A Number.'
    
    console.log(`${x} is a number....`);

}catch(error) {
    console.log(error);
}
finally{//this wil execute regardless of error
    console.log('This always executes [finally] ');
}
*/
console.log('4. Set Timeout method.');
//setTimeout = invokes a function after a number of milliseconds
//asynchronous function meaning it doesnt stop program when running
//you can pass in a functin exp , a callback or an arrow function
//passing variables as args of the setTime method
/*
let item = 'Cryto Currency';
let price = 425;

let time1 = setTimeout(firstMessage,3000);
let time2 = setTimeout(secondMessage,6000);
let time3 = setTimeout(thirdMessage,9000);
//setTimeout(firstMessage,3000);
//setTimeout(secondMessage,6000);
//setTimeout(thirdMessage,9000);
//to clear , call the set time clear

//create functions
function firstMessage(){
    alert(`Buy this ${item} for $${price}`);
}
function secondMessage(){
    alert(`Clik Here!! This is ${item} not a scam.`);
}
function thirdMessage(){
    alert(`Your Computer has a R${price} virus.`);
}
//creating button 
document.getElementById('myButton').onclick = function(){
    clearTimeout(time1);
    clearTimeout(time2);
    clearTimeout(time3);
    alert('Just Do It, Time is The Enemy & Death its friend.');
}
*/
console.log('5. SetInterval method.');
/*
let count = 0;
let max = window.prompt('Count Up to No.?..');
max = Number(max);
//this stores the id of the set interval method
const myTimerIntID = setInterval(countUp,1000);

function countUp(){
    count += 1;
    console.log(count)
    if(count >= max){
        clearInterval(myTimerIntID);
    }
}
*/
console.log('6. Set Date Object');
//this used to work with dates and times
//let date = new Date(10000000000000);//pass milliseconds as an args
//let date = new Date(2025,5,2,6,5,3,2);//year,month,day,hours,minutes,seconds,milliseconds
//let date = new Date('December 7, 2022 07:15:30');
let date = new Date(100000000000);
let year = date.getFullYear();
let month = date.getMonth();
let day = date.getDate();
console.log('First Date -',date);
console.log('First Year Date -',year);
console.log('First Month Date -',month);//getTime = getmilliseconds,getseconds,getminutes,gethours
console.log('First DAY Date -',day);//you can also set.........
date = date.toLocaleDateString();
console.log('Second Date',date);//read in binary via military time
console.log('Second Year Date -',year);
console.log('First Month Date -',month);
console.log('First DAY Date -',day);
//for the date object if you dont specify args, it returs current date
//if you do specify args e.g [0] - epic : the date when time started 1969
//changing the inner html of the date label
//document.getElementById('mylabel').innerHTML = date +'______# in ' +year+' @ '+ month+' month, on '+day+" day.";
document.getElementById('mylabel').innerHTML = date;
//creating a function to format the date
function formatDate(date){
let ayear = date.getFullYear();
let amonth = date.getMonth();
let aday = date.getDate();
return `@${ayear}|||#${amonth}|||*${aday}`;
}
function formatTime(date){}//get time methods-seconds,hours,minutes
//amOrpm = hours >= 12? "pm" : am
//hours = (hours % 12) || 12 ....this will cahnge from military time to standard time
// return formatted time ......