/*
Window = an interface used to talk with the web browser,
the D.O.M is a property of the window
*/
//console.dir(window);
console.log("console.dir(window)")
console.dir("Inner Width - ",window.innerWidth);
console.dir("Inner Height - ",window.innerHeight);
console.dir("Outer Width - ",window.outerWidth);
console.dir("Outer Height - ",window.outerHeight);
//showing the scroll bars x,y
console.log("Scroll of X: ",window.scrollX);
console.log("Scroll of Y: ",window.scrollY);
//changing the href
console.log("href : ",window.location.href);
//window.location.href = "https://www.google.com";
console.log("href host: ",window.location.hostname);
console.log("href path: ",window.location.pathname);
//selecting the button
const mybtn = document.querySelector("#myButton");
mybtn.addEventListener("click", () => window.open("https://www.google.com"));//redirects this tab to the passed href
//mybtn.addEventListener("click", () => window.close()); closes the current window
//mybtn.addEventListener("click", () => window.print()); prints the current page
//a few input/boxes or window prompts
//window.alert("9ino6ano");
//window.confirm("Press Ok to COntinue");
//window.prompt("Please enter your information.");
/*
let age = window.prompt("Please enter your Age.");
age = Number(age);
if(age <=18){
    window.alert("You must be +18 to visit this page.");
    window.close();
}*/
//2. COOKIES = A SMALL TEXT FILE STORED ON YOUR COMPUTER
//              THIS IS USED TO REMEMBER INFORMATION ABOUT THE USER SAVED IN name = value pairs.
console.log("____Cookies____");
console.log('Cookie Enabled ?',navigator.cookieEnabled);
//to add a cookie
// needs a name ref, date , path
//to override a cookie you need to change the name=value property
//if you pass a date that has expired , it will delete the portion of the cookie
document.cookie = "firstName=PanCake; expires=Sun, 1 January 2030 12:00:00 UTC; path = /";
document.cookie = "lastName=Tha DJ; expires=Sun, 1 January 2030 12:00:00 UTC; path = /";
console.log("1st Cookie: ",document.cookie);

setCookie("email","PanCake@9ino6ano.com",365);
console.log("2nd Cookie: ",document.cookie);
deleteCookie("email");
console.log("3rd: Cookie: ",document.cookie);
deleteCookie("firstName");
console.log("4th: Cookie: ",document.cookie);
deleteCookie("lastName");
console.log("5th: Cookie: ",document.cookie);
deleteCookie("latName");
console.log('Current: ',document.cookie);
//create 2 more cookies to decode
//using the get cookie method
setCookie("firsName","Panikies",365);
setCookie("lastName","van Stouter",365);

console.log('Usng the get method');
console.log(getCookie("firstName"));
console.log(getCookie("lastName"));
//returns the name + last name formatted without ;
//creating the buttons + text fields
const fText = document.querySelector("#firstText");
const lText = document.querySelector("#lastText");
const ProcBtn = document.querySelector("#myButtonProc");
const GetBtn = document.querySelector("#getCookieBtn");
//delete the cookies already existing
console.log("@B Current Cookie : ",document.cookie);
deleteCookie("firstName");
deleteCookie("lastName");
deleteCookie("firsName");

console.log("A@ Current Cookie : ",document.cookie);
//after clearing cookies use the text inputs
ProcBtn.addEventListener("click", () => {
    setCookie("firstName", fText.value, 365);
    setCookie("lastName", lText.value, 365);
})
GetBtn.addEventListener("click", () => {
    fText.value = getCookie("firstName");
    lText.value = getCookie("lastName");
})

function setCookie(name,value,daysToLive){
    const date = new Date();
    date.setTime(date.getTime() * daysToLive * 24 * 60 * 60 * 1000);
    let expires = "expires="+date.toUTCString();
    document.cookie = `${name} = ${value}; ${expires}; path=/ `;
}
function deleteCookie(name){
    setCookie(name, null, null);
}
function getCookie(name){
    const cDecoded = decodeURIComponent(document.cookie);
    const cArray = cDecoded.split(";");
    console.log(cArray);

    let result = null;

    cArray.forEach(element => {
        if(element.indexOf(name) == 0){
            result = element.substring(name.length + 1)
        }
    })
    return result;
}