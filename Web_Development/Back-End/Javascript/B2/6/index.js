//object orientated programming
/*  e.g Class
    a group of properties and methods
    1.properties - what an object has
    2.Methods - what the object should do whith what it has
    3.'use' [.] to access properties + methods
*/
/*
let car1 = {
    //declaring properties
    model:'Mustang',
    color:'Yellow',
    year:2023,
    //creating methods
    drive : function(){
        console.log('You are Driving The Mustang');
        //console.log(`You are Driving The ${this.model}`); if you dont include the this , it will show an error , using template
    },
    brake: function(){
        console.log(`You are stepping on brake of ${car1.model}`);
    }
}
//e.g car 2
let car2 = {
    //declaring properties
    model:'Ferari la farari',
    color:'Red',
    year:2024,
    //creating methods
    drive : function(){
        console.log('You are Driving The La-Farari');
        //console.log(`You are Driving The ${this.model}`); or in pace of this use the class name e.g car2.model
    },
    brake: function(){
        console.log(`You are stepping on brake of the ${car2.model}`);
    }
}
console.log('+-+-+-9ino6ano Cars-+-+-+');
//invoking properties of the car class as an object
console.log(car1.model);
console.log(car1.color);
console.log(car1.year);
console.log('How fast are we travelling');
//invoking methods of the car class
car1.drive();
car2.brake();
car1.brake();
car2.drive();
car1.drive();
car2.brake();
car1.drive();
car2.drive();
//.2 The this key word
console.log('The This Keyword');
car1.drive();
car2.drive();
console.log(this);//outside of any object, this refers to the window context, which can change the window name properties
*/
//3.Blueprints for creating objects
//define what properties and methods they have a constructor for unique properties
console.log('Classes - BluePrints for objects');
class Player{

    score = 0;

    pause(){
        console.log('You paused the game.');
    }
    exit(){
        console.log('You exited the game.');
    }
}
//create class objects to access the class properties
const p1 = new Player();
const p2 = new Player();
const p3 = new Player();
const p4 = new Player();

//invoke the class methods, using objects
p1.score += 1;
p1.pause();
p2.score += 2;
p2.exit();
p3.score += 3;
p3.pause();
p4.score += 4;
p4.exit();
//displaying the data
console.log('*-*-The Players of the game-*-*')
console.log('The score for player 1 is',p1.score);
console.log('The score for player 2 is',p2.score);
console.log('The score for player 3 is',p3.score);
console.log('The score for player 4 is',p4.score);
//4. USING CONSTRUCTORS  IN A CLASS
//A SPECIAL METHOD OF A CLASS, THAT ACCEPTS ARGS AND ASSINGN PROPERTIES OF CLASS TO THE ARGS
class Student{
    constructor(name,age,gps){
        this.name = name;
        this.age = age;
        this.gps = gps;
    }
    study(){
        console.log(`${this.name}, is still studying...`)
    }
}
//creating the class objects to access
const s1 = new Student('PanCake Tha DJ',26,3.2);
const s2 = new Student('Stoute PaNzo',25,1.52);
//dipslaying the properties passed as args of the class
console.log('+-+-The 9ino6ano Academy-+-+')
console.log('Name: ',s1.name);
console.log('Age: ',s1.age);
console.log('GPS: ',s1.gps);
s1.study();
console.log('Name: ',s2.name);
console.log('Age: ',s2.age);
console.log('GPS: ',s2.gps);
s2.study();