//a variable is a container for storing data
// the variable behaves , just like the data it stores
/*
this consists of two steps
1.declaration(var, let, const)
2.assignment( = assign operator)
*/
//a variable for entering number data types
let age;
age = 25;
console.log(age +1);
//a variable for storing string input
let fname = "stouter";
let lname = 'Panzo';
let fullname = fname + ' ' + lname;
console.log(fullname);
//boolean datatype
let student = false;// a boolean is one of two values
console.log(student);
//numbers we can use in arithmetic expressions
//strings we cannont, this will concatenate
//we can also display multiple data types
console.log('Hello', fullname);
console.log('You are ', age," years old.");
console.log("Enrolled currently: ",student);
if(student == false){
    console.log("No, Im not currently a student.")
}
else{
    console.log('Yes, Im currently a student.');
}
console.log('----This displays inner html manipulation----');
//manipulating inner html with js
document.getElementById("p1").innerHTML = "Hello, "+ fullname;
document.getElementById("p2").innerHTML = "You are " + age + " years old.";
//doucument.getElementById("p2").innerHTML = "You are " + age + " years old.";
document.getElementById('p3').innerHTML = 'Are You Enrolled : '+ student;