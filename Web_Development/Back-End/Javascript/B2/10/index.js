//promises
//e.g fetching a file

//creating a promise
//the state is pending then fullfilled or rejected; 
//the result is what can be returned... 2 parts of a promise = producing and consuming
/*
const promise = new Promise((resolve,reject) => {//use callbacks,function exp, arrow functions
    //put any async code here
    let fileLoaded = false;
    if(fileLoaded){
        resolve('File Loaded');//if theres args place inside ()
    }
    else{
        reject('The file doesnt exist.')
    }
});
//if promise is resolved the .......
promise.then(value => console.log(value))
                    .catch(error => console.log(error));
//creating a promise that waits for a result
const promise2 = new promise(resolve => {
    setTimeout(resolve,5000);    
});
promise2.then(()=> console.log('Thanks for you patience in our cause.....') );
//passing an argument to a promise
const wait = time => new promise(resolve => {
    setTimeout(resolve,time);    
});
wait(7000).then(()=> console.log('Thanks for waiting.....') );
//promises make asyncs return information like syncs
*/

console.log('The Async Keyword of promises');
//async makes a function return a promise
/*
async function loadFile(){

        //put any async code here
        let fileLoaded = false;
        if(fileLoaded){
            return 'File Loaded';//if theres args place inside ()
        }
        else{
            throw 'The file was not loaded or The file doesnt exist.';
        }
        
    
}
//waiting for an async functin = returns a tring
//you can only use the awaits key words with the async function
async function startProcess(){
try{
    let message = await loadFile();
    console.log(message);
}
catch(error) {
    console.log(error);
}
}
//the awaits keywords
//makes a async function wait for a promise
startProcess();
*/
console.log('Modules');
//think of them as seperate chapters in a book
//helps to make code more reusable and maintainable
//used for any general utility values and functions
//we can import sections of pre-written code whenever
//its a file of reusable pre-written code
//[to input alot of methods/instances use = import * as objMod from "./_math.util.js" ]
//to use these , you access with obj.var
import{PI,getCircumference,getArea} from './Math_util.js';
console.log('PI = ',PI);

let circ = getCircumference(10);
console.log('The Circumference is: ',circ);
let area = getArea(10);
console.log('The Area is: ',area);