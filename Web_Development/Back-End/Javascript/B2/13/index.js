//changing css elements with js
/*
const title = document.getElementById("myTitle");
title.style.backgroundColor = "#222222";
title.style.color = "lightgreen";
title.style.fontFamily = "consolas";
title.style.textAlign = "center";
title.style.border = "2px solid";
title.style.display = "block";
//events - some action that the user/browser does
//onclick , onload , onchange, mouse over, down,out,up
function doSomething(){
    //alert("You have done something");
    element.style.backgroundColor = "Silver";
}
function doSomethingElse(){
    //alert("You have done something Else");
    element.style.backgroundColor = "gold";
}
//const element = document.getElementById("myButton");
//element.onclick = doSomething();
//const element = document.body;
//element.onload = doSomething;
//const element = document.getElementById("myText");
//element.onchange = doSomething;
const element = document.getElementById("myDiv");
element.onmouseover = doSomething;
element.onmouseout = doSomethingElse;
element.onmousedown = doSomething;
element.onmouseout = doSomethingElse;
*/
//events handling = addeventlistener(event, function, userCapture)
//you can add many event handlers to one element, even the same event that invokes different functions

const innerDiv = document.getElementById("innerDiv");
const outerDiv = document.getElementById("outerDiv");


//innerDiv.addEventListener("mouseover",changeRed);
//innerDiv.addEventListener("mouseout",changeSkyBlue);
innerDiv.addEventListener("click",changeBlue);
outerDiv.addEventListener("click",changeBlue,true);//specify which should take preference
/*
function changeRed(){
    innerDiv.style.backgroundColor = "red";
}
function changeSkyBlue(){
    innerDiv.style.backgroundColor = "skyblue";
}*/
function changeBlue(){
    alert(`You have selected, ${this.id} `)
    this.style.backgroundColor = "blue";
}