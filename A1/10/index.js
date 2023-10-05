//useful string properties and methods
let user = '9ino6ano';
console.log(user);
//display length of string
console.log(user.length,' Characters.');
//the character @
let firstchar = user.charAt(0);
console.log(firstchar, user.charAt(4), 'production`x');
//index of the first + last occurence of a character
console.log('N appears @',user.indexOf('n'));
console.log('N appears Last @',user.lastIndexOf('n'));
//user.trim(), user.toUpperCase() , toLowerCase()
let xname = " PanCake Tha DJ ";
console.log(xname.toLowerCase());
let myName = xname.trim('');
console.log(myName.toUpperCase());
//replacing character in a string
console.log('*-*-*-Phone Number Character replacing*-*-*-')
let phone = '011-410-7452';
console.log(phone.replaceAll('-',"/"));
