/*
Template literals = delimited with (`)
                    instead of double[" "] of single quotes [' ']
                    this allows for embedded variables and expressions
*/
//let user = 'panikies';
//let items = 5;
//let total = 75;
/*
console.log('Hello, ', user);
console.log('You have ',items,' in your cart.');
console.log('Your Total is: ',total);
*/
//using template literals
/*console.log(`Hello ${user}`);
console.log(`You have ${items} items in your cart`);
console.log(`Your total is $${total}`);

//assign the whole embedded text , to a single variable
let displayText = `Hello ${user}
You have ${items} items in your cart
Your total is $${total}`;
console.log(displayText);
//helpful when updating html fies
document.getElementById('mylabel').innerHTML = displayText;
*/
//toLocaleString of numbers - returns a string with a langauge represenatation of that string
//1. number.toLocaleString(locale, {options})
                            //loacale - specify the langauge [undefined is the default of browser]
                            //options = object with formatting options
//let myNum = 123456.789;
let myNum = 125;
//myNum.toLocaleString('en-us');//us-english
//myNum.toLocaleString('hi-IN');//ind-hindu
//myNum.toLocaleString(de-DE);//startdard german

//formatting currency = options
//myNum = myNum.toLocaleString("de-DE", {style: "currency",currency:"EUR"});
//myNum = myNum.toLocaleString("hi-IN", {style: "currency",currency:"INR"});
//myNum = myNum.toLocaleString("en-US", {style: "currency",currency:"USD"});
//HOW TO FORMAT AS A PERCENT
//myNum = myNum.toLocaleString(undefined, {style: "percent"});
//how to format units
myNum = myNum.toLocaleString(undefined, {style: "unit" ,unit:"celsius"});//CELCIUS, MILES ,KG,MG, L, ETC
console.log('toLocale() method ');
console.log(myNum);