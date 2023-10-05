/*
Slice - extracts a portion of a string and returns it 
as a new string, without modifying the original string
*/
let fullname = 'panikies van stouter';
let fname, lname;
//console.log('Hello my full Name is: ',fullname);
//fname = fullname.slice(0,8);
//console.log('First Name : ',fname);
//lname = fullname.slice(9);
//console.log('Last Name : ',lname);
lname = fullname.slice(fullname.indexOf(' ')+1);
console.log('Last Name: ',lname);
fname = fullname.slice(0,fullname.indexOf(' '));
console.log('First Name: ',fname);
