/*
Static - a memeber that belongs to a class, not the objects
Properties are useful for caches/fixed configuration
this method is useful for utility functions
*/
console.log('Static Keyword');
/*
class MyCar{
    static numberOfcars = 0;
    constructor(model){
        this.model = model;
        //this.numberOfcars += 1;
        MyCar.numberOfcars += 1;
    }
    static startRace(){
        console.log('3....2....1.....GO!!!')
    }
}

const car1 = new MyCar('Lamborghini');
const car2 = new MyCar('Mclaren P1');
const car3 = new MyCar('Mustang');

//console.log(car1.numberOfcars); this will display the same result , because all of these objects refer to one object
//console.log(car2.numberOfcars);
console.log(MyCar.numberOfcars);
MyCar.startRace();//only accessible by the class not the objects
car1.startRace();
*/
//2.INHERITANCE - A CHILD CLASS INHERITS ALL THE METHODS/PROPERTIES OF THE PARENT CLASS THAT ARE NOT STATIC
//Create 3 classes
//eliminate the need to repeat code, check for what they have in common, and put in a parent class, where children will inherit
//use the extends keyword for inheritance
console.log('Inheritance - a class inherits properties of another class');
//create a parent class that will be inherited by children
class Animal{
    alive = true;
    constructor(name,age){
        this.name = name;
        this.age = age;
    }
    eat(){
        console.log(`This ${this.name} is eating`);
    }
    sleep(){
        console.log(`This ${this.name} is sleeping`);
    }
}
//all properties that are unique to the children , leave them
class Rabbit extends Animal{
    //rabbit class
    //alive = true;
    name = 'Rabbit';
    constructor(name,age,runSpeed){
        //4.create constructor for invoking super(parent)
        //this.name = name;
        //this.age = age;
        super(name,age);
        this.runSpeed = runSpeed;
    }

    //eat(){    console.log(`This ${this.name} is eating`);}
    //sleep(){console.log(`This ${this.name} is sleeping`);}
    run(){
        console.log(`This ${this.name} is running`);
    }
}
//fish class
class Fish extends Animal{
    //alive = true;
    name = 'Fish';
    constructor(name,age,swimSpeed){
        //this.name = name;
        //this.age = age;
        super(name,age);
        this.flySpeed = swimSpeed;
    }
    //eat(){console.log(`This ${this.name} is eating`);}
    //sleep(){console.log(`This ${this.name} is sleeping`);}
    swim(){
        console.log(`This ${this.name} is swimming`);
    }
}
//eagle class
class Eagle extends Animal{
    //alive = true;
    name = 'Eagle';
    constructor(name,age,flySpeed){
        //this.name = name;
        //this.age = age;
        super(name,age);
        this.flySpeed = flySpeed;
    }
    //eat(){console.log(`This ${this.name} is eating`);}
    //sleep(){console.log(`This ${this.name} is sleeping`);}
    fly(){
        console.log(`This ${this.name} is Flying`);
    }
}
//create Super + Sub class objects references
const objRabbit = new Rabbit();
const objFish = new Fish();
const objEagle = new Eagle();

//access properties and methods of parent class
console.log(`1. The ${objRabbit.name}, is alive? ${objRabbit.alive}`);
objRabbit.eat();
objRabbit.sleep();
console.log(`2. The ${objFish.name}, is alive? ${objFish.alive}`);
objFish.eat();
objFish.sleep();
console.log(`3. The ${objEagle.name}, is alive? ${objEagle.alive}`);
objEagle.eat();
objEagle.sleep();
//invoke the unique method inside the child class
console.log('4. Display The Unique Methods')
objEagle.fly();
objFish.swim();
objRabbit.run();
//THE SUPER KEYWORD, WHICH INVOKES THE PARENT CLASS IN ITS SUB-CLASSES
//commonly used to invoke the constructor of the parent class
console.log('The Super keyword....');
//declare and instantiate objects
const rabbit = new Rabbit("Rabbit",2,50);
const fish = new Fish("Fish",4,80);
const eagle = new Eagle("Eagle",8,100);
//display the created objects
console.log('-----------------------')
console.log('Name: ',rabbit.name);//this will result in an error, because the parent constructor is not caught by the children class
console.log('Age: ',rabbit.age, 'years');
console.log('Speed: ',rabbit.runSpeed,'Kmp/h');
console.log('Name: ',fish.name);//this will result in an error, because the parent constructor is not caught by the children class
console.log('Age: ',fish.age, 'years');
console.log('Speed: ',fish.swimSpeed,'Kmp/h');
console.log('Name: ',eagle.name);//this will result in an error, because the parent constructor is not caught by the children class
console.log('Age: ',eagle.age, 'years');
console.log('Speed: ',eagle.flySpeed,'Kmp/h');
console.log('*-*-*--*-*-*-*-*-*-*-*-*');
console.log('Getters + Setters');
//get + set = manipulate properties of a class
class Car{
//ensure that the getters and setters a constructor, this methods are used to access args of a constructor
    constructor(power,gas){
        this._power = power;//use the _power underscore to alert the program of a protected property
        this._gas = gas;
    }
    //by associating a protective, with only a getter = read only 
    get power(){
        return `${this._power} Km/h`;
    }
    //create a setter
    set gas(value){
        if(value > 50){
            value = 50;
            console.log(`${value} ,The Max Value is 50`);
        }else if(value < 0){
            value = 0;
            console.log(`${value} ,The Tank is Empty.`);
        }
        this._gas += value;
    }
    get gas(){
        return `${this._gas} L (${this._gas / 50 * 0.1})%`
    }
}
let objCar1 = new Car(800,125);
console.log(objCar1.power,' @ ',objCar1.gas);
let objCar2 = new Car(80,95);
console.log(objCar2.power,' @ ',objCar2.gas);
//passing objeects to a function as an ags
console.log('________________________');
console.log('Passing objects to a function as args');
class MyCar{
    constructor(model,year,color){
        this._model = model;
        this._year = year;
        this._color = color;
    }
}
//declare objects 3
const mCar1 = new MyCar("Mustang",2020,"Red");
const mCar2 = new MyCar("Porsche Spyder",2021,"Green");
const mCar3 = new MyCar("Ferari-LaFarari",2022,"Gold");
//invoke the function
console.log('*-*-9ino6ano Cars*-*-')
displayInfo(mCar1);
displayInfo(mCar2);
displayInfo(mCar3);
console.log('-*/-*/Modifying Car/*-/*-')
changeColor(mCar1,'Magenta');
displayInfo(mCar1);
changeColor(mCar2,'Silver');
displayInfo(mCar2);
changeColor(mCar3,'Cyan');
displayInfo(mCar3);
//declare the function passing it a class object as an args
function displayInfo(aCar){
    //console.log(`The Car is ${aCar.model}, with a ${aCar.color} of the year ${aCar.year}`);
    //console.log('Car Name: ',aCar.model);
    //console.log("Year: ",aCar.year);
    //console.log('Color: ',aCar.color);
}
//function for changing color ofthe car , takes two parameters
function changeColor(aCar,aColor){
    aCar.color = aColor;
}