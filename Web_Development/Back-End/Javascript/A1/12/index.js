//method chaining - calling one method after another
//in one continuos line of code..
/*
let x = 'pancake';
console.log(x);
let letter = x.charAt(0);
console.log("replace: ",x.charAt(0), ' with ',letter);
console.log(x.replace(x.charAt(0),letter.toUpperCase()));
*/
//The if statement -- the order of your conditions is important
/*
let age = 27;
if(age >= 18){
    console.log('You are over 18');
}else if(age < 0){
    console.log('You haven`t been born yet');
}else if(age >= 65){
    console.log('You are a Senior citizen')
}
else if(age >= 30 && age < 65) {
    console.log('You are a Maturing senior adult');
}else if(age => 25 && age <= 30){
    console.log('You are an Adult.');   
}
else{
    console.log('Your age is: ',age,', You are a child, under 18')
}
*/
let online = false;
if(online){
    console.log('You are online');
}
else{
    console.log('You are offline')
}