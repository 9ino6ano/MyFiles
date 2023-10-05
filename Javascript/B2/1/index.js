/*
Array - think of it as a variable that can store multiple values
*/
/*
let fruits = ['Apples','Grapes','Oranges','Mangos','Bananas'];
console.log(fruits[5]);
//fruits[0] = 'Coconut';
fruits.push('Lemon');// changes and element at a position
fruits.pop();//removes the last element
fruits.unshift('Mangos');//adds element to the beginning of the array
fruits.shift();//removes an element from the beginning

let Length = fruits.length;//gets the length 
let index = fruits.indexOf('Grapes');//gets the index 
*/
//THE LOOPING THROUGHT AN ARRAY
//console.log('Looping Forwards throught an array')
//let prices = [5,10,15,20,25,30];
/*
for(let i = 0; i < prices.length; i++){
    console.log(prices[i]);//if you dont specify current,,, it will print everything in array @ array.length times
}
console.log('Looping Backwards throught an array')
for(let j = prices.length - 1; j > 0; j--){
    console.log(prices[j]);//if you dont specify current,,, it will print everything in array @ array.length times
}
*///the enhanced for
/*
for(let i of prices){
    console.log(i);
}
for(let itemPrice of prices){
    console.log(itemPrice);
}
*/
/*
console.log('Sorting arrays');
let fruits = ['Apples','Grapes','Oranges','Mangos','Bananas'];
//fruits.sort();//sorting my array in alphabetical order
//fruits.sort().reverse(); sorts my array in reverse-alphabetical order
for(let vrugt of fruits){
    console.log(vrugt);
}
*/
console.log('2D Arrays - Multi`Dimensional Arrays');
let fruits = ['Apples','Grapes','Oranges','Mangos','Bananas'];
let veggies = ['Onions','Kale','Potatoes','Lettuce','Tomatoes'];
let dairy = ['Eggs','Milk','Cheese','Yeast','Flour'];

let groceryList =[fruits,veggies,dairy];
//to access elements in the 2D ARRAY
//groceryList[0][2] = 'Coconut';//2 indices = rows/ columns
//change bananas to 9ino6ano
//groceryList[0][4] = '9ino6ano';
//change potato to chick peas
//groceryList[1][3] = 'Chick_Peas';
//change milk to cream
//groceryList[2][1] = 'Cream';
//this display all the individual lists
/*for(let list of groceryList){
    for(let food of list){
        console.log(food);
    }
    //console.log(list);
}
console.log('-----Lil Boss Bitch, Ice Cold - Turn Up And Flex-----')
console.log('You Know it cost to live like this - #ICE_CREAM');
console.log('Driipppinnnnng Saaauce Like it`s Chilly');
*/
//THE SPREAD OPERATOR = ALLOWS AN ITERABLE SUCH AS AN ARRAY OR STRING TO BE EXPANDED IN PLACES
//WHERE 0 OR MORE ARGUMENTS ARE EXPECTED [UNPACKS ALL ELEMENTS OF ARRAY]
//console.log('The spread operator...')
/*
let numbers = [1,2,3,4,5,6,7,8,9];
let maximum = Math.max(...numbers);
console.log(maximum);

let classA = ['Spongebob','Squidwed','Patrick','Sandy','Mr Krabs'];
let classB = ['Goku','King Kai','Vegeta','Piccolo','Krillen'];

//classA.push(classB);// if its passed like this, it adds the whole array @ 1 index/position
classA.push(...classB);//using the spread operator , puts everything @ array end + 1
console.log(classA);
*/
//rest parameters
console.log('The Rest Operator');
//represants an indefinite number of parameters = packs arguments into an array
let aa = 1;
let bb = 2;
let cc = 3;
let dd = 4;
let ee = 5;

console.log(sum(aa,bb,cc,dd,ee));
/*
function sum(){
    
    if(aa > bb){
        return aa - bb;
    }
    else{
        return bb - aa;
    }
}
function sum(a,b){
    return a + b;
}

function sum(a,b,c){
    return a + b + c;
}
function sum(a,b,c,d,e){
    return a + b + c + d + e;
}
instead of overloading function use the rest function
*///if you input @parameter to rest function , ensure they are placed first before e.g sum(a,b,...numbers)
function sum(...numbers){
    let total = 0;
    //finding a way to access the numbers array created by function
    for(let n of numbers){
        total += n;
    }
    return total;
}